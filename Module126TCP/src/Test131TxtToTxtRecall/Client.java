package Test131TxtToTxtRecall;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //创建客户端的Socket对象(Socket)
        Socket s = new Socket("10.202.0.24", 10000);

        //封装文本文件数据
        BufferedReader br = new BufferedReader(new FileReader("TestOfBili\\src\\TXTsort\\Test135in.txt"));

        //封装输出流写数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line = br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

//        System.out.println(22222);

        //自定义结束标记
//        bw.write("886");
//        bw.newLine();
//        bw.flush();//缺点，如果内容与结束符一致，则可能错误终止服务器

        //void shutdownOutput() 禁用此套接字的输出流。
        s.shutdownOutput();


        //给出反馈
        BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data = brClient.readLine();//等待读取数据
        System.out.println("服务器反馈"+data);

        //释放资源
        bw.close();//注意
        s.close();
    }
}
