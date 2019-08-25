package cskaoyan;

public class cskaoyan29 {
	@org.junit.Test
	public void diagonal() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int[][] arr = new int[3][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = in.nextInt();
			}
		}

		sum(arr);
		in.close();
	}

	private void sum(int[][] arr) {
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					sum1 += arr[i][j];
				}

				if (j == arr[i].length - i - 1) {
					sum2 += arr[i][j];
				}
			}
		}

		System.out.println("主对角线元素之和:" + sum1);
		System.out.println("副对角线元素之和:" + sum2);
	}
}