package cskaoyan;

public class cskaoyan7 {
	@org.junit.Test
	public void count() {
		int letterNumber = 0;
		int spaceNumber = 0;
		int digitNumber = 0;
		int otherNumber = 0;

		java.util.Scanner in = new java.util.Scanner(System.in);
		String str = in.nextLine();
		char[] ch = str.toCharArray();
		int i = 0;

		while (i < ch.length) {
			if (Character.isLetter(ch[i])) {
				letterNumber++;
			} else if (Character.isWhitespace(ch[i])) {
				spaceNumber++;
			} else if (Character.isDigit(ch[i])) {
				digitNumber++;
			} else {
				otherNumber++;
			}

			i++;
		}

		in.close();

		System.out.println("英文字母的个数:" + letterNumber);
		System.out.println("空格的个数:" + spaceNumber);
		System.out.println("数字的个数:" + digitNumber);
		System.out.println("其它字符的个数:" + otherNumber);
	}
}