import java.util.Iterator;
import java.util.Scanner;
/**
 * MLE超内存
 */
public class luoguP1679 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int[][] dp = new int[m+1][m+1];
		//初始化
		for (int i = 1; i < m+1; i++) {
			dp[0][i] = Integer.MAX_VALUE;
		}
//		for (int i = 0; i < m+1; i++) {
//			dp[i][0] = 0;
//		}
		
		for (int i = 1; i < m+1; i++) {
			for (int j = 1; j < m+1; j++) {
				int x = j/(int)Math.pow(i, 4);
				if(x == 0) {
					dp[i][j] = dp[i-1][j];
				}else {
					dp[i][j] = Math.min(dp[i-1][j], dp[i][j-x*(int)Math.pow(i,4)]+x);					
				}
			}
		}
		System.out.println(dp[m][m]);
		
	}
}
