package sec02_genericclass.EX01_SingleGenericArgument;

class MyClass<T> {
    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }
}

public class SingleGenericArgument {
    public static void main(String[] args) {
        MyClass<String> mc1 = new MyClass<String>();
        mc1.set("안녕하세요");
        System.out.println(mc1.get());
        MyClass<Integer> mc2 = new MyClass<>();
        mc2.set(100);
        System.out.println(mc2.get());
        // MyClass<Integer> mc3 = new MyClass<>();
        // mc.set("안녕"); // 컴파일 에러
    }
}