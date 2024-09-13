import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test083CharacterSet {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //编码
        //定义一个字符串
        String s = "中国";

        //将s以默认编码方式(UTF-8)转换为字节数组
//        byte[] bys = s.getBytes();
//        System.out.println(Arrays.toString(bys));//[-28, -72, -83, -27, -101, -67]三个字节表示一个汉字，UTF-8
        //自定义编码方式
//        byte[] bys = s.getBytes("UTF-8");
//        System.out.println(Arrays.toString(bys));//[-28, -72, -83, -27, -101, -67]
        byte[] bys = s.getBytes("GBK");
        System.out.println(Arrays.toString(bys));//[-42, -48, -71, -6]

        //解码
//        String ss = new String(bys);
//        System.out.println(ss);
//        String ss = new String(bys,"UTF-8");
        String ss = new String(bys,"GBK");
        System.out.println(ss);
    }
}
