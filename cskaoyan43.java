package cskaoyan;

public class cskaoyan43 {
	@org.junit.Test
	public void odd() {
		long sum = 4;
		long s = 4;
		long i = 0;

		for (i = 2; i <= 8; i++) {
			System.out.println((i - 1) + "位数为奇数的个数" + s);

			if (i <= 2) {
				s *= 7;
			} else {
				s *= 8;
			}

			sum += s;
		}

		System.out.println((i - 1) + "位数为奇数的个数" + s);
		System.out.println("奇数的总个数为：" + sum);
	}
}