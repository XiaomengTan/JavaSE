import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Case094ArrayListToTxt {
    public static void main(String[] args) throws IOException {
        //创建ArrayList集合
        ArrayList<String> array = new ArrayList<>();

        //往集合中添加元素
        array.add("hello");
        array.add("world");
        array.add("java");

        //创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("TestOfBili\\src\\TXTsort\\Test99.txt"));

        //写数据
        for(String s : array){
            bw.write(s);
            bw.newLine();
            bw.flush();
        }

        //释放资源
        bw.close();

        //输出
        for(String s : array){
            System.out.println(s);
        }
    }
}
