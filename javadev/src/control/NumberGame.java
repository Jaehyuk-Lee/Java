package control;

import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int c1, c2, c3;
		int h1, h2, h3;
		
		int count = 0;
		
		c1 = (int)(Math.random()*10);
		do {
			c2 = (int)(Math.random()*10);
		} while (c1 == c2);
		do {
			c3 = (int)(Math.random()*10);
		} while (c1 == c3 || c2 == c3);
		
		int strike = 0, ball = 0;
//		do {
//			System.out.print("세자리 자연수 입력 (숫자가 겹치지 않도록): ");
//			int temp = sc.nextInt();
//			h1 = temp / 100;
//			h2 = (temp-h1*100) / 10;
//			h3 = temp - h1*100 - h2 * 10;
//			
//			ball = strike = 0;
//			if (h1 == c1) strike++;
//			else if (h1 == c2 || h1 == c3) ball++;
//			if (h2 == c2) strike++;
//			else if (h2 == c1 || h2 == c3) ball++;
//			if (h3 == c3) strike++;
//			else if (h3 == c1 || h3 == c2) ball++;
//			count++;
//			
//			System.out.println("[" + strike + "S " + ball + "B]");
//			
//		} while (strike != 3);
		
		for (count = 0; strike != 3; count++) {
			System.out.print("세자리 자연수 입력 (숫자가 겹치지 않도록): ");
			int temp = sc.nextInt();
			h1 = temp / 100;
			h2 = (temp - h1 * 100) / 10;
			h3 = temp - h1 * 100 - h2 * 10;
			
			ball = strike = 0;
			if (h1 == c1) strike++;
			else if (h1 == c2 || h1 == c3) ball++;
			if (h2 == c2) strike++;
			else if (h2 == c1 || h2 == c3) ball++;
			if (h3 == c3) strike++;
			else if (h3 == c1 || h3 == c2) ball++;
			
			System.out.println("[" + strike + "S " + ball + "B]");
		}
		
		System.out.println(count + "번 시도만에 성공하셨습니다!");
		System.out.println("------- 검증 -------");
		System.out.println("랜덤 숫자: " + c1 + " " + c2 + " " + c3);
		
	}
}
