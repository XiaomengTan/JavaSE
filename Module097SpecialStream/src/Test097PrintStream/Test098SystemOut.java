package Test097PrintStream;

import java.io.PrintStream;

public class Test098SystemOut {
    public static void main(String[] args) {
        PrintStream ps = System.out;

//        ps.print("hello");
//        ps.print(100);

//        ps.println("hello");
//        ps.println(100);

        //底层是字节输出流
        System.out.println("hello");
        System.out.println("world");
    }
}
