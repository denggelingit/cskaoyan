package cskaoyan;

public class cskaoyan13 {
	@org.junit.Test
	public void number() {
		int min = 1;
		int max = 100000;
		int m = 0;
		int n = 0;

		for (int i = min; i < max; i++) {
			m = (int) Math.sqrt(i + 100);
			n = (int) Math.sqrt(i + 100 + 168);

			if (m * m == (i + 100) && n * n == (i + 100 + 168)) {
				System.out.println(i);
			}
		}
	}
}