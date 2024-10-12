package arrays;

public class ArrayTest1 {
	public static void main(String[] args) {
		int[] n = new int[3];
		
		n[0] = 100;
		n[1] = 200;
		n[2] = 300;
		
		int[] k = new int[] {100, 200, 300};
		int[] p = {100, 200, 300};
		
		int[] m = new int[3];

		System.out.println(n);
		System.out.println(m);
		
		for (int i=0, len=n.length;i<len;i++)
			System.out.println(n[i]);
	}
}
