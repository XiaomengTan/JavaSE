import java.io.FileInputStream;
import java.io.IOException;

public class Test077FileIPStream {
    public static void main(String[] args) throws IOException {
        //创建输入流对象
        FileInputStream fis = new FileInputStream("TestOfBili\\src\\Module073FileIOStream\\Input\\in.txt");

        //读取数据
//        int by = fis.read();
//        System.out.println(by);
//        System.out.println((char) by);
//
//        by = fis.read();
//        System.out.println(by);
//        System.out.println((char) by);
//
//        by = fis.read();
//        System.out.println(by);
//        System.out.println((char) by);
//
//        by = fis.read();
//        System.out.println(by);
//        System.out.println((char) by);//返回-1

        //循环改进
        int by;
        /*
            fis.read()读数据
            by = fis.read()赋值
            by != -1判断
         */
        while ((by = fis.read()) != -1){
                System.out.print((char) by);
        }

        //关流
        fis.close();
    }
}
