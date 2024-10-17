package sec01_lambdaexpression.EX02_FunctionToLambdaExpression;

interface A {
    void method1();
}

interface B {
    void method2(int a);
}

interface C {
    int method3();
}

interface D {
    double method4(int a, double b);
}

public class FunctionToLambdaExpression {
    public static void main(String[] args) {
        A a = () -> System.out.println("메서드 내용 1");
        a.method1();
        B b = (x) -> System.out.println("메서드 내용 2: " + x);
        b.method2(123);
        C c = () -> {
            System.out.println("메서드 내용 3");
            return 123;
        };
        System.out.println(c.method3());
        D d = (x, y) -> {
            System.out.println("메서드 내용 4: " + x + ", " + y);
            return x + y;
        };
        System.out.println(d.method4(123, 3.14));
    }
}
