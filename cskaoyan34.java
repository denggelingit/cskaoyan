package cskaoyan;

public class cskaoyan34 {
	@org.junit.Test
	public void swap() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.println("n1 = :");
		int n1 = in.nextInt();
		System.out.println("n2 = :");
		int n2 = in.nextInt();
		System.out.println("n3 = :");
		int n3 = in.nextInt();

		if (n1 > n2) {
			n1 = n1 ^ n2;
			n2 = n1 ^ n2;
			n1 = n1 ^ n2;
		}

		if (n1 > n3) {
			n1 = n1 ^ n3;
			n3 = n1 ^ n3;
			n1 = n1 ^ n3;
		}

		if (n2 > n3) {
			n2 = n2 ^ n3;
			n3 = n2 ^ n3;
			n2 = n2 ^ n3;
		}

		System.out.println(n1 + " " + n2 + " " + n3);
		in.close();
	}
}