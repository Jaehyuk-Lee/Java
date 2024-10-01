package basic;

import java.math.BigDecimal;

public class NumberTest {
	public static void main(String[] args) {
		double d1 = 2;
		double d2 = 1.1;
		
		System.out.println(d1 - d2);
		
		// 정밀한 계산이 필요할 때 BigInteger, BigDecimal 등 사용
		BigDecimal bd1 = new BigDecimal("2");
		BigDecimal bd2 = new BigDecimal("1.1");
		// BigDecimal 안에 값을 넣을 때 큰 따옴표를 넣어야됨
		// Java에서 기본적으로 double형으로 소숫점 숫자를 다루기 때문에
		// 큰 따옴표를 넣지 않으면 double 쓰는거나 다름 없는 결과가 나옴
		
		System.out.println(bd1.subtract(bd2));
	}
}
