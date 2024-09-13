package Test134Lambda;

public class TestClass {
    public static void main(String[] args) {
        /*方法一
        函数式接口-（被实现）->实现类-（重写）->实现方法
                                   -（创建）->对象/new ComeTrueClass()/
                                   -（创建）->对象变量-（引用）->对象/ComeTrueClass ctc/-（调用）->实现方法/ctc.show();/
         */
        ComeTrueClass ctc = new ComeTrueClass();
        ctc.show();

        /*方法二
        函数式接口-（创建）->接口变量-（被赋值）->实现方法体（lambda表达式）/fi = ()->{}/
                                   -（产生后引用）->对象-（调用）->实现方法/fi.show();/
         */
        FunctionInerface fi = ()-> System.out.println("这是实现方法二");
        fi.show();

        //方法引用就是对对应的lambda表达式的参数执行一个语句
    }
}
