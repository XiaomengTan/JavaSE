package Test097PrintStream;

import java.io.*;

public class Test101CopyJavaFile {
    public static void main(String[] args) throws IOException {
        /*
        //根据数据源创建字符输入流对象
        BufferedReader br = new BufferedReader(new FileReader("TestOfBili\\src\\TXTsort\\Test112in.java"));

        //根据目的地创建字符输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("TestOfBili\\src\\Test097PrintStream\\Test101CopyJavaFile\\Test112out.java"));

        //读写数据，复制文件
        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //释放资源
        br.close();
        bw.close();
         */

        //字符打印流PrintWriter改进
        //根据数据源创建字符输入流对象
        BufferedReader br = new BufferedReader(new FileReader("TestOfBili\\src\\TXTsort\\Test112in.java"));

        //根据目的地创建字符输出流对象
        PrintWriter pw = new PrintWriter(new FileWriter("TestOfBili\\src\\Test097PrintStream\\Test101CopyJavaFile\\Test112out.java"),true);

        //读写数据，复制文件
        String line;
        while ((line = br.readLine()) != null) {
            pw.println(line);
        }

        //释放资源
        br.close();
        pw.close();
    }
}
