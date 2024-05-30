import java.util.Scanner;

public class luoguP3152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int num = f(n);
		System.out.println(num);
	}

	private static int f(int n) {
		// TODO Auto-generated method stub
		if(n == 1)
			return 1;
		int mid =n/2;
		
		return f(mid)+1;
	}

}
