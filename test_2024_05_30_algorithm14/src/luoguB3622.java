import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class luoguB3622 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		dfs(n,new LinkedList<Character>());
	}

	private static void dfs(int n, LinkedList<Character> list) {
		// TODO Auto-generated method stub
		if(list.size() == n) {
			//输出一种选择方案
			for (int i = list.size()-1; i >= 0; i--) {
				System.out.print(list.get(i));
			}
			
			System.out.println();
			return;
		}
		list.push('N');
		dfs(n, list);
		list.pop();
		list.push('Y');
		dfs(n, list);
		list.pop();
		
	}
}
