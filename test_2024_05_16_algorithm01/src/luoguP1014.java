import java.util.Scanner;

public class luoguP1014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int i = 1;
		for (; ; i++) {
			if(x<i)
				break;
			x = x-i;
		}
		if(i%2 == 0)
			System.out.println(x+"/"+(i+1-x));
		else 
			System.out.println((i+1-x)+"/"+x);
	}

}
