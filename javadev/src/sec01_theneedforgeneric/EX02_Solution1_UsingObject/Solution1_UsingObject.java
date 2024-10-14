package sec01_theneedforgeneric.EX02_Solution1_UsingObject;

class Apple {
    @Override
    public String toString() {
        return "Apple 입니다.";
    }
}

class Pencil {
    @Override
    public String toString() {
        return "Pencil 입니다.";
    }
}

class Goods {
    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}

public class Solution1_UsingObject {
    public static void main(String[] args) {
        // Goods를 이용하여 Apple 객체를 추가하거나 가져오기
        Goods goods1 = new Goods();
        goods1.setObject(new Apple());
        Apple apple = (Apple) goods1.getObject();
        System.out.println(apple.toString());

        // Goods를 이용하여 Pencil 객체를 추가하거나 가져오기
        Goods goods2 = new Goods();
        goods2.setObject(new Pencil());
        Pencil pencil = (Pencil) goods2.getObject();
        System.out.println(pencil.toString());

        // 잘못된 캐스팅
        // Goods goods3 = new Goods();
        // goods3.setObject(new Apple());
        // Pencil pencil2 = (Pencil) goods3.getObject(); // ClassCastException
        // System.out.println(pencil2.toString());
    }
}
