import java.io.*;

public class Case91CopyByBufferRAW {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("TestOfBili\\src\\Module083IOStreamOrFileRAW\\Test083CharacterSet.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("TestOfBili\\src\\Module083IOStreamOrFileRAW\\OutputFile.java"));

        //一次一个字符
//        int ch;
//        while ((ch = br.read())!=-1){
//            bw.write(ch);
//        }

        //一次一个字符数组
        char[] chs = new char[1024];
        int len;
        while ((len = br.read(chs))!=-1){
            bw.write(chs,0,len);
        }

        //释放资源
        br.close();
        bw.close();
    }
}
