package exception1;

import java.io.IOException;

public class ExceptionTest4 {
	public static void main(String[] args) {
		try {
			runMethod();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main end");
	}
	
	// throws로 예외처리를 미룰 수 있음. 메서드를 호출한 쪽으로
	
	private static void runMethod() throws IOException {
		try {
			if (true) throw new IOException("파일 처리 예외 상황 발생");
		} finally {
			System.out.println("자원 해제");
		}
		System.out.println("runMethod End");
	}
}
