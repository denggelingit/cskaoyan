package cskaoyan;

public class cskaoyan10 {
	@org.junit.Test
	public void fall() {
		double height = 50;
		double length = 100;
		int count = 10;

		for (int i = 2; i <= count; i++) {
			length += height * 2;

			System.out.println("在第" + i + "次落地时，共经过" + length + "米");

			height /= 2;

			System.out.println("第 " + i + "次反弹" + height + "米高");
			System.out.println();
		}
	}
}