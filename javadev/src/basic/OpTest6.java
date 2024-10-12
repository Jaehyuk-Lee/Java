package basic;

public class OpTest6 {
	public static void main(String[] args) {
		// XOR로 변수값 서로 교체하기
		
		int a = 10, b = 5;
		a = a ^ b;
		b = b ^ a;
		a = a ^ b;
		
//		System.out.println("a = " + a);
//		System.out.println("b = " + b);
		
		// 자바에서 템플릿 출력하기
		String str = """
				a = %d
				b = %d
				""";
		System.out.println(String.format(str,  a, b));
	}
}
