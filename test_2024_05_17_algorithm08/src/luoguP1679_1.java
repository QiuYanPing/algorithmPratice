import java.util.Scanner;
/**
 * TLE超时
 */
public class luoguP1679_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int[] dp = new int[m+1];
		//初始化
		for (int i = 1; i < m+1; i++) {
			dp[i] = Integer.MAX_VALUE;
		}
//		for (int i = 0; i < m+1; i++) {
//			dp[i][0] = 0;
//		}
		
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp.length; j++) {
				if (Math.pow(i, 4)>j)
					continue;
				dp[j] = Math.min(dp[j], dp[j-(int)Math.pow(i,4)]+1);					
				
			}
		}
		System.out.println(dp[m]);
	}
}
