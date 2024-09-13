package Test132TxtToRecallThread;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable {
    private Socket s;

    public ServerThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            //接收数据，写到文本文件
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//            BufferedWriter bw = new BufferedWriter(new FileWriter("TestOfBili\\src\\TXTsort\\Test136out.txt"));
            //解决名称冲突问题
            int count = 1;
            File file = new File("TestOfBili\\src\\TXTsort\\Test137\\Test137[" + count + "]out.txt");
            while (file.exists()) {
                count++;
                file = new File("TestOfBili\\src\\TXTsort\\Test137\\Test137[" + count + "]out.txt");
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(file));

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

            //给出反馈
            BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bwServer.write("文件上传成功");
            bwServer.newLine();
            bwServer.flush();

            //释放资源
            s.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
