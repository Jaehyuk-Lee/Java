package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TypingGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] keywords = {
			 "oop",
			 "primitive type",
			 "java",
			 "james gosling",
			 "for",
			 "while",
			 "do while",
			 "continue",
			 "break",
			 "Scanner"
		};
		
		int[] item = new int[3];
		for (int i = 0; i < item.length; i++) {
			item[i] = (int)(Math.random()*keywords.length);
			for (int j=0; j < i; j++) {
				if (item[i] == item[j]) {
					i--;
					break;
				}
			}
		}

		int miss_count = 0;
		System.out.println(Arrays.toString(item));
		System.out.println("Game Start!");
		long startTime = System.currentTimeMillis(); // 시간 측정 시작
		for (int i = 0; i < item.length; i++) {
			System.out.print(keywords[item[i]] + " ➡️ ");
			String input = sc.nextLine();
			if (!input.equals(keywords[item[i]])) {
				System.out.println("틀렸네요");
				miss_count++;
				i--;
			}
		}
		long endTime = System.currentTimeMillis(); // 종료 시간 저장
		System.out.println("틀린 횟수: " + miss_count);
		System.out.printf("총 소요시간: %.2f초", (double)(endTime - startTime)/1000);

		sc.close();
	}
}
