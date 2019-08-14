package cskaoyan;

public class cskaoyan18 {
	@org.junit.Test
	public void tableTennis() {
		char A = 0;
		char B = 0;
		char C = 0;

		for (char ch = 'X'; ch <= 'Z'; ch++) {
			if (ch != 'X' && ch != 'Z') {
				C = ch;
			}
		}

		for (char ch = 'X'; ch <= 'Z'; ch++) {
			if (ch != 'X' && ch != C) {
				A = ch;
			}
		}

		for (char ch = 'X'; ch <= 'Z'; ch++) {
			if (ch != A && ch != C) {
				B = ch;
			}
		}

		System.out.println("A的对手是" + A);
		System.out.println("B的对手是" + B);
		System.out.println("C的对手是" + C);
	}
}