package basic;

public class OpTest18 {
	public static void main(String[] args) {
		
		for (int i=0; i < 50; i++)
			System.out.println((int)((Math.random()*12)+4));

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 6; j++)
				System.out.printf("%-4d", i*6+j+4);
			System.out.println();
		}
		
	}
}
