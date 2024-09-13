import java.io.*;

public class Case82CompareVideoCopySpeed {
    public static void main(String[] args) throws IOException {
        /*
            1.基本字节流一次读写一个字节
            2.基本字节流一次读写一个字符数组
            3.字节缓冲流一次读写一个字节
            4.字节缓冲流一次读写一个字符数组
         */

        long start = System.currentTimeMillis();//记录开始时间

        //测试函数
        //1.基本字节流一次读写一个字节
//        method1();//用时：11908636ms

        //2.基本字节流一次读写一个字符数组
//        method2();//用时：1594ms

        //3.字节缓冲流一次读写一个字节
//        method3();//用时：1618ms

        //4.字节缓冲流一次读写一个字节数组
        method4();//用时：436ms
        long end = System.currentTimeMillis();//记录结束时间
        System.out.println("用时：" + (end - start) + "ms");
    }

    public static void method1() throws IOException {
        //创建输入流对象
        FileInputStream fis = new FileInputStream("C:\\Users\\morea\\Desktop\\cube.mp4");
        //创建输出流对象
        FileOutputStream fos = new FileOutputStream("TestOfBili\\src\\Module081BufferIOStream\\Case82CompareVideoCopySpeed\\cube1.mp4");

        //执行读写操作
        int by;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }

        //关流回收资源
        fis.close();
        fos.close();
    }

    public static void method2() throws IOException {
        //创建输入流对象
        FileInputStream fis = new FileInputStream("C:\\Users\\morea\\Desktop\\cube.mp4");
        //创建输出流对象
        FileOutputStream fos = new FileOutputStream("TestOfBili\\src\\Module081BufferIOStream\\Case82CompareVideoCopySpeed\\cube1.mp4");

        //执行读写操作
        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }

        //关流回收资源
        fis.close();
        fos.close();
    }

    public static void method3() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\morea\\Desktop\\cube.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("TestOfBili\\src\\Module081BufferIOStream\\Case82CompareVideoCopySpeed\\cube1.mp4"));

        int by;
        while ((by = bis.read())!=-1){
            bos.write(by);
        }

        bis.close();
        bos.close();
    }

    public static void method4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\morea\\Desktop\\cube.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("TestOfBili\\src\\Module081BufferIOStream\\Case82CompareVideoCopySpeed\\cube1.mp4"));

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }

        bis.close();
        bos.close();
    }
}

