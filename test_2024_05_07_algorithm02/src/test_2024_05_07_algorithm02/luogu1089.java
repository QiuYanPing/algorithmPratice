package test_2024_05_07_algorithm02;

import java.util.Scanner;

public class luogu1089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[13];
		for (int i = 1; i <= 12; i++) {
			arr[i] = scanner.nextInt();
		}
		int hand = 0;
		int maintain = 0;

		for (int i = 1; i <= 12; i++) {
			hand = hand + 300 - arr[i];
			if (hand < 0) {
				System.out.println(-i);
				return;
			} else {
				maintain += hand / 100 * 100;
				hand = hand % 100;
			}
		}
		System.out.println((int) (hand + maintain * 1.2));

	}

}
