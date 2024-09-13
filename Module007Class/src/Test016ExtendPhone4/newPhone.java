package Test016ExtendPhone4;

public class newPhone extends Phone {

    //@Override注解检查下一个方法重写是否正确
    @Override
    public void call(String name) {
        System.out.println("打开视频");
        //System.out.println("给" + name + "打电话");

        //新手机的功能包含旧手机的功能，所以直接调用父类的旧方法
        super.call(name);
    }
}
