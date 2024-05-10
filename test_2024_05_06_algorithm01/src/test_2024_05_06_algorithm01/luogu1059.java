package test_2024_05_06_algorithm01;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class luogu1059 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Set<Integer> set = new TreeSet<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1-o2;
			}
			
		});
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			set.add(x);
		}
		System.out.println(set.size());
		Integer[] array = (Integer[])set.toArray(new Integer[set.size()]);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

}
