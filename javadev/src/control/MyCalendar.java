package control;

import java.util.Calendar;
import java.util.Scanner;

public class MyCalendar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연도 입력: ");
		int year = sc.nextInt();
		System.out.print("월 입력: ");
		int month = sc.nextInt();
		
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, 1);
		
		int first_day = c.get(Calendar.DAY_OF_WEEK);
		int last_date = c.getActualMaximum(Calendar.DATE);
		
		System.out.println(year + "년 " + month + "월\n");
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");
//		for (int i=0; i<6; i++) {
//			for (int j=0; j<7; j++) {
//				if (i*7+j+1 < first_day)
//					System.out.print("   ");
//				else if (i*7+j-first_day+2 > last_date)
//					break;
//				else
//					System.out.printf("%2d ", i*7+j+2-first_day);
//			}
//			System.out.println();
//		}
		for (int day = 1; day < first_day; day++) {
			System.out.print("   ");
		}
		for (int date = 1; date <= last_date; date++) {
			System.out.printf("%2d ", date);
			if ((date + first_day - 1) % 7 == 0)
				System.out.println();
		}
	}
}
