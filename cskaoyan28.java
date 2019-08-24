package cskaoyan;

public class cskaoyan28 {
	@org.junit.Test
	public void sort() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("请输入10个数字:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}

		selectionSort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		in.close();
	}

	private void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}

			if (min != i) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
	}
}