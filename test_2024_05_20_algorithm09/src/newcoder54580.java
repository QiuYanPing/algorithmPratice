import java.util.Scanner;

public class newcoder54580 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			System.out.println(num(x));
		}
	}

	private static int num(int x) {
		// TODO Auto-generated method stub
		//求素数个数<=x
		int count = 0;
		for (int i = 2; i <= x; i++) {
			if(isPrime(i)) {
				count++;
			}
		}
		return count;
	}
	private static boolean isPrime(int x) {
		int flag = 0;
		for (int i = 2; i < x; i++) {
			if(x%i == 0) {
				flag =1;
				break;
			}
		}
		if(flag == 0) {
			return true;
		}else {
			return false;
		}
	}
}
