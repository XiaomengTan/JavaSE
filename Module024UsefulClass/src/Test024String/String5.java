package Test024String;

import java.util.Scanner;

public class String5 {
    public static void main(String[] args) {
        //输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");

        //接收字符串
        String s = sc.nextLine();
        s = reverse(s);
        System.out.println(s);
    }

    public static String reverse(String s) {
        String ss = "";

        //倒转字符串
        for (int i = s.length() - 1; i >= 0; i--) {
            ss += s.charAt(i);
        }

        return ss;
    }
}
