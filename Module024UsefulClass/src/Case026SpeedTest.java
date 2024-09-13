public class Case026SpeedTest {
    public static void main(String[] args) {
        double sum = 0;
        for (int j = 0; j < 1000000; j++) {
            long start = System.currentTimeMillis();
//            for (int i = 0; i < 10000; i++) {
//                System.out.println(i);
//            }//16.005ms

//            int n = 5;
//            int s = 1;
//            for(int i = n;i > 0;i--){
//                s *=n;
//                n--;
//            }
//            System.out.println(s);//0.0016223ms

            System.out.println(func(5));//0.001597ms

            long end = System.currentTimeMillis();
            sum += (end - start);
        }
        sum /= 1000000.0;
        System.out.println(sum);
    }

    public static int func(int n){
        if(n == 1){
            return 1;
        } else {
            return n * func(n - 1);
        }
    }
}
