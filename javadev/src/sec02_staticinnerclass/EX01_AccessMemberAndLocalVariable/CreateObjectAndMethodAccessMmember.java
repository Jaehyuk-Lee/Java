package sec02_staticinnerclass.EX01_AccessMemberAndLocalVariable;

class A {
    int a = 3;
    static int b = 4;

    void method1() {
        System.out.println("인스턴스 메서드");
    }

    static void method2() {
        System.out.println("static method");
    }

    static class B {
        void bcd() {
            // 필드 사용
            // System.out.println(a);
            System.out.println(b);
            // 메서드 호출
            // method1();
            method2();
        }
    }
}

public class CreateObjectAndMethodAccessMmember {
    public static void main(String[] args) {
        A.B b = new A.B();
        // 메서드 호출
        b.bcd();
    }
}
