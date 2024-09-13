package Test118ThreadRunnable;

public class MyRunnableTest {
    public static void main(String[] args) {
        //创建MyRunnable类的对象
        MyRunnable mr = new MyRunnable();

        //Thread(Runnable target)
//        Thread t1 = new Thread(mr);
//        Thread t2 = new Thread(mr);
        //Thread(Runnable target,String name)
        Thread t1 = new Thread(mr,"高铁");
        Thread t2 = new Thread(mr,"飞机");

        //启动线程
        t1.start();
        t2.start();
    }
}
