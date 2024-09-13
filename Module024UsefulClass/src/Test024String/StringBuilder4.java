package Test024String;

import java.util.Scanner;

public class StringBuilder4 {
    public static void main(String[] args) {
        //字符串的创建与录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String s = sc.nextLine();
        /*
        s = reverse(s);
        System.out.println(s);
        */
        System.out.println(new StringBuilder(s).reverse().toString());
    }
    /*


    public static String reverse(String s){


        StringBuilder sb = new StringBuilder(s);
        s = sb.reverse().toString();
        return s;



        //一行代码代替上面的内容
        return new StringBuilder(s).reverse().toString();
    }*/

}
