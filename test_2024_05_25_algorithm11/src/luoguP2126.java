import java.util.Arrays;
import java.util.Scanner;

public class luoguP2126 {
	/**
	 * @param args
	 */
	static int[] fa ;//并查集
	public static void main(String[] args) {
		/**
		 * Kruskal最小生成树（连接所有顶点，用最小的权重）
		 * 并查集实现
		 */
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		Phone[] phones = new Phone[m];
		int weight = 0;
		fa = new int[n+1];
		for (int i = 0; i < m; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int c = scanner.nextInt();
			phones[i] = new Phone(x,y,c);
		}
		Arrays.sort(phones);
		
		for (int i = 0; i < fa.length; i++) {
			fa[i] = i;
		}
		for (int i = 0; i < phones.length; i++) {
			int x = phones[i].x;
			int y = phones[i].y;
			int c = phones[i].c;
			if(!judge(x,y)) {
				//不在同一个集合中，将x加入y的集合中
				weight += c;
				merge(x,y);
			}
		}
		System.out.println(weight);
		
	}
	
	private static int find(int x) {
		return x == fa[x]?x:find(fa[x]);
	}
	private static boolean judge(int x, int y) {
		// TODO Auto-generated method stub
		return find(x) == find(y);
	}
	private static void merge(int x, int y) {
		// TODO Auto-generated method stub
		fa[find(x)] = find(y);
	}
	
}
class Phone implements Comparable<Phone>{
	int x ;
	int y;
	int c;
	public Phone(int x, int y, int c) {
		this.x = x;
		this.y = y;
		this.c = c;
	}
	@Override
	public int compareTo(Phone o) {
		// TODO Auto-generated method stub
		return this.c - o.c;
	}
	
}
