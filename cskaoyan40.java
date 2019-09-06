package cskaoyan;

public class cskaoyan40 {
	@org.junit.Test
	public void arraySort() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.println("请输入3个字符串,每个字符串以回车结束!");
		String[] str = new String[3];
		for (int i = 0; i < 3; i++) {
			str[i] = in.nextLine();
		}

		sort_arr(str);

		System.out.println("排序后的结果为：");
		print_arr(str);

		in.close();
	}

	private void sort_arr(String[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j].compareTo(array[j + 1]) > 0) {
					String temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	private void print_arr(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}