package cskaoyan;

public class cskaoyan47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner in = new java.util.Scanner(System.in);
		int number = 0;
		for (int i = 0; i < 7; i++) {
			System.out.print("输入第" + (i + 1) + "个整数：");
			number = in.nextInt();
			if (number > 50) {
				System.out.println("请重新输入:");
				i--;
			} else {
				for (int j = 0; j < number; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		in.close();
	}
}