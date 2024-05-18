import java.util.Scanner;

public class luoguP1055 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		int flag = 0;
		if(string.charAt(12) == 'X') {
			flag = 10;
		}else {
			flag = Integer.parseInt(string.charAt(12)+"");	
		}
		int sum = 0;
		sum+=Integer.parseInt(string.charAt(0)+"")*1;
		sum+= Integer.parseInt(string.charAt(2)+"")*2;
		sum+=Integer.parseInt(string.charAt(3)+"")*3;
		sum+=Integer.parseInt(string.charAt(4)+"")*4;
		sum+=Integer.parseInt(string.charAt(6)+"")*5;
		sum+=Integer.parseInt(string.charAt(7)+"")*6;
		sum+=Integer.parseInt(string.charAt(8)+"")*7;
		sum+=Integer.parseInt(string.charAt(9)+"")*8;
		sum+=Integer.parseInt(string.charAt(10)+"")*9;
		int res = sum%11;
		if(res == flag) {
			System.out.println("Right");
		}else {
			for (int i = 0; i < string.length()-1; i++) {
				System.out.print(string.charAt(i));
			}
			if(res == 10) {
				System.out.print("X");
			}else {
				System.out.print(res);
			}
		}
			
	}
}
