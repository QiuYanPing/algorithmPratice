import java.util.Iterator;
import java.util.Scanner;
/**
 *4个答案错误
 */
public class lanqiao1037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//求贡献度
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		int sum = 0;
		//只有单独一个有效字符的情况
		for (int i = 0; i < string.length(); i++) {
			int left = 0;
			int right = 0;
			for (int j = i-1; j >=0; j--) {
				if(string.charAt(i) != string.charAt(j)) {
					left++;					
				}else {
					break;
				}
			}
			for (int j = i+1; j < string.length(); j++) {
				if(string.charAt(i) != string.charAt(j)) {
					right++;
				}else {
					break;
				}
			}
			sum +=(left+1)*(right+1);
		}
		//子串中存在两个及以上的有效字符的情况
		for (int i = 0; i < string.length(); i++) {
			int rightIndex = 0;
			int left = 0;
			int right = 0;
			for (int j = i+1; j < string.length(); j++) {
				if(string.charAt(i) == string.charAt(j)) {
					rightIndex = j;
					break;
				}
			}
			if(rightIndex != 0 ) {
				for (int j = i-1; j >=0; j--) {
					if(string.charAt(i) != string.charAt(j)) {
						left++;					
					}else {
						break;
					}
				}
				right = string.length()-rightIndex;
				sum +=(left+1)*right;
				
			}
		}
		System.out.println(sum);
	}

}
