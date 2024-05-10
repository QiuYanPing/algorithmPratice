package test_2024_05_10_algorithm05;

import java.util.Scanner;

/**
 * 直接使用暴力求解会导致时间超时 所以这里使用计算某个字符贡献度求解 贡献度 = left指针移动步长+1 * right指针移动步长+1
 * （+1是因为要包含这个字符）
 * 
 * ababc 第一个b: left = 1 right = 1 aba的子串中b有贡献度
 */
public class lanqiao499_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		int sum = 0;
		for (int i = 0; i < string.length(); i++) {
			int left = 0;// 步长
			int right = 0;
			for (int j = i - 1; j >= 0; j--) {
				if (string.charAt(j) != string.charAt(i)) {
					left++;
				} else {
					break;
				}
			}
			for (int j = i + 1; j < string.length(); j++) {
				if (string.charAt(j) != string.charAt(i)) {
					right++;
				} else {
					break;
				}
			}
			sum += (left + 1) * (right + 1);
		}
		System.out.println(sum);
	}

}
