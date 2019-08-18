package cskaoyan;

public class cskaoyan22 {
	@org.junit.Test
	public void recursion() {
		long number = 5;

		System.out.println(factorial(number));
	}

	private long factorial(long number) {
		if (number == 1 || number == 0) {
			return 1;
		} else {
			return number * factorial(number - 1);
		}
	}
}