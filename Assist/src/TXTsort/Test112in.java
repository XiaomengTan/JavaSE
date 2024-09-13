package TXTsort;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.System.out;

public class Test112in {
    public static void main(String[] args) {
        int n = 1, len;
        double sum = 0;
        out.println("please enter the times of sum");
        Scanner toLen = new Scanner(System.in);
        len = toLen.nextInt();
        for (int i = 0; i < len; i++) {
            sum += 1 / pow(n, 3);
            n++;
        }
        out.println("the sum is "+sum);
    }
}
