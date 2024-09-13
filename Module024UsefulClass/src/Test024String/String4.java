package Test024String;

public class String4 {
    public static void main(String[] args) {
        //定义一个int类型的数组
        int[] arr = {1, 2, 3};

        //创建一个字符串对象用于接收拼接方法的返回值
        String s = arrayToString(arr);
        System.out.println(s);
    }

    public static String arrayToString(int[] arr) {
        String s = "";
        s += "[";
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                s += arr[i];
                s += ",";
            } else {
                s += arr[i];
            }
        }
        s += "]";
        return s;
    }
}
