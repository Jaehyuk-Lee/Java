package oop5;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a1 = new Animal();

        // Subclass에서 Superclass로의 형변환은 자유로움
        // subclass의 객체를 superclass의 참조변수로 참조하는 것은 가능
        // Animal 타입에 Bird 객체를 참조한다.
        Animal a2 = new Bird(); // 다형성

        // (Animal)이 생략됐다고 생각하면 되는지 안되는지 판단하기 쉬움
        // 업캐스팅은 자유롭잖아
        Animal a3 = (Animal) new Bird();

        // Bird b2 = new Animal(); // 이건 안됨
        // Bird b3 = (Bird) a1; // 컴파일 에러는 없지만 런타임 에러 발생

        // if (a1 instanceof Bird) {
        // Bird b4 = (Bird) a1; // 이건 안됨
        // System.out.println(b4);
        // } else {
        // System.out.println("다운 캐스팅이 되지 않아요.");
        // }

        Bird b5 = new Bird();
        System.out.println(b5);
        Animal a5 = b5;
        System.out.println(a5);
        if (a5 instanceof Bird) {
            Bird b6 = (Bird) a5;
            System.out.println(b6);
        } else {
            System.out.println("다운 캐스팅이 되지 않아요.");
        }

        Condor c1 = new Condor();
        System.out.println(c1);
        if (c1 instanceof Bird) {
            Bird b4 = (Bird) c1;
            System.out.println(b4);
        } else {
            System.out.println("업 캐스팅이 되지 않아요.");
        }
        // 업캐스팅은 항상되기 때문에 굳이 이렇게 쓰지는 않는다.

        // C를 A로 올렸다가 이번엔 중간인 B로 내리는거 가능
        Animal a6 = c1;
        System.out.println(a6);
        Bird b7 = (Bird) a6; // 단, 다운캐스팅은 명시적으로 해줘야됨
        // instanceof로 체크해주는게 좋긴함
        System.out.println(b7);

        // 오른쪽이 실체라고 생각하자.
        // Animal로 참조한다고 해서 객체가 Animal로 바뀌지는 않음.
        Animal animal = new Bird();
        // 담는 그릇이 animal이라고 해도 실체가 Bird이기 때문에 Bird의 메서드가 사용됨
        System.out.println(animal);
        // 하지만 animal로 참조하고 있기 때문에 Bird에만 있는 메서드나 필드는 접근이 불가능
        // System.out.println(animal.BirdMethod()); // << 에러나서 주석처리해놓음
        Bird bird = (Bird) animal;
        System.out.println("종료");

    }
}
