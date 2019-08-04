package cskaoyan;

public class cskaoyan8 {
	@org.junit.Test
	public void sum() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int number = in.nextInt();
		int count = in.nextInt();
		int s = 0;
		int ss = 0;

		for (int i = 0; i < count; i++) {
			s += number;
			ss += s;
			number = number * 10;
			System.out.println("每一项的值:" + s);
		}

		System.out.println("总和:" + ss);

		in.close();
	}
}