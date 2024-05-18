

import java.util.Scanner;
/**
 * 部分案例超时
 * 时间复杂度O(N^2)
 * 二分查找优化O(n*logn)
 */
public class lanqiao172 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = scanner.nextInt();
		}
		for (int i = 0; i < n; i++) {
			c[i] = scanner.nextInt();
		}
		for (int i = 0; i < b.length; i++) {
			int aNum = 0;
			int cNum = 0;
			for (int j = 0; j < a.length; j++) {
				if(a[j]<b[i])
					aNum++;
			}
			for (int j = 0; j < c.length; j++) {
				if(c[j]>b[i])
					cNum++;
			}
			sum += aNum*cNum;
		}
		System.out.println(sum);
	}
}
