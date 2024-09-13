public class Case010JieCheng {
    public static void main(String[] args) {

        int n = 5;
        int sum = 1;
        for(int i = n;i > 0;i--){
            sum *=n;
            n--;
        }
        System.out.println(sum);

        System.out.println(func(5));
    }

    public static int func(int n){
        if(n == 1){
            return 1;
        } else {
            return n * func(n - 1);
        }
    }
}
