package test_2024_05_10_algorithm05;

import java.util.Scanner;
/**
 * 有些案例运行超时
 */
public class Flanqiao498 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int target = scanner.nextInt();
		int special = 0;
		int abSpecial = 0;
		for (int i = target + 1; special == 0 || abSpecial == 0; i++) {
			String date = i + "";
			boolean x = isSpecial(date);
			boolean y = isABSpecial(date);
			if (x && special == 0) {
				special = i;
			}
			if (y && abSpecial == 0) {
				abSpecial = i;
			}
		}
		System.out.println(special);
		System.out.println(abSpecial);
	}

	private static boolean isABSpecial(String date) {
		// TODO Auto-generated method stub

		char[] charArray = date.toCharArray();
		String monthString = date.substring(2, 4);
		int month = Integer.parseInt(new StringBuffer(monthString).reverse().toString());

		String dayString = date.substring(0, 2);
		int day = Integer.parseInt(new StringBuffer(dayString).reverse().toString());

		int month1 = Integer.parseInt(date.substring(4, 6));
		int day1 = Integer.parseInt(date.substring(6, 8));
		if (month == day && month <= 12) {
			if (month1 == month && day1 == day) {
				return true;
			} else {
				return false;
			}
		}
		return false;

	}

	private static int getday(int month) {
		// TODO Auto-generated method stub
		int day = 0;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 2:
			day = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		}
		return day;
	}

	private static boolean isSpecial(String date) {
		// TODO Auto-generated method stub
		char[] charArray = date.toCharArray();
		String monthString = date.substring(2, 4);
		int month = Integer.parseInt(new StringBuffer(monthString).reverse().toString());

		String dayString = date.substring(0, 2);
		int day = Integer.parseInt(new StringBuffer(dayString).reverse().toString());
		int month1 = Integer.parseInt(date.substring(4, 6));
		int day1 = Integer.parseInt(date.substring(6, 8));

		if (month <= 12 && day <= getday(month)) {
			if (month == month1 && day == day1) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

}
