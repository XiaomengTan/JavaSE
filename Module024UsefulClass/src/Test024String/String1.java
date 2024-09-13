package Test024String;

public class String1 {
    public static void main(String[] args) {
        //创建空白字符串对象
        String s1 = new String();
        System.out.println("s1:" + s1);

        //用字符数组创建字符串对象
        char[] chs = {'a', 'b', 'c'};
        String s2 = new String(chs);
        System.out.println("s2:" + s2);

        //使用字节数组创建字符串对象
        byte[] bys = {97, 98, 99};
        String s3 = new String(bys);
        System.out.println("s3:" + s3);

        //直接赋值创建字符串对象
        String s4 = "abc";
        System.out.println("s4:" + s4);
    }
}
