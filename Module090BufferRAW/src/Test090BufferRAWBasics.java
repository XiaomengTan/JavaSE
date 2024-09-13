import java.io.*;

public class Test090BufferRAWBasics {
    public static void main(String[] args) throws IOException {
//        FileWriter fw = new FileWriter("TestOfBili\\src\\Module083IOStreamOrFileRAW\\Test090BufferRAWBasics\\Demo.txt");
//        BufferedWriter bw = new BufferedWriter(fw);
//        BufferedWriter bw = new BufferedWriter(new FileWriter("TestOfBili\\src\\Module083IOStreamOrFileRAW\\Test090BufferRAWBasics\\Demo.txt"));
//        bw.write("hello\r\n");
//        bw.write("world\r\n");
//        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("TestOfBili\\src\\Module083IOStreamOrFileRAW\\Test090BufferRAWBasics\\Demo.txt"));
        //一次读取一个字符数据
//        int ch;
//        while ((ch = br.read())!=-1){
//            System.out.print((char) ch);
//        }

        //一次读取一个字符数组数据
        char[] chs = new char[1024];
        int len;
        while ((len = br.read(chs))!=-1){
            System.out.print(new String(chs,0,len));
        }


        br.close();
    }
}
