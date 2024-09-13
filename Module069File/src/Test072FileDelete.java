import java.io.File;
import java.io.IOException;

public class Test072FileDelete {
    public static void main(String[] args) throws IOException {
        File f1 = new File("TestOfBili\\src\\Module069File\\javatest.txt");
        System.out.println(f1.createNewFile());
        System.out.println("--------");

        System.out.println(f1.delete());
        System.out.println("--------");

        File f2 = new File("TestOfBili\\Demo.txt");
//        System.out.println(f2.mkdir());

        System.out.println(f2.delete());
        System.out.println("--------");

        File f3 = new File("TestOfBili\\Demo.txt");
        System.out.println(f3.mkdir());

        File f4 = new File("TestOfBili\\Demo.txt\\java.txt");
        System.out.println(f4.createNewFile());

        System.out.println(f4.delete());
        System.out.println(f3.delete());//应该先删除目录的内容再删除目录
    }
}
