package sec02_loopcontrolstatement.EX01_ForControlStatement;

public class EX03_DoWhileControlStatement {
	public static void main(String[] args) {
		// 반복 횟수가 0일 때 do-while 문과 while 문 비교
		int a;
		a = 0;
		while (a<0) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		a = 0;
		do {
			System.out.print(a + " ");
			a++;
		} while (a<0);
		System.out.println();
		
		// 반복 횟수가 1일 때 do-while 문과 while 문 비교
		a = 0;
		while(a<1) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		a = 0;
		do {
			System.out.print(a + " ");
			a++;
		} while (a < 1);
		System.out.println();
		
		// 반복 횟수가 10일 때 do-while 문과 while 문 비교
		a = 0;
		while (a < 10) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		a = 0;
		do {
			System.out.print(a + " ");
			a++;
		} while(a < 10);
	}
}
