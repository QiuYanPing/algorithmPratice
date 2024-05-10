package test_2024_05_08_algorithm03;

import java.util.Scanner;

public class lanqiao1557 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;
		for (int i = 2; i <= n - 1; i++) {
			if (isPrim(i)) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println(count);
	}

	private static boolean isPrim(int i) {
		// TODO Auto-generated method stub
		if (i == 2) {
			return true;
		}
		int flag = 0;
		for (int j = 2; j <= Math.sqrt(i); j++) {
			if (i % j == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			return true;
		}
		return false;

	}
}
