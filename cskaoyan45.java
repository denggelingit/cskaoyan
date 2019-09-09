package cskaoyan;

public class cskaoyan45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner in = new java.util.Scanner(System.in);
		long prime = 0;
		long count = 1;
		long ret = 0;
		long i = 9;

		while (!isPrime(prime)) {
			System.out.println("请输入一个素数:");
			prime = in.nextLong();
		}

		while (i % prime != 0) {
			i = i * 10 + 9;
			count++;
		}
		ret = i;

		System.out.println("素数" + prime + "能整除" + count + "个9组成的数" + ret);
		in.close();
	}

	private static boolean isPrime(long number) {
		boolean flag = true;

		if (number < 2) {
			flag = false;
		} else if (number < 4) {
			flag = true;
		} else if (number % 2 == 0) {
			flag = false;
		} else {
			for (long i = 3; i < Math.sqrt(number) + 1; i++) {
				if (number % i == 0) {
					flag = false;
					break;
				}
			}
		}

		return flag;
	}
}
