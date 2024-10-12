package sec01_instanceinnerclass_EX01_CreateObjectAndAccessMember;

class A {
	public int a = 3;
	protected int b = 4;
	int c = 5;
	private int d = 6;
	void abc() {
		System.out.println("A 클래스 메서드 abc()");
	}

	class B {
		void bcd() {
			
			int a = 13;
			int b = 14;
			int c = 15;
			int d = 16;
			
			System.out.println(A.this.a); // 아우터클래스 필드 접근하기
			System.out.println(A.this.b);
			System.out.println(c);
			System.out.println(d);
			abc();
		}
	}
}

public class CreateObjectAndAceessMember {
	public static void main(String[] args) {
			A a = new A();
			A.B b = a.new B();
			b.bcd();
	}
}
