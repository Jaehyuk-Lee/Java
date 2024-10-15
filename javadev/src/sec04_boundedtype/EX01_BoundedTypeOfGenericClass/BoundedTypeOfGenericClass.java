package sec04_boundedtype.EX01_BoundedTypeOfGenericClass;

class A {
}

class B extends A {
}

class C extends B {
}

class D<T extends B> { // B와 C만 올 수 있음!!!
    private T t;

    public T get() {
        return t;
    }

    public void set(T T) {
        this.t = T;
    }
}

public class BoundedTypeOfGenericClass {
    public static void main(String[] args) {
        // D<A> d1 = new D<A>(); //에러
        D<B> d2 = new D<B>();
        D<C> d3 = new D<C>();
        D d4 = new D();

        d2.set(new B());
        d3.set(new C());

        d4.set(new B());
        d4.set(new C());
    }
}
