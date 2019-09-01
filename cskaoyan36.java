package cskaoyan;

public class cskaoyan36 {
	@org.junit.Test
	public void shift() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int n = 0;
		int offset = 0;
		// 输入数组大小和数组内容
		System.out.println("Total numbers?");
		n = in.nextInt();
		System.out.println("Input " + n + " numbers.");

		if (n <= 0) {
			in.close();
			return;
		}

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		// 输入滚动偏移量
		System.out.println("Set your offset.");
		offset = in.nextInt();
		System.out.println("Offset is " + offset + ".");
		// 打印滚动前数组
		print_arr(arr);
		// 滚动数组并打印
		arr = move(arr, offset);
		print_arr(arr);
		in.close();
	}

	private void print_arr(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	private int[] move(int[] array, int offset) {
		if (offset <= 0) {
			return array;
		}

		offset %= array.length;

		int[] arrayNew = new int[array.length];

		for (int i = 0; i < array.length - offset; i++) {
			arrayNew[offset + i] = array[i];
		}

		for (int i = 0; i < offset; i++) {
			arrayNew[i] = array[array.length - offset + i];
		}

		return arrayNew;
	}
}