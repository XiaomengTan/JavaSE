public class Case002DoNotDieRabbit {
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;
        //计算斐波那契数列后面的其他元素
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println("神兔数量为" + arr[19]);
    }
}