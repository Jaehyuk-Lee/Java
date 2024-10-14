package sec05_threadstates.EX02_YieldInRunnableState;

class MyThread extends Thread {
	boolean yieldFlag;

	public MyThread() {
		setDaemon(true);
	}

	@Override
	public void run() {
		while (true) {
			if (yieldFlag) {
				Thread.yield();
			} else {
				System.out.println(getName() + " 실행");
				for (long i = 0; i < 1000000000L; i++) {
				}
			}
		}
	}
}

public class YieldInRunnableState {
	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		thread1.setName("thread1");
		thread1.yieldFlag = false;
		thread1.start();

		MyThread thread2 = new MyThread();
		thread2.setName("thread2");
		thread2.yieldFlag = true;
		thread2.start();

		// 6초 지연 (1초마다 한 번씩 양보)
		for (int i = 0; i < 6; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			thread1.yieldFlag = !thread1.yieldFlag;
			thread2.yieldFlag = !thread2.yieldFlag;
		}
	}
}
