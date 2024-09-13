package Test016ExtendPhone4;

public class Demo {
    public static void main(String[] args) {
        //旧手机对象
        Phone p = new Phone();
        p.call("谭笑萌");
        System.out.println("--------");

        //新手机对象
        newPhone np = new newPhone();
        np.call("谭笑萌");
    }
}
