package Test132TxtToRecallThread;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //创建客户端的Socket对象(Socket)
        Socket s = new Socket("10.202.45.150", 18417);

        //封装文本文件数据
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\morea\\Desktop\\File Transfer Station\\code\\Java\\JavaProjects\\BasicClassCode\\Assist\\src\\TXTsort\\Test135in.txt"));

        //封装输出流写数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line = br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

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
