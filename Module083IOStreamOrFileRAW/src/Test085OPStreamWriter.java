import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Test085OPStreamWriter {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("TestOfBili\\src\\Module083IOStreamOrFileRAW\\Test085OPStreamWriter\\Demo.txt"));

        //写一个字符
//        osw.write(97);
//        osw.flush();
//        osw.write(98);
//        osw.flush();
//        osw.write(99);
//        osw.flush();//只刷新
//        osw.write(100);

        //写一个字符数组
        char[] chs = {'a','b','c','d','e'};
//        osw.write(chs);

        //写入字符数组的一部分
//        osw.write(chs,0,chs.length);
//        osw.write(chs,1,3);

        //一次写一个字符串
//        osw.write("abcde");

        //一次写一个字符串的一部分
        osw.write("abcde",1,3);

        //关流
        osw.close();//刷新并回收资源
    }
}
