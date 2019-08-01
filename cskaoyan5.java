package cskaoyan;

public class cskaoyan5 {

	@org.junit.Test
	public void judge() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int score = in.nextInt();
		System.out.println(grade(score));
		in.close();
	}

	public char grade(int score) {
		return (score >= 90) ? 'A' : ((score >= 60) ? 'B' : 'C');
	}
}