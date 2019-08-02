package cskaoyan;

import org.junit.Test;

public class cskaoyan1 {
	// 递归
	@Test
	public void show1() {
		int month = 12;
		System.out.println("第" + month + "个月兔子对数为" + getRabbitNumber1(12));
	}

	public int getRabbitNumber1(int month) {
		if (month == 1 || month == 2) {
			return 1;
		} else {
			return getRabbitNumber1(month - 1) + getRabbitNumber1(month - 2);
		}
	}

	// 非递归
	@Test
	public void show2() {
		int month = 12;
		getRabbitNumber2(month);
	}

	public void getRabbitNumber2(int month) {
		int number1 = 1;
		int number2 = 1;
		int count = 0;
		for (int i = 1; i <= month; i++) {
			if (i == 1 || i == 2) {
				System.out.println("第" + i + "个月兔子对数为" + number1);
			} else {
				count = number1 + number2;
				number2 = number1;
				number1 = count;
				System.out.println("第" + i + "个月兔子对数为" + count);
			}
		}
	}
}