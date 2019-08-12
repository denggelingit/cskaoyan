package cskaoyan;

public class cskaoyan16 {
	@org.junit.Test
	public void multiplicationTable() {
		for (int i = 1; i <= 9; i++) {
			for (int j = i; j <= 9; j++) {
				System.out.print(i + "x" + j + "=" + i * j + " ");
			}
			System.out.println();
		}
	}
}