package method;

public class MethodTest6 {
	public static void main(String[] args) {
		print(1);
		print(1, 2);
		print(5, 6, 7);
		print(5, 6, 74, 56,456,34,345,34,52,4,23,423,42,342,34,23,4);
	}
	
	// Method Overloading
	private static void print(int... i) {
		for(int j:i) {
			System.out.print(j + "\t");
		}
		System.out.println();
	}
}
