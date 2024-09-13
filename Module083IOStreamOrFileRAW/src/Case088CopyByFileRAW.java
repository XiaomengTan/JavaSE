import java.io.*;

public class Case088CopyByFileRAW {
    public static void main(String[] args) throws IOException {
        /*
            代替了InputStreamReader和OutputStreamWriter
         */

        //创建字符输入流对象
        FileReader fr = new FileReader("TestOfBili\\src\\Module083IOStreamOrFileRAW\\Test083CharacterSet.java");

        //创建字符输出流对象
        FileWriter fw = new FileWriter("TestOfBili\\src\\Module083IOStreamOrFileRAW\\OutputFile.java");

        //执行复制写入操作，一次一个字符
        int ch;
        while ((ch = fr.read())!=-1){
            fw.write(ch);
        }

        //执行复制写入操作，一次一个字符数组
        char[] chs = new char[1024];
        int len;
        while ((len = fr.read(chs))!=-1){
            fw.write(chs,0,len);
        }

        //释放资源
        fr.close();
        fw.close();
    }
}
