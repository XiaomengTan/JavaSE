import java.util.Calendar;
import java.util.Scanner;

public class Case029FebraryDays {
    public static void main(String[] args) {
        //键盘录入任意年份
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入年月日：");
        int year = sc.nextInt();

        Calendar c = Calendar.getInstance();
        c.set(year,2,1);
        c.add(Calendar.DATE,-1);
        int date  = c.get(Calendar.DATE);

        System.out.println(year+"年的2月份有"+date+"天");

    }
}
