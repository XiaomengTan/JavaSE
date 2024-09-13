public class Test053VariableArgument {
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));
        System.out.println(sum(10, 20, 30, 40, 50));
        System.out.println(sum(10, 20, 30, 40, 50, 60));
        System.out.println(sum(10, 20, 30, 40, 50, 60, 70));
    }

/*    //一个方法有多个参数，应该把可变参数放在最后
    public static int sum(int b,int... a) {
        return 0;
    }*/

    public static int sum(int... a) {
//        System.out.println(a);//a其实是数组，数据被封装起来了
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
