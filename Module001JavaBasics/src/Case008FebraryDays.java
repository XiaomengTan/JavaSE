import java.util.Calendar;
import java.util.Scanner;

public class Case008FebraryDays {
    public static void main(String[] args) {
        //输入年份
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = sc.nextInt();

        //设置日历对象的年月日
        Calendar c = Calendar.getInstance();
        c.set(year,2,1);

        //3.1日往前推一天
        c.add(Calendar.DATE,-1);

        //输出
        int date = c.get(Calendar.DATE);
        System.out.println(year+"年的二月份有"+date+"天");
    }
}
