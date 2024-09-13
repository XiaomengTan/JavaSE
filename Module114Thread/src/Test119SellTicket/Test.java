package Test119SellTicket;

public class Test {
    public static void main(String[] args) {
        SellTicket st = new SellTicket();

        Thread t1 = new Thread(st,"窗口1");
        Thread t2 = new Thread(st,"窗口2");
        Thread t3 = new Thread(st,"窗口3");

        t1.setPriority(5);
        t2.setPriority(5);
        t3.setPriority(5);

        t1.start();
        t2.start();
        t3.start();

//        Runnable r = () -> {
//            int tickets = 100;
//            while (true) {
//                if (tickets > 0) {
//                    System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
//                    tickets--;
//                }
//            }
//        };
//
//        Thread t1 = new Thread(r, "窗口1");
//        Thread t2 = new Thread(r, "窗口2");
//        Thread t3 = new Thread(r, "窗口3");
//
//        t1.start();
//        t2.start();
//        t3.start();
    }
}
