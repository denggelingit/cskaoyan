package cskaoyan;

public class cskaoyan23 {
	private final int BASE = 10;
	private final int TWO = 2;
	private final int FIVE = 5;

	@org.junit.Test
	public void getAge() {
		System.out.println("第五个人" + age(FIVE) + "岁");
	}

	private int age(int count) {
		if (count == 1) {
			return BASE;
		} else {
			return TWO + age(count - 1);
		}
	}
}