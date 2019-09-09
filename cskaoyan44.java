package cskaoyan;

public class cskaoyan44 {
	@org.junit.Test
	public void sum() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int number = 0;

		do {
			System.out.println("请输入一个偶数:");
			number = in.nextInt();
		} while (number % 2 != 0);

		for (int i = 2; i < number; i++) {
			if (isPrime(i) && isPrime(number - i)) {
				System.out.println("偶数" + number + "可以分解成" + i + "和" + (number - i) + "两个素数的和");
				break;
			}
		}

		in.close();
	}

	private boolean isPrime(int number) {
		boolean flag = true;

		if (number < 2) {
			flag = false;
		} else if (number < 4) {
			flag = true;
		} else if (number % 2 == 0) {
			flag = false;
		} else {
			for (int i = 3; i < Math.sqrt(number) + 1; i++) {
				if (number % i == 0) {
					flag = false;
					break;
				}
			}
		}

		return flag;
	}
}