import java.util.Calendar;

public class Test028Calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();//多态的形式
//        System.out.println(c);
        /*int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        System.out.println(year+"年"+month+"月"+date+"日");*/

        //public abstract void add
        /*c.add(Calendar.YEAR,-3);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        System.out.println(year+"年"+month+"月"+date+"日");*/

        /*c.add(Calendar.YEAR,10);
        c.add(Calendar.DATE,-5);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        System.out.println(year+"年"+month+"月"+date+"日");*/

        c.set(2048,11,11);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        System.out.println(year+"年"+month+"月"+date+"日");
    }
}
