package cskaoyan;

public class cskaoyan48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner in = new java.util.Scanner(System.in);
		int number = 0;
		System.out.print("请输入四位数字：");
		number = in.nextInt();
		encode(number);
		in.close();
	}

	private static void encode(int number) {
		int[] result = new int[4];
		int temp = 0;

		result[0] = number / 1000;
		result[1] = number % 1000 / 100;
		result[2] = number % 100 / 10;
		result[3] = number % 10;

		for (int i = 0; i < 4; i++) {
			result[i] += 5;
			result[i] %= 10;
		}

		temp = result[0];
		result[0] = result[3];
		result[3] = temp;

		temp = result[1];
		result[1] = result[2];
		result[2] = temp;

		System.out.print("加密后的数字：");

		for (int i = 0; i < 4; i++) {
			System.out.print(result[i]);
		}
	}
}
