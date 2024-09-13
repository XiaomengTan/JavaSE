import java.io.*;

public class Test084IOStreamRAWBasics {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStream("TestOfBili\\src\\Module083IOStreamOrFileRAW\\Test084IOStreamRAWBasics\\Demo.txt");
//        OutputStreamWriter osw = new OutputStreamWriter(fos);
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("TestOfBili\\src\\Module083IOStreamOrFileRAW\\Test084IOStreamRAWBasics\\Demo.txt"));
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("TestOfBili\\src\\Module083IOStreamOrFileRAW\\Test084IOStreamRAWBasics\\Demo.txt"),"UTF-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("TestOfBili\\src\\Module083IOStreamOrFileRAW\\Test084IOStreamRAWBasics\\Demo.txt"),"GBK");
        osw.write("中国");
        osw.close();

//        InputStreamReader isr = new InputStreamReader(new FileInputStream("TestOfBili\\src\\Module083IOStreamOrFileRAW\\Test084IOStreamRAWBasics\\Demo.txt"));
        InputStreamReader isr = new InputStreamReader(new FileInputStream("TestOfBili\\src\\Module083IOStreamOrFileRAW\\Test084IOStreamRAWBasics\\Demo.txt"),"GBK");

        int ch;
        while((ch = isr.read())!=-1){
            System.out.print((char)ch);//可以发现，读取一个输出一个是不会出问题的，因为以负数编码开头的字符一定是中文，会自动读取后面的编码拼接成中文
        }
        isr.close();
    }
}
