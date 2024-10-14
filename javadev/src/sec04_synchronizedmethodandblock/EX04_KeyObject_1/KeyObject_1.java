package sec04_synchronizedmethodandblock.EX04_KeyObject_1;

class MyData {
    synchronized void abc() {
        for (int i = 0; i < 3; i++) {
            System.out.println(i + "Sec");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    synchronized void bcd() {
        for (int i = 0; i < 3; i++) {
            System.out.println(i + "초");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    void cde() {
        synchronized (this) {
            for (int i = 0; i < 3; i++) {
                System.out.println(i + "번째");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}

public class KeyObject_1 {
    public static void main(String[] args) {
        MyData myData = new MyData();
        Thread thread1 = new Thread(() -> myData.abc());
        Thread thread2 = new Thread(() -> myData.bcd());
        Thread thread3 = new Thread(() -> myData.cde());
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
