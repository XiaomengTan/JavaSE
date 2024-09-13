package Case079IOcase2;

import java.io.FileInputStream;
import java.io.IOException;

public class IODemo {
    public static void main(String[] args) throws IOException {
        //创建字节输入流的对象
        FileInputStream fis = new FileInputStream("TestOfBili\\src\\Module073FileIOStream\\Case079IOcase2\\Text.txt");

        //读取数据，一次一个字节数组
        //创建字节数组作为容器
//        byte[] bys = new byte[5];
//        int len = fis.read(bys);
//        System.out.println(len);
////        System.out.println(new String(bys));
//        System.out.println(new String(bys,0,len));
//
//        len = fis.read(bys);
//        System.out.println(len);
////        System.out.println(new String(bys));
//        System.out.println(new String(bys,0,len));
//
//        len = fis.read(bys);//返回值len是真正读取到的数据
//        System.out.println(len);
////        System.out.println(new String(bys));
//        //String(bys,0,len)是从offset开始，从byte[]数组中读取length个数据转换为字符串对象
//        System.out.println(new String(bys,0,len));//故应该这样写
//
//        len = fis.read(bys);//再读取内容为空时，返回-1
//        System.out.println(len);
////        System.out.println(new String(bys));
//        System.out.println(new String(bys,0,len));

        //循环改进
        byte[] bys = new byte[1024];//字节数组长度一般取1024的整数倍
        int len;
        while((len = fis.read(bys))!=-1){
            System.out.print(new String(bys,0,len));
        }


        //释放资源
        fis.close();
    }
}
