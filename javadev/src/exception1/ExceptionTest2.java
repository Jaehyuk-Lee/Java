package exception1;

import java.io.InputStreamReader;

public class ExceptionTest2 {
	public static void main(String[] args) {
		String str = null;
		try {
			System.out.println(str.toString());
			System.out.println("Try 종료. 예외 발생하지 않음.");
		} catch (NullPointerException e) {
			System.out.println("null 예외처리");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally 블럭");
		}
		System.out.println("End");
	}
}
