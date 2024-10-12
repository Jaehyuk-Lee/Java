package sec03_threadproperties.EX02_ThreadProperties_2;

// 우선순위
class MyThread extends Thread {
    @Override
    public void run() {
        for (long i = 0; i < 10000000000L; i++) {
            long j = i * i;
        }
        System.out.println(getName() + " 우선순위: " + getPriority());
    }
}

public class Thread_Properties_2 {
    public static void main(String[] args) {

        // CPU 코어 수
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("코어 수: " + cores);

        // 우선순위 자동 지정
        for (int i = 0; i < 3; i++) {
            MyThread thread = new MyThread();
            thread.start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 우선순위 직접 지정
        for (int i = 0; i < cores * 2; i++) {
            Thread thread = new MyThread();
            thread.setName(i + "번째 쓰레드");
            if (i == cores * 2 - 1)
                thread.setPriority(Thread.MAX_PRIORITY);
            thread.start();
        }
    }
}
