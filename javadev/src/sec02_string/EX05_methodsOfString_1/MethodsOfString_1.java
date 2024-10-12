package sec02_string.EX05_methodsOfString_1;

public class MethodsOfString_1 {
	public static void main(String[] args) {
		// 문자열 길이
		String str1 = "Hello Java";
		String str2 = "안녕하세요! 반갑습니다";
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println();
		
		// 문자열 검색
		// @charAt
		System.out.println(str1.charAt(1));
		System.out.println(str2.charAt(1));
		
		// indexOf(), lastIndexOf()
		System.out.println(str1.indexOf('a'));
		System.out.println(str1.lastIndexOf('a'));
		System.out.println(str1.indexOf('a', 8));
		System.out.println(str1.lastIndexOf("Java"));
		System.out.println(str1.indexOf("Java"));
		System.out.println(str1.lastIndexOf("Java"));
		System.out.println(str2.indexOf("하세요"));
		System.out.println(str2.lastIndexOf("하세요"));
		System.out.println(str1.indexOf("Byte"));
		System.out.println(str2.lastIndexOf("고맙습니다"));
		
		// 문자열 변환 및 연결
		// @String.valueOf (기본 자료형): 기본 자료형 -> 문자열 변환
		String str3 = String.valueOf(2.3);
		String str4 = String.valueOf(false);
		System.out.println(str3);
		System.out.println(str4);
		
		// @concat: 문자열 연결
		String str5 = str3.concat(str4);
		System.out.println(str5);
		
		// 200 페이지 쓰다맘
	}
}
