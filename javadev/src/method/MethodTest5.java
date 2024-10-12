package method;

import java.util.Arrays;

public class MethodTest5 {
	public static void main(String[] args) {
		int a = 10;
		
		int b = square(a);
		System.out.println(a);
		System.out.println(b);
		
		int[] arr = {1, 2, 3};
		System.out.println(Arrays.toString(arr));
		changeArray(arr);
		System.out.println(Arrays.toString(arr));
		
		Integer I = 123;
		System.out.println(I);
		changeInt(I);
		System.out.println(I);
	}
	
	private static void changeArray(int[] arr) {
		arr[0] = 123;
	}
	
	private static void changeInt(Integer I) {
		I = 124;
	}
	
	private static int square (int a) {
		a = a * a;
		return a;
	}
}
