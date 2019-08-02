package cskaoyan;

public class cskaoyan6 {

	@org.junit.Test
	public void gcd_lcm() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();

		System.out.println(gcd(m, n));
		System.out.println(lcm(m, n));

		in.close();
	}

	public int gcd(int m, int n) {// 最大公约数
		int temp = 0;

		if (m < n) {
			temp = m;
			m = n;
			n = temp;
		}

		while (n != 0) {
			temp = m % n;
			m = n;
			n = temp;
		}

		return m;
	}

	public int lcm(int m, int n) {// 最小公倍数
		int temp;

		temp = m * n / gcd(m, n);

		return temp;
	}
}
