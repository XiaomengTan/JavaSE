package Test097PrintStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test100PrintWriter {
    public static void main(String[] args) throws IOException {
        //PrintWriter(String fileName):使用指定文件名创建一个新的PrintWriter而不需要自动执行刷新
//        PrintWriter pw = new PrintWriter("TestOfBili\\src\\TXTsort\\Test111.txt");

//        pw.write("hello");
//        pw.write("\r\n");
//        pw.flush();
//        pw.write("world");
//        pw.write("\r\n");
//        pw.flush();

//        pw.println("hello");
        /*
            pw.write("hello");
            pw.write("\r\n");
         */
//        pw.flush();
//        pw.println("world");
//        pw.flush();

        //PrintWriter(Writer out, boolean autoFlush)创建一个新的PrintWriter
        PrintWriter pw = new PrintWriter(new FileWriter("TestOfBili\\src\\TXTsort\\Test111.txt"),true);

        pw.println("hello");
        /*
            pw.write("hello");
            pw.write("\r\n");
            pw.flush();
         */
        pw.println("world");

        pw.close();
    }
}
