public class Test027Integer {
    public static void main(String[] args) {
        //String--->int

        //方法1String--->Integer--->int
        //给出一个字符串对象
        String s1 = "100";
        //将该对象转换成Integer对象i1内的成员变量的值
        Integer i1 = Integer.valueOf(s1);
        //将Integer对象i1转换成int类型
        int int1 = i1.intValue();
        System.out.println(int1);

        //方法2String--->int
        //给出一个字符串对象
        String s2 = "100";
        //用类名调用成员方法直接转换
        int int2 = Integer.parseInt(s2);
        System.out.println(int2);

        //int--->String

        //方法1直接使用+拼接符
        int i = 100;
        String s = "" + i;
        System.out.println(s);



        char[] arr = {'0','1','2'};
        //方法2使用valueOf()
        String s4 =new String(arr);
        //说明:String本身就是对象，他没有对应的基本数据类型
        System.out.println(s4);
    }
}
