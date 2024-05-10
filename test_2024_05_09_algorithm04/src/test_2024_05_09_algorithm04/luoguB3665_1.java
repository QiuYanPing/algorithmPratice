package test_2024_05_09_algorithm04;

import java.util.ArrayList;
import java.util.Scanner;

public class luoguB3665_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // 数据条数
		int q = scanner.nextInt(); // 询问次数

		// 数组用于存储每条数据的起始索引
		int[] starts = new int[n + 1]; // +1是为了方便计算，starts[0]可以不用
		ArrayList<Integer> allData = new ArrayList<>();
		// 初始化起始索引数组
		for (int i = 2; i <= n; i++) {
			int size = scanner.nextInt();
			starts[i] = starts[i - 1] + size; // 加上前一条数据的长度
			// 读取所有的数据到一个ArrayList中

			for (int j = 0; j < size; j++) {
				allData.add(scanner.nextInt());
			}

		}

		// 计算所有查询的答案的按位异或和
		int xorSum = 0;
		for (int i = 0; i < q; i++) {
			int x = scanner.nextInt(); // 数据条目的索引
			int y = scanner.nextInt() - 1; // 注意Java中数组索引从0开始，所以需要减1
			int index = starts[x] + y; // 计算数据的实际索引
			xorSum ^= allData.get(index); // 计算按位异或和
		}

		// 输出结果
		System.out.println(xorSum);

		// 关闭Scanner
		scanner.close();
	}
}