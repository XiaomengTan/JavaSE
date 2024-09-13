package Test097PrintStream;

import java.io.IOException;
import java.io.PrintStream;

public class Test099PrintStream {
    public static void main(String[] args) throws IOException {
        //字节打印流PrintStream(String fileName)使用指定文件名创建新的打印流
        PrintStream ps = new PrintStream("TestOfBili\\src\\TXTsort\\Test110.txt");

        //写数据
        //字节输出流有的方法
        ps.write(97);//有转码操作

        //使用特有方法写数据
//        ps.print(97);
//        ps.print(98);
        ps.println(97);
        ps.println(98);//原样输出

        //释放资源
        ps.close();
    }
}
