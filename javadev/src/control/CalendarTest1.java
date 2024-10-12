package control;

import java.util.Calendar;

public class CalendarTest1 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1; // Month는 0부터
		int date = c.get(Calendar.DATE);
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
//		int hour = c.get(Calendar.HOUR_OF_DAY);
//		int minute = c.get(Calendar.MINUTE);
//		int second = c.get(Calendar.SECOND);
//		System.out.println(hour);
//		System.out.println(minute);
//		System.out.println(second);

		c.set(year, month-1, 1);
		int first_day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(first_day);
		int last_date = c.getActualMaximum(Calendar.DATE);
		System.out.println(last_date);
		
		System.out.println(year + "년 " + month + "월\n");
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");
		for (int i=0; i<6; i++) {
			for (int j=0; j<7; j++) {
				
			}
			System.out.println();
		}
	}
}
