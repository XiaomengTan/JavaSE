import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Case096CallTheRoll {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("TestOfBili\\src\\TXTsort\\Test101Name.txt"));

        //创建ArrayList集合对象
        ArrayList<String> array = new ArrayList<>();

        //读取数据并存储到集合中
        String line;
        while ((line = br.readLine())!=null){
            array.add(line);
        }

        //释放资源
        br.close();

        //创建随机数对象
        Random r = new Random();
        int index = r.nextInt(array.size());

        //输出结果
        System.out.println("幸运者是：" + array.get(index));

    }
}
