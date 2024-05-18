import java.util.Scanner;


public class luoguP9024 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] hight = new int[n+1];
		int[] weight = new int[n];
		double area = 0;
		for (int i = 0; i < n+1; i++) {
			hight[i] = scanner.nextInt();
		}
		for (int i = 0; i < n; i++) {
			weight[i] =scanner.nextInt();
			area += weight[i]*hight[i]+weight[i]*(hight[i+1]-hight[i])*0.5;
		}
		System.out.printf("%.1f",area);
	}
}
