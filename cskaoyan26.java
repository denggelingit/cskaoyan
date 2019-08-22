package cskaoyan;

public class cskaoyan26 {
	@org.junit.Test
	public void days() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print("please input:");
		char ch = in.next().charAt(0);

		if (ch == 'M' || ch == 'm') {
			System.out.println("Monday");
		} else if (ch == 'T' || ch == 't') {
			System.out.print("please input second letter:");
			ch = in.next().charAt(0);
			if (ch == 'U' || ch == 'u') {
				System.out.println("Tuesday");
			} else if (ch == 'H' || ch == 'h') {
				System.out.println("Thursday");
			} else {
				System.out.println("data error");
			}
		} else if (ch == 'W' || ch == 'w') {
			System.out.println("Wednesday");
		} else if (ch == 'F' || ch == 'f') {
			System.out.println("Friday");
		} else if (ch == 'S' || ch == 's') {
			System.out.print("please input second letter:");
			ch = in.next().charAt(0);
			if (ch == 'A' || ch == 'a') {
				System.out.println("Saturday");
			} else if (ch == 'U' || ch == 'u') {
				System.out.println("Sunday");
			} else {
				System.out.println("data error");
			}
		} else {
			System.out.println("data error");
		}

		in.close();
	}
}