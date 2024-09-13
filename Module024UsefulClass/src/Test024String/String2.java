package Test024String;

import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        //创建输入对象sc
        Scanner sc = new Scanner(System.in);

        //创建字符串对象
        String s = sc.nextLine();

        //遍历输入的字符串
        for(int i = 0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
    }
}
