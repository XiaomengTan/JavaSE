package Test017Extend5;

public class Zi extends Fu{
    //父类中的私有方法子类不可能重写
    /*
    @Override
    private void show(){
        System.out.println("子类show方法被调用");
    }
     */

    //不报错
    /*
    @Override
    public void method(){
        System.out.println("子类method方法被调用");
    }
    */


    //子类方法重写的访问权限必须比父类的高(public>(默认default)>private)
    @Override
    void method(){
        super.method();
        System.out.println("子类method方法被调用");
    }



}
