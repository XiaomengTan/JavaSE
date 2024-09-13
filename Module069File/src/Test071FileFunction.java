import java.io.File;

public class Test071FileFunction {
    public static void main(String[] args) {
        /*
        TestOfBili\src\Module069File\javatest.txt
         */
        File f1 = new File("C:\\Users\\morea\\Desktop\\TestDirectory\\202144011123+计科4211+谭笑萌.docx");
        System.out.println(f1.isDirectory());//是否是目录
        System.out.println(f1.isFile());//是否是文件
        System.out.println(f1.exists());//是否存在
        System.out.println("--------");

        System.out.println(f1.getAbsoluteFile());//获取以绝对路径封装的文件对象
        System.out.println(f1.getPath());//获取文件路径
        System.out.println(f1.getName());//获取文件名
        System.out.println("--------");

        File f2 = new File("C:\\Users\\morea\\Desktop\\TestDirectory");
        String[] list = f2.list();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("--------");

        File[] files = f2.listFiles();
        for (File file : files) {
//            System.out.println(file);
//            System.out.println(file.getName());
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
    }
}
