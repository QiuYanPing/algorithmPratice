import java.util.Scanner;

public class lanqiao760 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int num = f(n);
		System.out.println(num);
	}

	private static int f(int n) {
		// TODO Auto-generated method stub
		if(n/2 == 0)
			return 1;
		int num = n/2;
		int sum = 1;
		for (int i = 1; i <= num; i++) {
			sum += f(i);
		}
		return sum;
	}

}
