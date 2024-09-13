public class Case001IgnoreTheSeven {
    public static void main(String[] args) {
        //跳过带有7或者是7的倍数的数
        for (int i = 1;i <= 100;i++){
            if(i%7==0||i%10==7||i/10==7){
                System.out.println(i);
            }
        }
    }
}
