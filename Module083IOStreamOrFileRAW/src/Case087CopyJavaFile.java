import java.io.*;

public class Case087CopyJavaFile {
    public static void main(String[] args) throws IOException {
        //创建字符输入流对象
        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\morea\\Desktop\\File Transfer Station\\code\\Java\\JavaProjects\\TestOfBili\\src\\Module083IOStreamOrFileRAW\\Test083CharacterSet.java"));

        //创建字符输出流对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\morea\\Desktop\\File Transfer Station\\code\\Java\\JavaProjects\\TestOfBili\\src\\Module083IOStreamOrFileRAW\\OutputFile.java"));

        //执行复制写入操作，一次一个字符
        int ch;
        while ((ch = isr.read())!=-1){
            osw.write(ch);
        }

        //执行复制写入操作，一次一个字符数组
//        char[] chs = new char[1024];
//        int len;
//        while ((len = isr.read(chs))!=-1){
//            osw.write(chs,0,len);
//        }

        //释放资源
        isr.close();
        osw.close();
    }
}
