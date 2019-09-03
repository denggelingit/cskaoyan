package cskaoyan;

public class cskaoyan38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.println("please input a string:");
		String str = in.nextLine();
		char[] arr = str.toCharArray();
		System.out.println("the string has " + arr.length + " characters.");
		in.close();
	}
}