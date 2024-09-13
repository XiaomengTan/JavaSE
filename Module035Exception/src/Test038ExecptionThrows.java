import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test038ExecptionThrows {
    public static void main(String[] args) throws ParseException{
        System.out.println("开始");
//        method();
        method2();

        System.out.println("结束");
    }

    //编译时异常
    public static void method2() throws ParseException {
        String s = "2048-08-09";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(s);
        System.out.println(d);
    }
    //仍然只是抛出了异常，处理交给调用者，谁用谁处理，处理者也可以抛出，不影响编译，只是运行可能会出错(


    //运行时异常
    public static void method() throws ArrayIndexOutOfBoundsException{
        int[] arr = {1,2,3};
        System.out.println(arr[3]);
    }
    //throws只是抛出了异常，并不能使程序继续往下执行，要想继续往下还得用trycatch
}
