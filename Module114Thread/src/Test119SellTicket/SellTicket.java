package Test119SellTicket;

//创建一个类，实现Runnable接口
public class SellTicket implements Runnable {
    //定义一个成员变量private int tickets = 100;
//    private int tickets = 10000;
    private static int tickets = 10000;
    private int x = 0;
    private Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            //同步代码块，解决线程安全问题但降低了执行效率
            if (x % 2 == 0) {
                synchronized (obj) {
//                synchronized (this) {
//                synchronized (SellTicket.class) {
                    if (tickets > 0) {
                        try {
                            Thread.sleep(0);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                        tickets--;
                    }
                }
            } else {
                sellTick();
            }
            x++;
        }
    }

//    private synchronized void sellTick() {
//        if (tickets > 0) {
//            try {
//                Thread.sleep(0);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
//            tickets--;
//        }
//    }

    private static synchronized void sellTick() {
        if (tickets > 0) {
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
            tickets--;
        }
    }
}
