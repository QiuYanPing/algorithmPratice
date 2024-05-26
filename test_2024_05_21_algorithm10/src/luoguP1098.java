import java.util.Scanner;
/***
 * 错误2，超时3
 */
public class luoguP1098 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int p1 = scanner.nextInt();
		int p2 = scanner.nextInt();
		int p3 = scanner.nextInt();
		String string = scanner.next();
		char[] array = string.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if(array[i] == '-') {
				if(array[i-1]>=array[i+1]) {
					System.out.print('-');
					continue;
				}
				char c = (char)((int)array[i-1]+1);
				if(c == array[i+1]) {
					continue;
				}
				if(p3 == 2) {
					//逆序
					if(p1 == 1) {
						//填充小写
						char x = array[i+1];
						while(true) {
							x = (char)((int)x-1);
							if(x == array[i-1])
								break;
							for (int j = 0; j < p2; j++) {
								System.out.print(x);
							}
						}
					}else if(p1 == 2) {
						//填充大写
						char x = array[i+1];
						while(true) {
							x = (char)((int)x-1);
							if(x == array[i-1])
								break;
							for (int j = 0; j < p2; j++) {
								String s = x+"";
								s = s.toUpperCase();
								System.out.print(s);
							}
						}
					}else {
						//填充*
						char x = array[i+1];
						while(true) {
							x = (char)((int)x-1);
							if(x == array[i-1])
								break;
							for (int j = 0; j < p2; j++) {
								System.out.print('*');
							}
						}
					}
				}else {
					if(p1 == 1) {
						//填充小写
						char x = array[i-1];
						while(true) {
							x = (char)((int)x+1);
							if(x == array[i+1])
								break;
							for (int j = 0; j < p2; j++) {
								System.out.print(x);
							}
						}
					}else if(p1 == 2) {
						//填充大写
						char x = array[i-1];
						while(true) {
							x = (char)((int)x+1);
							if(x == array[i+1])
								break;
							for (int j = 0; j < p2; j++) {
								String s = x+"";
								s = s.toUpperCase();
								System.out.print(s);
							}
						}
					}else {
						//填充*
						char x = array[i-1];
						while(true) {
							x = (char)((int)x+1);
							if(x == array[i+1])
								break;
							for (int j = 0; j < p2; j++) {
								System.out.print('*');
							}
						}
					}
				}
			}else {
				System.out.print(array[i]);
			}
		}
	}
}
