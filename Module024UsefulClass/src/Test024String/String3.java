package Test024String;

import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        //创建对象接收字符串
        Scanner sc = new Scanner(System.in);

        //提示信息
        System.out.println("请输入字符串");

        //创建字符串对象
        String s = sc.nextLine();

        //定义计数变量
        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;

        //遍历字符串
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                bigCount++;
            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                smallCount++;
            } else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                numCount++;
            }
        }

        //输出统计结果
        System.out.println("大写字母有：" + bigCount + "小写字母有：" + smallCount + "数字有：" + numCount);
    }
}
