package basic;

public class PrimitiveTypeTest {
	public static void main(String[] args) {
		boolean b = true; // 1 byte 할당, 1 bit 사용 - 할당을 1바이트 단위로만 할 수 있어서
		byte b2 = 127;
		
		System.out.println(b2);
		
		char c = '가'; // char: 2byte 0 ~ 65535
		char c2 = 44032;
		System.out.printf("%d\n", (int)c);
		System.out.println(c2);
		
		short s = 14435; // short: 2byte -32768~32767 (±3만)
		short s2 = 2;
		s = 1241 * 10;
		System.out.println(s);
		
		int i = 2147483647; // int: 4byte -2147483648 ~ 2147483647 (±20억)
		System.out.println(i);
		System.out.println(i+1);
		 
		long l = 21474836473L; // long: 8byte 2^63 ~ 2^63-1  (±900경)
		// 오른쪽 숫자를 가져올 때 기본적으로 int로 사용하기 때문에
		// 맨 뒤에 L(l)을 붙여서 long type이라고 알려줘야함. 구분하기 쉽게 대문자 L을 쓴다네요.
		System.out.println(l);
		
		double pi = 3.141592653; // double: 8byte
		float f = 3.1415926535f; // float: 4byte
		// 맨 뒤에 f를 붙여서 float type이라고 알려줘야 함. 
		System.out.println(pi);
		System.out.println(f);
		
		String str = "가나다";
		System.out.println(str);
	}
}
