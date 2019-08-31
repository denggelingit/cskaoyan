package cskaoyan;

public class cskaoyan35 {
	@org.junit.Test
	public void swap() {
		int[] arr = new int[6];
		inp(arr);
		outp(arr);

		arr_max(arr);
		arr_min(arr);

		System.out.println("计算结果：");
		outp(arr);
	}

	private void inp(int[] arr) {
		java.util.Scanner in = new java.util.Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.println("输入一个数字:");
			arr[i] = in.nextInt();
		}

		in.close();
	}

	private void arr_max(int[] arr) {
		int max = 0;
		int temp = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[max] < arr[i]) {
				max = i;
			}
		}

		temp = arr[0];
		arr[0] = arr[max];
		arr[max] = temp;
	}

	private void arr_min(int[] arr) {
		int min = 0;
		int temp = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[min] > arr[i]) {
				min = i;
			}
		}

		temp = arr[arr.length - 1];
		arr[arr.length - 1] = arr[min];
		arr[min] = temp;
	}

	private void outp(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}
}