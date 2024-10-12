package basic;

public class StringTest3 {
	public static void main(String[] args) {
		StringBuffer sbm = new StringBuffer(); // Multi thread safe 멀티 스레드 동기화
		StringBuilder sbs = new StringBuilder(); // For single thread
		printStr(sbs);
		sbs.append("실수란 ");printStr(sbs);
		sbs.append("신을 용서하는 ");printStr(sbs);
		sbs.append("인간의 ");printStr(sbs);
		sbs.append("행위이다. ");printStr(sbs);
	}

	private static void printStr(StringBuilder sbs) {
		System.out.println(sbs.capacity() + ":" +sbs.length());
	}
	
}
