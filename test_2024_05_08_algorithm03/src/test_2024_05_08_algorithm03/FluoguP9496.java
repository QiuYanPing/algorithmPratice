package test_2024_05_08_algorithm03;

import java.util.Scanner;
/**
 * 部分案列TLE
 */
public class FluoguP9496 {
	public static void main(String[] args) {
		/**
		 * 解题思路： 位运算可以把二进制上的某一位变为0或1，所以需要的操作只能为0/1/2次 1. n、m相同：0 2. n、m二进制上0对1或1对0:1 3.
		 * n、m二进制上0对1和1对0:2
		 */
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			long n = scanner.nextLong();
			long m = scanner.nextLong();
			if (n == m) {
				System.out.println(0);
			} else if ((n | m) == m || (n | m) == n) {
				System.out.println(1);
			} else {
				System.out.println(2);
			}
		}
	}
}
