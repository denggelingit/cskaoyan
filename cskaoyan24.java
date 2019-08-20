package cskaoyan;

public class cskaoyan24 {
	private int number;

	@org.junit.Test
	public void positiveInteger() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		number = in.nextInt();

		System.out.println(number + "是" + figure(number) + "位数");
		System.out.println(number + "逆序打印出各位数字:" + reverse(number));

		in.close();
	}

	private String reverse(int number) {
		StringBuffer str = new StringBuffer(Integer.toString(number));
		StringBuffer strReverse = str.reverse();
		return strReverse.toString();
	}

	private int figure(int number) {
		int result = 0;

		if (number == 0) {
			result = 1;
		} else {
			while (number > 0) {
				number /= 10;
				result++;
			}
		}

		return result;
	}
}