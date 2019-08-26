package cskaoyan;

public class cskaoyan30 {
	@org.junit.Test
	public void insertNumber() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int[] arr = { 1, 4, 6, 9, 13, 16, 19, 28, 40, 0 };

		System.out.print("原始列表:");
		show(arr);

		System.out.print("插入一个数字:");
		int number = in.nextInt();
		insert(arr, number);

		System.out.print("排序后列表:");
		show(arr);

		in.close();
	}

	private void insert(int[] arr, int number) {
		if (number > arr[arr.length - 1 - 1]) {
			arr[arr.length - 1] = number;
		} else {
			int temp1 = 0;
			int temp2 = 0;

			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > number) {
					temp1 = arr[i];
					arr[i] = number;

					for (int j = i + 1; j < arr.length; j++) {
						temp2 = arr[j];
						arr[j] = temp1;
						temp1 = temp2;
					}

					break;
				}
			}
		}
	}

	private void show(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}
}