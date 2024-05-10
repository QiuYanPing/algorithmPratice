package test_2024_05_08_algorithm03;

import java.util.Scanner;

public class luoguB2141 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int p = scanner.nextInt();
		int q = scanner.nextInt();
		int r = scanner.nextInt();
		// 进制B要大于输入的数字
		int max = Integer.MIN_VALUE;
		int max_p = getMax(p);
		int max_q = getMax(q);
		int max_r = getMax(r);
		if (max_p > max_q) {
			max = max_p;
		} else {
			max = max_q;
		}
		if (max_r > max) {
			max = max_r;
		}
		for (int i = max + 1; i <= 16; i++) {
			long p1 = getnum(p, i); // 注意类型
			long q1 = getnum(q, i);
			long r1 = getnum(r, i);
			if (p1 * q1 == r1) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
	}

	private static int getMax(int p) {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE;
		int x = 0;
		while (p != 0) {
			x = p % 10;
			if (x > max)
				max = x;
			p = p / 10;
		}
		return max;
	}

	private static long getnum(int p, int i) {
		// TODO Auto-generated method stub
		long num = 0;
		int count = 0;
		while (p != 0) {
			num += (p % 10) * Math.pow(i, count);
			p = p / 10;
			count++;
		}
		return num;
	}
}
