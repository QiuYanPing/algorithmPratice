package test_2024_05_08_algorithm03;

import java.util.Scanner;

public class lanqiao210 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int i = getMin(a, b);
		int j = getMin(c, i);
		System.out.println(j);
	}

	private static int getMin(int a1, int b1) {
		// TODO Auto-generated method stub
		int k = 0;// 最大公因数
		int a = Math.max(a1, b1);
		int b = Math.min(a1, b1);
		int c = 1;
		while (c != 0) {
			c = a % b;
			a = b;
			b = c;
		}
		k = a;
		return a1 * b1 / k;
	}
}
