package scu.wcc.mythread.threaddemo.demo6;

public class Test {
    public static void main(String[] args) throws InterruptedException {
/*        MyThread mt1 = new MyThread();
        mt1.setName("土豆");
        mt1.start();

        //将土豆线程插到main线程之前。
        mt1.join();


        //执行main线程
        for (int i = 0; i < 100; i++) {
            System.out.println("main"+"@"+i);
        }*/

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t1正在执行......");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("t1执行完成");
            }
        });

        Thread t2 = new Thread(()->{
            System.out.println("t2正在执行......");
            try {
                t1.join();
                System.out.println("t2等待t1执行完毕......");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("t2执行完毕");
        });
        t1.start();
        t2.start();

    }
}
