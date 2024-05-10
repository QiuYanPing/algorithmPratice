package test_2024_05_07_algorithm02;

import java.util.Scanner;

public class newcoder16120 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		int i = 0;
		while (true) {
			Boolean x = iscontains(i, arr);
			if (x == false) {
				System.out.println(i);
				return;
			}
			i++;
		}
	}

	private static Boolean iscontains(int i, int[] arr) {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer();
		for (int j = 0; j < arr.length; j++) {
			str.append(arr[j] + "");
		}
		String str1 = str.toString();
		String str2 = i + "";
		// 判断str1中是否包含str2
		for (int j = 0; j < str1.length(); j++) {
			if (str1.charAt(j) == str2.charAt(0)) {
				// 继续判断后续字符
				int index = j + 1;
				int flag = 0;
				for (int k = 1; k < str2.length(); k++) {
					if (index == str1.length() || str1.charAt(index) != str2.charAt(k)) {
						flag = 1;
						break;
					}
					index++;
				}
				if (flag == 0) {
					return true;
				}
			}
		}
		return false;
	}

}
