package arrays;

import java.util.Arrays;

public class ArrayTest2 {
	public static void main(String[] args) {

		int[][][] score = {
			{
				{100, 90, 80, 70},
				{ 90, 80, 70, 60},
				{ 80, 70, 60, 50}
			},{
				{100, 100, 90, 80},
				{ 90,  90, 80, 70},
				{ 80,  80, 70, 60}
			}
		};
		for (int table=0;table < score.length; table++) {
			System.out.println((table+1) + "학기 성적");
			System.out.println("국어\t영어\t수학\t철학\t총점\t평균");
			for (int row = 0; row < score[table].length; row++) {
				int sum=0;
				for (int col = 0; col < score[table][row].length; col++) {
					sum += score[table][row][col];
					System.out.print(score[table][row][col] + "\t");
				}
				System.out.println(sum + "\t" + (double)sum/score[table][row].length);
			}
			System.out.println();
		}
		
		System.out.println(Arrays.toString(score));
	}
}
