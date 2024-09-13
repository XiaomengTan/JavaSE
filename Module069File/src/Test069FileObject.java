import java.io.File;

public class Test069FileObject {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\morea\\Desktop\\forfiletest\\java.txt");
        System.out.println(f1);

        File f2 = new File("C:\\Users\\morea\\Desktop\\forfiletest", "java.txt");
        System.out.println(f2);

        File f3 = new File("C:\\Users\\morea\\Desktop\\forfiletest");
        File f4 = new File(f3,"java.txt");
        System.out.println(f4);
    }
}
