package cskaoyan;

public class cskaoyan9 {
	@org.junit.Test
	public void perfectNumber() {
		int sum = 0;
		int number = 1000;

		for (int i = 2; i <= number; i++) {
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}

			if (sum == i) {
				System.out.println(sum);
			}

			sum = 0;
		}
	}
}