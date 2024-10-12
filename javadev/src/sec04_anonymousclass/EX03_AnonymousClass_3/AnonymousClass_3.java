package sec04_anonymousclass.EX03_AnonymousClass_3;

interface A {
    void abc();
}

// 자식 클래스 직접 생성
class B implements A {
    @Override
    public void abc() {
        System.out.println("입력 매개변수 전달");
    }
}

class C {
    void cde(A a) {
        a.abc();
    }
}

public class AnonymousClass_3 {
    public static void main(String[] args) {
        C c = new C();
        // 방법 1. 클래스 명 O + 참조 변수명 O
        A a = new B();
        c.cde(a);
        // 방법 2. 클래스명 O + 참조 변수명 X
        c.cde(new B());
    }
}
