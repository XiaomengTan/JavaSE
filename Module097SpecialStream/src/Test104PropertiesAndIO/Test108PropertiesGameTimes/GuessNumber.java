package Test104PropertiesAndIO.Test108PropertiesGameTimes;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private GuessNumber() {
    }

    public static void start() {
        //生成随机数
        Random r = new Random();

        //范围1到100
        int number = r.nextInt(100) + 1;
        while (true) {
            //键盘录入猜测值
            Scanner sc = new Scanner(System.in);

            System.out.println("请输入要猜测的值");
            int guessNumber = sc.nextInt();

            //比较两个数据
            if (guessNumber > number) {
                System.out.println("你猜的数字大了");
            } else if (guessNumber < number) {
                System.out.println("你猜的数字小了");
            } else {
                System.out.println("你猜中了");
                break;
            }
        }
    }
}
