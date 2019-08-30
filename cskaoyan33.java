package cskaoyan;

public class cskaoyan33 {
	@org.junit.Test
	public void pascalsTriangle() {
		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			arr[i][0] = 1;
			arr[i][i] = 1;
		}

		for (int i = 2; i < 6; i++) {
			for (int j = 1; j < i; j++) {
				arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
			}
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}