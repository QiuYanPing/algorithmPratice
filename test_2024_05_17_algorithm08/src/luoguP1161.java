import java.util.ArrayList;
import java.util.Scanner;

public class luoguP1161 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
//		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for (int i = 0; i < 2000000; i++) {
			list.add(0);
		}
		Scanner scanner  = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i <n; i++) {
			float a = scanner.nextFloat();
			int t = scanner.nextInt();
			for (int j = 1; j <= t; j++) {
				int index = (int)(a*j);
				index = index-1;
//				list2.add(index);
				if(list.get(index) == 0) {
					list.remove(index);
					list.add(index,1);
				}else {
					list.remove(index);
					list.add(index,0);
				}
			}
		}
		int indexOf = list.indexOf(1);
		System.out.println(indexOf+1);
//		for (int i = 0; i < list2.size(); i++) {
//			System.out.println(list2.get(i)+" ");
//		}
	}
}
