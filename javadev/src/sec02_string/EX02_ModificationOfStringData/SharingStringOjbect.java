package sec02_string.EX02_ModificationOfStringData;

public class SharingStringOjbect {
	public static void main(String[] args) {
		// 문자열 수정
		String str1 = new String("안녕");
		String str2 = "안녕";
		String str3 = "안녕";
		String str4 = new String("안녕");
		str1 = "안녕하세요"; // 새로운 객체 생성
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str3 == str4);
		System.out.println(str4 == str1);
	}
}
