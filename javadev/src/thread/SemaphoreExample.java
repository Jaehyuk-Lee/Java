package thread;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    private static Semaphore semaphore = new Semaphore(2);

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
                accessResource();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
                accessResource();
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
                accessResource();
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }

    private static void accessResource() {
        try {
            semaphore.acquire(); // 세마포어 획득 시도
            System.out.println(Thread.currentThread().getName() + " is accessing the resource");
            Thread.sleep(2000); // 자원 사용
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(Thread.currentThread().getName() + " is releasing the resource");
            semaphore.release(); // 세마포어 반환
        }
    }
}