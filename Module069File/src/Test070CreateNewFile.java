import java.io.File;
import java.io.IOException;

public class Test070CreateNewFile {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\morea\\Desktop\\forfiletest\\java.txt");
        System.out.println(f1.createNewFile());//创建新文件
        System.out.println("--------");

        File f2 = new File("C:\\Users\\morea\\Desktop\\forfiletest\\javase");
        System.out.println(f2.mkdir());//创建新目录
        System.out.println("--------");

        File f3 = new File("C:\\Users\\morea\\Desktop\\forfiletest\\javaWEB\\HTML");
//        System.out.println(f3.mkdir());
        System.out.println(f3.mkdirs());//自动如果父目录不存在则自动创建
        System.out.println("--------");

        File f4 = new File("C:\\Users\\morea\\Desktop\\forfiletest\\javase.txt");
//        System.out.println(f4.mkdir());//因为这是创建目录的方法
        System.out.println(f4.createNewFile());//不能重名，包括目录和文件
    }
}
