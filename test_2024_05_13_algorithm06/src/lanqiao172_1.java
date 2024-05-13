

import java.util.Arrays;
import java.util.Scanner;
/**
 * 段错误
 * 多个案列答案错误
 */
public class lanqiao172_1 {
	// TODO Auto-generated method stub
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = scanner.nextInt();
		}
		for (int i = 0; i < n; i++) {
			c[i] = scanner.nextInt();
		}
		//二分查找之前要进行排序
		Arrays.sort(a);
		Arrays.sort(c);
		for (int i = 0; i < b.length; i++) {
			int aNum = binarySearch(a,b[i]);
			int cNum = c.length - binarySearch(c,b[i]);
			if(c[binarySearch(c, b[i])] == b[i])
				cNum--;
			sum += aNum*cNum;
		}
		System.out.println(sum);
	}
	public static int binarySearch(int[] arr,int x) {
		int left = 0;
		int right = arr.length-1;
		int mid = (left+right)/2;
		while(left<=right) {
			if(arr[mid] == x) 
				return mid;
			if(arr[mid]>x)
				right = mid-1;
			else 
				left = mid+1;
			mid = (left+right)/2;
		}
		return left;
	}

}
