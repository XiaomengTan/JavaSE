import java.io.*;

public class Test092BufferRAWSpecial {
    public static void main(String[] args) throws IOException {
        /*BufferedWriter bw = new BufferedWriter(new FileWriter("TestOfBili\\src\\Module083IOStreamOrFileRAW\\Test092BufferRAWSpecial\\Demo.txt"));

        for(int i = 0;i < 10;i++){
            bw.write("hello"+i);
//            bw.write("\r\n");
            bw.newLine();
            bw.flush();
        }

        bw.close();*/

        BufferedReader br = new BufferedReader(new FileReader("TestOfBili\\src\\Module083IOStreamOrFileRAW\\Test092BufferRAWSpecial\\Demo.txt"));
/*

        //第一次读取数据
        String line = br.readLine();
        System.out.println(line);

        //第二次读取数据
        line = br.readLine();
        System.out.println(line);

        //再多读两次
        line = br.readLine();
        System.out.println(line);

        line = br.readLine();
        System.out.println(line);
*/

        //循环改进
        String line;
        while((line = br.readLine())!=null){
            System.out.println(line);//readLine()不包含换行符
        }

        br.close();
    }
}
