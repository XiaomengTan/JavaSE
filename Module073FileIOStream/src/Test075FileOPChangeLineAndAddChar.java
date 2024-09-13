import java.io.FileOutputStream;
import java.io.IOException;

public class Test075FileOPChangeLineAndAddChar {
    public static void main(String[] args) throws IOException {
        //问题1：怎样换行输入？
//        //创建字节输出流对象
//        FileOutputStream fos = new FileOutputStream("TestOfBili\\src\\Module073FileIOStream\\OutputTest.txt");
//
//        //写数据
//        for(int i = 0;i<10;i++){
//            fos.write("hello".getBytes());
//            fos.write("\n".getBytes());
//        }
//        /*
//        虽然在程序内打开文本文档文件显示是换行了，但是用windows自带的记事本软件打开仍然没有换行
//        原因是不同操作系统对换行符的识别不同
//            windows:\r\n
//            linux:\n
//            mac:\r
//        win11可以\n了（
//         */
//
//        //关流
//        fos.close();

        //问题2：怎样追加写入？
        //创建字节输出流对象，将参数boolean append改为true，从写入的初始位置变成文档末尾
        FileOutputStream fos = new FileOutputStream("TestOfBili\\src\\Module073FileIOStream\\Output\\in.txt",true);

        //写数据
        for(int i = 0;i<10;i++){
            fos.write("hello".getBytes());
            fos.write("\n".getBytes());
        }

        //关流
        fos.close();
    }
}
