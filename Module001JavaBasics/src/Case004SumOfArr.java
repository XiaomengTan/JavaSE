public class Case004SumOfArr {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {68, 27, 95, 88, 171, 996, 51, 210};

        //定义数组和
        int sum = 0;

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 != 7 && arr[i] % 10 / 10 != 7 && arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }

        //输出
        System.out.println("sum:"+sum);
    }
}
