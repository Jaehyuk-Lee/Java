package oop9;

public class BoxedPrimitivesTest {
	public static void main(String[] args) {
		/*
		Integer i1 = 10; // Auto Boxing -> new 키워드를 쓰지 않아도 생성되도록 해줌
		int i2 = i1; // Auto Unboxing -> 클래스의 값을 기본 자료형에 바로 넣을 수 있게 해줌
		*/
		
		Integer n1 = Integer.valueOf(127);
		Integer n2 = Integer.valueOf(127);
		System.out.println(n1 == n2);
		System.out.println(n1.equals(n2));
		
		Integer n3 = 128;
		Integer n4 = 128;
		System.out.println(n3 == n4);
		System.out.println(n3.equals(n4));
	}
}
