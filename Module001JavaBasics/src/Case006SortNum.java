import java.util.Scanner;

public class Case006SortNum {
    public static void main(String[] args) {
        //静态初始化数组
        int[] arr = {19, 28, 37, 46, 50};

        //录入一个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的数据");
        int number = sc.nextInt();

        //索引变量
        int index = -1;

        //遍历数组，获取数组的每一个元素
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                index = i;
                break;
            }
        }

        //输出
        System.out.println("index:"+index);
    }
}
