package test_2024_05_09_algorithm04;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 运行超时
 */
public class FluoguB3665 {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int n = scanner.nextInt();
//		int q = scanner.nextInt();
//		int[][] arr = new int[n + 1][];
//		for (int i = 1; i <= n; i++) {
//			int s = scanner.nextInt();
//			arr[i] = new int[s + 1];
//			for (int j = 1; j <= s; j++) {
//				arr[i][j] = scanner.nextInt();
//			}
//		}
//		System.out.println(Arrays.toString(arr));
//		// 查询
//		int num = 0;
//		int x = 0;
//		int y = 0;
//		for (int i = 0; i < q; i++) {
//			x = scanner.nextInt();
//			y = scanner.nextInt();
//			num = num ^ arr[x][y];
//		}
//		System.out.println(num);
//	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int q = scanner.nextInt();
		ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();
		for (int i = 1; i <= n; i++) {
			int s = scanner.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int j = 1; j <= s; j++) {
				list.add(scanner.nextInt());
			}
			arrayList.add(list);
		}
		// 查询
		int num = 0;
		int x = 0;
		int y = 0;
		for (int i = 0; i < q; i++) {
			x = scanner.nextInt();
			y = scanner.nextInt();
			num = num ^ arrayList.get(x - 1).get(y - 1);
		}
		System.out.println(num);
	}
}
