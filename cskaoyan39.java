package cskaoyan;

public class cskaoyan39 {
	@org.junit.Test
	public void sum() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.println("请输入一个数字：");
		int number = in.nextInt();
		double result = 0;

		if (odd(number)) {
			result = oddNumber(number);
		} else {
			result = evenNumber(number);
		}

		System.out.println(result);
		in.close();
	}

	public boolean odd(int number) {
		if (number % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	public double evenNumber(int number) {
		double result = 0;

		for (int i = 2; i <= number; i += 2) {
			result += (double) 1 / i;
		}

		return result;
	}

	public double oddNumber(int number) {
		double result = 0;

		for (int i = 1; i <= number; i += 2) {
			result += (double) 1 / i;
		}

		return result;
	}
}