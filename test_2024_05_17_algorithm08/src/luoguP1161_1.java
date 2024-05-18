import java.util.ArrayList;
import java.util.Scanner;

public class luoguP1161_1 {
	public static void main(String[] args) {
		int[] arr = new int[2000000];
//		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		Scanner scanner  = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i <n; i++) {
			double a = scanner.nextDouble();
			int t = scanner.nextInt();
			for (int j = 1; j <= t; j++) {
				int index = (int)(a*j);
				index = index-1;
//				list2.add(index);
				if(arr[index] == 0) {
					arr[index] = 1;
				}else {
					arr[index] = 0;
				}
			}
		}
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 1) {
				res = i+1;
				break;
			}
		}
		System.out.println(res);
//		for (int i = 0; i < list2.size(); i++) {
//			System.out.println(list2.get(i)+" ");
//		}
	}
}
