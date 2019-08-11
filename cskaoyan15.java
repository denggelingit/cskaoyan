package cskaoyan;

public class cskaoyan15 {
	private static int x;
	private static int y;
	private static int z;

	@org.junit.Test
	public void sort() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();

		if (x > y) {
			int temp = x;
			x = y;
			y = temp;
		}

		if (x > z) {
			int temp = x;
			x = z;
			z = temp;
		}

		if (y > z) {
			int temp = y;
			y = z;
			z = temp;
		}

		System.out.println(x + "<" + y + "<" + z);

		in.close();
	}
}