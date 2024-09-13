import java.util.Scanner;

public class Case007AccountLogIn {
    public static void main(String[] args) {
        //创建字符串对象
        String username = "txm";
        String password = "123";

        //用循环实现多次尝试
        for (int i = 0; i < 3; i++) {
            //创建Scanner对象接收字符串
            Scanner sc = new Scanner(System.in);

            //创建字符串对象储存用户输入的字符串
            System.out.println("请输入用户名");
            String name = sc.nextLine();
            System.out.println("请输入密码");
            String pwd = sc.nextLine();

            //判断是否相等
            if (name.equals(username) && pwd.equals(password)) {
                System.out.println("登录成功");
                break;
            } else {
                if (i != 2) {
                    System.out.println("登录失败，你还有" + (2 - i) + "次机会\n");
                } else {
                    System.out.println("账户已冻结");
                }
            }
        }
    }
}
