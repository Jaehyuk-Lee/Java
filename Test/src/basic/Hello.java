package basic;

/*
 * 켈리 방정식 테스트
 * 이재혁 2014-09-30 .........
 *  
 */

public class Hello {
	public static void main(String[] args) {
		int money = 1_000_000;
		money *= 1.4;
		money *= 0.7;
		
		double money2 = 10000;
		money2 += money2*0.4;
		money2 = money2 - money2 * 0.3;
		
		System.out.println(money);
		System.out.println(money2);
	}
}
