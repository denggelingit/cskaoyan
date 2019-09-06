package cskaoyan;

public class cskaoyan42 {
	@org.junit.Test
	public void number() {
		long a = 809;
		long b = 0;

		for (long i = 10; i < 100; i++) {
			b = a * i;

			if (b >= 1000 && b <= 9999 && 8 * i <= 99 && 9 * i >= 100) {
				System.out.println(b + " = 800 * " + i + " + 9 * " + i);
			}
		}
	}
}