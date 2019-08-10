package cskaoyan;

public class cskaoyan14 {
	private static int year = 0;
	private static int month = 0;
	private static int day = 0;
	private static int[] leapYear = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static int[] commonYear = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private int sum = 0;

	@org.junit.Test
	public void date() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		year = in.nextInt();
		month = in.nextInt();
		day = in.nextInt();

		try {
			if (verify(year, month, day)) {
				if (leapYear(year)) {
					for (int i = 0; i < month - 1; i++) {
						sum += leapYear[i];
					}
				} else {
					for (int i = 0; i < month - 1; i++) {
						sum += commonYear[i];
					}
				}

				sum += day;

				System.out.println(year + "年" + month + "月" + day + "日" + "是这一年的第" + sum + "天");
			}
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			in.close();
		}
	}

	private static boolean verify(int yaer, int month, int day) throws Throwable {
		if (year < 1) {
			throw new Exception("YEAR ERROR");
		}

		if (month < 1 || month > 12) {
			throw new Exception("MONTH ERROR");
		}

		if (day < 1 || day > 31) {
			throw new Exception("DAY ERROR");
		}

		if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day > 30) {
				throw new Exception("DAY ERROR");
			}
		}

		if (month == 2) {
			if (leapYear(year)) {
				if (day > 29) {
					throw new Exception("DAY ERROR");
				}
			} else {
				if (day > 28) {
					throw new Exception("DAY ERROR");
				}
			}
		}

		return true;
	}

	private static boolean leapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0 && year % 3200 != 0)) {
			return true;
		} else {
			return false;
		}
	}
}