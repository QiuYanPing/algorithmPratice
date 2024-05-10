package test_2024_05_06_algorithm01;

import java.util.Scanner;

public class lanqiao505 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] arr = new int[n+1][n+1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=i; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <=i; j++) {
				arr[i][j] += Math.max(arr[i-1][j], arr[i-1][j-1]);
			}
		}
		if(n%2 == 0) {
			System.out.println(Math.max(arr[n][n/2], arr[n][n/2+1]));
		}else {
			System.out.println(arr[n][n/2+1]);
		}
	}

}
