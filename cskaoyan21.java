package cskaoyan;

public class cskaoyan21 {
	@org.junit.Test
	public void sum() {
		int mix = 1;
		int max = 20;
		long total = 0;

		for (int i = mix; i <= max; i++) {
			total += factorial(i);
		}

		System.out.println(total);
	}

	private long factorial(long number) {
		if (number == 1) {
			return 1;
		} else {
			return number * factorial(number - 1);
		}
	}
}