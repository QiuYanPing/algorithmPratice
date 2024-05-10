package test_2024_05_10_algorithm05;

import java.util.Scanner;

/**
 * 部分案例超时
 */
public class lanqiao499 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		int sum = string.length();
		for (int i = 2; i <= string.length(); i++) {
			for (int j = 0; j <= string.length() - i; j++) {
				String substring = string.substring(j, j + i);
				sum += f(substring);
			}
		}
		System.out.println(sum);

	}

	private static int f(String substring) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < substring.length(); i++) {
			String conString = substring.charAt(i) + "";
			if (!substring.substring(0, i).contains(conString)
					&& !substring.substring(i + 1, substring.length()).contains(conString)) {
				count++;
			}
		}
		return count;
	}
}
