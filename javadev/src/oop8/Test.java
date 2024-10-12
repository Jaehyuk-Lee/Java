package oop8;

public class Test {
    public static void main(String args[]) {
        A a = new B();
        B b = new B();
        
        a.classMethod(); // classMethod() in A 가 출력된다.
        a.instanceMethod(); // instanceMethod() in B 가 출력된다.

        
        ((B) a).classMethod(); // classMethod() in B 가 출력된다.
        b.classMethod(); // classMethod() in B 가 출력된다.
        
        
        ((A) b).classMethod();// classMethod() in A 가 출력된다.
        A.classMethod(); // classMethod() in A 가 출력된다.
    }
}
class A {
    public static void classMethod() {
        System.out.println("classMethod() in A");
    }

    public void instanceMethod() {
        System.out.println("instanceMethod() in A");
    }
}

class B extends A {
    public static void classMethod() {
        System.out.println("classMethod() in B");
    }

    public void instanceMethod() {
        System.out.println("instanceMethod() in B");
    }
}