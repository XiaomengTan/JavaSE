import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test086IPStreamReader {
    public static void main(String[] args) throws IOException {
        //创建字符输入流对象
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("TestOfBili\\src\\Module083IOStreamOrFileRAW\\Test086IPStreamReader\\Demo.txt"));
        InputStreamReader isr = new InputStreamReader(new FileInputStream("TestOfBili\\src\\Module083IOStreamOrFileRAW\\Test083CharacterSet.java"));

        //一次读取一个字符
//        int ch;
//        while ((ch = isr.read()) != -1) {
//            System.out.print((char) ch);
//        }

        //一次读取一个字符数组
        char[] chs = new char[1024];
        int len;
        while ((len = isr.read(chs))!=-1){
            System.out.print(new String(chs,0,len));
        }

        //释放资源
        isr.close();
    }
}
