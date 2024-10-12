package oop4.singleton;

class Single {
    private static Single single = new Single();

    private Single() {
    }

    public static Single getInstance() {
        return single;
    }
}

public class SingletonTest {
    public static void main(String[] args) {
        Single s1 = Single.getInstance();
        Single s2 = Single.getInstance();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println(obj1.equals(obj2));

        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.equals(str2));
        System.out.println(str1);

        System.out.println("종료");

    }
}
