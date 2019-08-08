package cskaoyan;

public class cskaoyan12 {
	@org.junit.Test
	public void count() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		double profit = in.nextDouble();
		double bonus = 0;
		double percent1 = 0.1;
		double percent2 = 0.075;
		double percent3 = 0.05;
		double percent4 = 0.03;
		double percent5 = 0.015;
		double percent6 = 0.01;

		if (profit <= 100000) {
			bonus = profit * percent1;
		} else if (profit <= 200000) {
			bonus = 100000 * percent1 + (profit - 100000) * percent2;
		} else if (profit <= 400000) {
			bonus = 100000 * percent1 + (200000 - 100000) * percent2 + (profit - 200000) * percent3;
		} else if (profit <= 600000) {
			bonus = 100000 * percent1 + (200000 - 100000) * percent2 + (400000 - 200000) * percent3
					+ (profit - 400000) * percent4;
		} else if (profit <= 1000000) {
			bonus = 100000 * percent1 + (200000 - 100000) * percent2 + (400000 - 200000) * percent3
					+ (600000 - 400000) * percent4 + (profit - 600000) * percent5;
		} else {
			bonus = 100000 * percent1 + (200000 - 100000) * percent2 + (400000 - 200000) * percent3
					+ (600000 - 400000) * percent4 + (1000000 - 600000) * percent5 + (profit - 1000000) * percent6;
		}

		System.out.println(bonus);
		in.close();
	}
}