package cskaoyan;

public class cskaoyan46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.println("输入第一个字符串:");
		String str1 = in.nextLine();
		System.out.println("输入第二个字符串:");
		String str2 = in.nextLine();
		System.out.println(connectString(str1, str2));
		in.close();
	}

	private static String connectString(String str1, String str2) {
		// TODO Auto-generated method stub
		StringBuffer buf = new StringBuffer(str1 + str2);
		return buf.toString();
	}
}