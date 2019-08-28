package cskaoyan;

public class cskaoyan32 {
	@org.junit.Test
	public void logicalShift() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.println("input a number:");
		int a = in.nextInt();
		int b = a >> 4;
		int c = ~(~0 << 4);
		int d = b & c;
		System.out.println(a + " " + d);

		in.close();
	}
}