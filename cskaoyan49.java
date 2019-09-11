package cskaoyan;

public class cskaoyan49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.println("请输入两个字符串，以回车隔开，母串在前，子串在后：");
		String str1 = in.nextLine();
		String str2 = in.nextLine();

		System.out.println(stringCount(str1, str2));
		in.close();
	}

	private static int stringCount(String str1, String str2) {
		// TODO Auto-generated method stub
		int count = 0;
		char[] chs1 = str1.toCharArray();
		char[] chs2 = str2.toCharArray();

		for (int i = 0, j = 0; i < chs1.length; i++) {
			for (j = 0; j < chs2.length; j++) {
				if (chs1[i + j] != chs2[j]) {
					break;
				}
			}

			if (j == chs2.length) {
				count++;
				i = i + j - 1;
			}
		}
		return count;
	}
}