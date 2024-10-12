package sec01_array.EX03_InititalValue;

public class InitValue {
	public static void main(String[] args) {
		int value1;
		int value2;
		int value3 = 0;
		System.out.println(value3);
		int[] value = null;
		System.out.println();
		
		boolean[] array1 = new boolean[3];
		
		for (int i=0; i<3; i++) {
			System.out.println();
		}
		
		Integer I, J;
		I = 4;
		J = I;
		I = 5;
		System.out.println(J);
	}
}
