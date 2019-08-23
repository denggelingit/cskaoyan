package cskaoyan;

public class cskaoyan27 {
	@org.junit.Test
	public void prime() {
		int mix = 1;
		int max = 100;

		for (int i = mix; i <= max; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	private boolean isPrime(int number) {
		boolean flag = true;

		if (number < 2) {
			flag = false;
		} else if (number == 2) {
			flag = true;
		} else {
			for (int i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0) {
					flag = false;
					break;
				}
			}
		}

		return flag;
	}
}