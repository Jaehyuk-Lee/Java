package control;

public class WhileTest2 {
	public static void main(String[] args) {
		int i=0, sum=0;
		while(i<=1000) {
			sum+=i;
			i+=3;
		}
		System.out.println(sum);
		System.out.println("종료");
	}
}
