package control;

public class DoWhileTest3 {
	public static void main(String[] args) {
		int i=0, sum=0;
		do {
			sum +=i;
			i+=3;
		} while(i<=1000);
		System.out.println(sum);
	}
}
