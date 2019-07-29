package cskaoyan;

import org.junit.Test;

public class cskaoyan2 {
	@Test
	public void prime() {
		int min = 101;
		int max = 200;
		int count = 0;

		for (int i = min; i <= max; i++) {
			if (isPrime(i)) {
				count++;
				System.out.println(i);
			}
		}

		System.out.println(min + "-" + max + "之间有" + count + "个素数");
	}

	public boolean isPrime(int number) {
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
