package cskaoyan;

import org.junit.Test;

public class cskaoyan4 {

	@Test
	public void zhiYinShu() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int number = in.nextInt();
		int prime = 2;
		in.close();

		if (number < 2) {
			return;
		} else {
			System.out.print(number + "=");

			while (number != prime) {
				if (number % prime == 0) {
					System.out.print(prime + "*");
					number = number / prime;
				} else {
					prime = nextPrime(prime);
				}
			}

			System.out.print(number);
		}
	}

	public int nextPrime(int number) {
		number = number + 1;

		while (true) {
			if (isPrime(number)) {
				return number;
			} else {
				number = number + 1;
			}
		}
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
