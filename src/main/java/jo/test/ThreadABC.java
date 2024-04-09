package jo.test;

import java.util.concurrent.CountDownLatch;

public class ThreadABC {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch=new CountDownLatch(2);

        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(new java.util.Random().nextInt(1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
                countDownLatch.countDown();
            }
        }, "Thread-A");

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(new java.util.Random().nextInt(1000));
                } catch (InterruptedException e) {
                    e.printStackTrace(); }
                System.out.println(Thread.currentThread().getName());
                countDownLatch.countDown();
            }
        }, "Thread-B");

        Thread threadC = new Thread(new Runnable() {
            @Override
            public void run() {
                // 在C中等待A/B運算結束
                try {
                    countDownLatch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    throw new RuntimeException("CountDownLatch等待失败。。。",e);
                }

                System.out.println(Thread.currentThread().getName());
            }
        }, "Thread-C");

        threadA.start();
        threadB.start();
        threadC.start();
    }
}