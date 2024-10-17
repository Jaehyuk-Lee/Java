package sec01_lambdaexpression.EX06_RefOfInstanceMethod_type2_1;

interface A {
    void abc(B b, int k);
}

class B {
    void bcd(int k) {
        System.out.println(k);
    }
}

public class RefOfInstanceMethod_Type2_1 {
    public static void main(String[] args) {
        // 익명 이너 클래스
        A a1 = new A() {
            public void abc(B b, int k) {
                b.bcd(k);
            }
        };
        // 람다식
        A a2 = (b, k) -> b.bcd(k);

        // 메소드 참조
        A a3 = B::bcd;

        a1.abc(new B(), 3);
        a2.abc(new B(), 3);
        a3.abc(new B(), 3);
    }
}
