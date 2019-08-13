package cskaoyan;

public class cskaoyan17 {
	@org.junit.Test
	public void peach() {
		int x1 = 0;
		int x2 = 1;

		for (int day = 9; day > 0; day--) {
			x1 = (x2 + 1) * 2;
			x2 = x1;
		}

		System.out.println("第一天共摘了" + x1 + "个桃子");
	}
}