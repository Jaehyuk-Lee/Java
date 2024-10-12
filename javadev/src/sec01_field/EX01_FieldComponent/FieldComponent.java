package sec01_field.EX01_FieldComponent;

class A {
    int m = 3;
    int n = 4;

    void work1() {
        int k = 5;
        System.out.println(k);
        work2(3);
    }

    void work2(int i) {
        int j = 4;
        System.out.println(i + j);
    }

    void print() {
        System.out.print("객체 생성 및 활용");
    }
}

public class FieldComponent {
    public static void main(String[] args) {
        // 클래스로 객체 생성
        A a = new A();

        // 필드값 출력
        System.out.println(a.m);
        System.out.println(a.n);
        // 메서드 호출
        a.work1();
    }
}
