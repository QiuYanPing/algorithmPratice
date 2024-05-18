import java.util.Scanner;

public class luoguP1003_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
//		int[][] arr =new int[10000][10000];
		int[] a = new int[n];
		int[] b = new int[n];
		int[] g = new int[n];
		int[] k = new int[n];
//		ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();
		int result = 0;
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
			b[i] = scanner.nextInt();
			g[i] = scanner.nextInt();
			k[i] = scanner.nextInt();
			
		}
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			if(x>=a[i] && x<=a[i]+g[i] 
					&& y>=b[i] && y<=b[i]+k[i]) {
				result = i+1;
			}
		}
		if(result == 0)
			System.out.println(-1);
		else {
			System.out.println(result);
		}
	}
}
