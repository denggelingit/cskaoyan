package cskaoyan;

public class cskaoyan31 {
	@org.junit.Test
	public void reverseArray() {
		int[] arr = { 9, 6, 5, 4, 1 };
		show(arr);
		reverse(arr);
		show(arr);
	}

	private void reverse(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
	}

	private void show(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}
}