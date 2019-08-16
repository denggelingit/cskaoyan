package cskaoyan;

public class cskaoyan20 {
	@org.junit.Test
	public void sum() {
		double numerator = 2;
		double denominator = 1;
		double total = 0;

		for (int i = 0; i < 20; i++) {
			total += numerator / denominator;
			double temp = numerator;
			numerator = numerator + denominator;
			denominator = temp;
		}

		System.out.println("这个数列的前 20 项之和是" + total);
	}
}