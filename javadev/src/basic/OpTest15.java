package basic;

import java.util.Scanner;

public class OpTest15 {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("주민번호 7번째 숫자 입력:");
			int x = sc.nextInt();
			System.out.println(x == 1 || x == 3 ? "남자" :
							   x == 2 || x == 4 ? "여자" :
								   				  "에러");
		};
	}
}
