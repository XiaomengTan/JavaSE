import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test089DealIOExceptionInMethod {
    public static void main(String[] args) throws IOException {
        method1();
    }

    //JDK9新增的改进方案
    public static void method4() throws IOException{//仍然要抛出异常，大可不必
        FileWriter fw = new FileWriter("TestOfBili\\src\\TXTsort\\Test107w.txt");
        FileReader fr = new FileReader("TestOfBili\\src\\TXTsort\\Test107r.txt");
        try (fw;fr){
            char[] chs = new char[1024];
            int len;
            while ((len = fr.read(chs)) != -1) {
                fw.write(chs, 0, len);
            }
//            fw.close();
//            fr.close();//不再需要，自动释放资源
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    //JDK7以后的改进方案，首选
    public static void method3() {
        try (FileWriter fw = new FileWriter("TestOfBili\\src\\TXTsort\\Test107w.txt");
             FileReader fr = new FileReader("TestOfBili\\src\\TXTsort\\Test107r.txt");){
            char[] chs = new char[1024];
            int len;
            while ((len = fr.read(chs)) != -1) {
                fw.write(chs, 0, len);
            }
//            fw.close();
//            fr.close();//不再需要，自动释放资源
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    //try-catch-finally处理
    public static void method2() {
        FileWriter fw = null;
        FileReader fr = null;
        try {
            fw = new FileWriter("TestOfBili\\src\\TXTsort\\Test107w.txt");
            fr = new FileReader("TestOfBili\\src\\TXTsort\\Test107r.txt");

            char[] chs = new char[1024];
            int len;
            while ((len = fr.read(chs)) != -1) {
                fw.write(chs, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fw!=null) {
                try {
                    fw.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
            if(fr!=null) {
                try {
                    fr.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

    //抛出处理
    public static void method1() throws IOException {
        FileWriter fw = new FileWriter("TestOfBili\\src\\TXTsort\\Test107w.txt");
        FileReader fr = new FileReader("TestOfBili\\src\\TXTsort\\Test107r.txt");

        char[] chs = new char[1024];
        int len;
        while ((len = fr.read(chs)) != -1) {
            fw.write(chs, 0, len);
        }

        fw.close();
        fr.close();
    }
}
