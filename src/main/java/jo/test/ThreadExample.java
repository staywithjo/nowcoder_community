package jo.test;

/**
 * Date:2024/4/9
 * Author:Jo
 * Description:
 */
import java.util.concurrent.CountDownLatch;

public class ThreadExample {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(2); // 初始化计数器为2

        Thread threadA = new Thread(new Task(latch, "A"));
        Thread threadB = new Thread(new Task(latch, "B"));
        Thread threadC = new Thread(new TaskC(latch));

        threadA.start();
        threadB.start();

        try {
            latch.await(); // 等待计数器归零
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        threadC.start();
    }

    static class Task implements Runnable {
        private CountDownLatch latch;
        private String name;

        public Task(CountDownLatch latch, String name) {
            this.latch = latch;
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println("Thread " + name + " is running");
            try {
                Thread.sleep(2000); // 模拟任务执行时间
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread " + name + " is done");
            latch.countDown(); // 计数器减1
        }
    }

    static class TaskC implements Runnable {
        private CountDownLatch latch;

        public TaskC(CountDownLatch latch) {
            this.latch = latch;
        }

        @Override
        public void run() {
            try {
                latch.await(); // 等待计数器归零
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread C is running after A and B are done");
        }
    }
}

