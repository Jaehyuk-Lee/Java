package oop2;

public class Point3D extends Point2D {
	int z;
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
		System.out.println("Point3D (x, y, z) 실행");
	}
	
	public Point3D() {
		// Point2D() 생성자가 기본적으로 실행이 됨
		// Point3D() 생성자를 만들어도
		// Point3D 인스턴스를 생성하기 전에 Point2D 인스턴스를 먼저 만들어야 하기 때문
		
		this(1, 2, 3);
		
		System.out.println("Point3D () 실행");
	}
}
