import java.util.ArrayList;
import java.util.Scanner;

public class luoguP1003 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] arr =new int[10000][10000];
//		ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();
		for (int i = 1; i <= n; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int g = scanner.nextInt();
			int k = scanner.nextInt();
			for (int j = a; j <= a+g; j++) {
				for (int j2 = b; j2 < b+k; j2++) {
					arr[j][j2] = i;
					
				}
			}
		}
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		if(arr[x][y] == 0)
			System.out.println(-1);
		else {
			System.out.println(arr[x][y]);
		}
	}
}
