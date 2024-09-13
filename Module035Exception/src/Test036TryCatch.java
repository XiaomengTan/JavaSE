public class Test036TryCatch {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }

    public static void method() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);//new ArrayIndexOutOfBoundsException()
        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("你访问的数组的索引不存在");
//            e.printStackTrace();
            //java.lang.ArrayIndexOutOfBoundsException: 3
            //	at Module035Exception.Test036TryCatch.method(Test036TryCatch.java:13)
            //	at Module035Exception.Test036TryCatch.main(Test036TryCatch.java:6)


//            System.out.println(e.getMessage());
            //3


            //System.out.println(e.toString());
            //java.lang.ArrayIndexOutOfBoundsException: 3
        }
    }
}
/*
public class Throwable {

    private String detailMessage;

    public Throwable(String message){
        detailMessage =  message;
    }

    public String getMessage() {
        return detailMessage;
    }
}
 */