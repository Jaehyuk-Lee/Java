package basic;

import java.util.Scanner;

public class OpTest1 {
	public static void main(String[] args) {
		// Scanner <- System.in 키보드 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a: ");
		int a = sc.nextInt();
		System.out.print("b: ");
		int b = sc.nextInt();
		
		System.out.println(a + "+" + b + "=" + (a + b)); // 맨 뒤 a+b를 반드시 괄호를 해줘야 산술 연산이 먼저 됨
		System.out.println(a + "-" + b + "=" + (a - b));
		System.out.println(a + "*" + b + "=" + (a * b));
		System.out.println(a + "/" + b + "=" + (a / b));
		System.out.println(a + "/" + b + "=" + ((double)a / b)); // 하나를 double로 만들어서 전체 결과를 double로 만들어줌
		System.out.println(a + "%" + b + "=" + (a % b));
		System.out.println("종료");
	}
}
