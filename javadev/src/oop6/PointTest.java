package oop6;

public class PointTest {
    public static void main(String[] args) {
        Point2D up = new Point3D(); // upcasting, 자동형변환 (묵시적형변환)
        up.x = 100;
        up.y = 200;
        // up.z = 300; // Point2D에는 z가 없어서 컴파일 에러 발생
        up.print();

        if (up instanceof Point3D) {
            Point3D dn = (Point3D) up; // downcasting, 강제형변환 (명시적형변환)
            dn.x = 1000;
            dn.y = 2000;
            dn.z = 3000;
            dn.print();
        }

        System.out.println("종료");
    }
}