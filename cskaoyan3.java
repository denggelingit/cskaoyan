package cskaoyan;

import org.junit.Test;

public class cskaoyan3 {

	@Test
	public void shuiXianHua() {
		int min = 100;
		int max = 999;
		int ge = 0;
		int shi = 0;
		int bai = 0;

		for (int i = min; i <= max; i++) {
			ge = getGe(i);
			shi = getShi(i);
			bai = getBai(i);

			if (i == ge * ge * ge + shi * shi * shi + bai * bai * bai) {
				System.out.println(i);
			}
		}
	}

	public int getGe(int number) {
		return number % 10;
	}

	public int getShi(int number) {
		return number / 10 % 10;
	}

	public int getBai(int number) {
		return number / 100;
	}
}