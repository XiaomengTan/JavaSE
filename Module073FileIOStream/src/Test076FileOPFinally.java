import java.io.FileOutputStream;
import java.io.IOException;

public class Test076FileOPFinally {
    public static void main(String[] args) {
        //try-catch-finally处理io异常
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("TestOfBili\\src\\Module073FileIOStream\\Output\\in.txt");
//            fos = new FileOutputStream("Z:\\TestOfBili\\src\\Module073FileIOStream\\Output\\in.txt");
            fos.write("hello".getBytes());//获取字符串的字节流数组并写入
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
