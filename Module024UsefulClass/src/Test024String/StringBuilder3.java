package Test024String;

public class StringBuilder3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        //调用
        String s = arrayToString(arr);

        //输出
        System.out.println(s);
    }

    public static String arrayToString(int[] arr){
        //StringBuilder拼接
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for(int i = 0;i<arr.length;i++){
            if(i!=arr.length-1){
                sb.append(arr[i]).append(", ");
            }else{
                sb.append(arr[i]);
            }
        }
        sb.append("]");

        //转换回字符串
        String s = sb.toString();
        return s;
    }
}
