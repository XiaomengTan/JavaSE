import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Case095TxtToArrayList {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\morea\\Desktop\\File Transfer Station\\code\\Java\\JavaProjects\\TestOfBili\\src\\TXTsort\\Test100.txt"));

        //创建集合对象
        ArrayList<String> array = new ArrayList<>();

        //读数据
        String line;
        while ((line = br.readLine())!=null){
            array.add(line);
        }

        //关流
        br.close();

    }
}
