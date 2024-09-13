import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test037RuntimeException {
    public static void main(String[] args) {
        method();
        method2();
    }

    public static void method() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[-1]);
        /*
        Test035Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
	at Module035Exception.Test037RuntimeException.method(Test037RuntimeException.java:10)
	at Module035Exception.Test037RuntimeException.main(Test037RuntimeException.java:5)

         */
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public static void method2() {
        try {
            String s = "2048-08-09";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse(s);
            System.out.println(d);
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}
