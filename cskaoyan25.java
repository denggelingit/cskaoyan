package cskaoyan;

public class cskaoyan25 {
	@org.junit.Test
	public void palindromic() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		long number = in.nextLong();
		String str = Long.toString(number);
		char[] ch = str.toCharArray();
		boolean flag = true;

		for (int i = 0; i < ch.length / 2; i++) {
			if (ch[i] != ch[ch.length - 1 - i]) {
				flag = false;
				break;
			}
		}

		if (flag) {
			System.out.println(number + "是回文数");
		} else {
			System.out.println(number + "不是回文数");
		}

		in.close();
	}
}