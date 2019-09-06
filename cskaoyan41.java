package cskaoyan;

public class cskaoyan41 {
	@org.junit.Test
	public void peach() {
		int x = 0;
		int i = 0;
		int j = 1;

		while (i < 5) {
			x = 4 * j;

			for (i = 0; i < 5; i++) {
				if (x % 4 != 0) {
					break;
				}

				x = (x / 4) * 5 + 1;
			}

			j++;
		}

		System.out.println(x);
	}
}