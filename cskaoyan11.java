package cskaoyan;

public class cskaoyan11 {
	@org.junit.Test
	public void unique() {
		int count = 0;

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				for (int k = 1; k <= 4; k++) {
					if (i != j && i != k && j != k) {
						count++;
						System.out.println(i * 100 + j * 10 + k);
					}
				}
			}
		}

		System.out.println("能组成" + count + "个互不相同且无重复数字的三位数");
	}
}