import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/**
 * 8个案例错误
 */
public class luoguP1047 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int l = scanner.nextInt()+1;
		int m = scanner.nextInt();
//		int[][] arr = new int[m+1][2];
//		for (int i = 0; i < m; i++) {
//			arr[i][0] = scanner.nextInt();
//			arr[i][1] = scanner.nextInt();
//		}
		
		Area[] areas = new Area[m];
		//排序
		for (int i = 0; i < m; i++) {
			int u = scanner.nextInt();
			int v = scanner.nextInt();
			areas[i] = new Area(u, v);
		}
		Arrays.sort(areas);
		int j = 0;
		int start = areas[0].a;
		int end = areas[0].b;
		while(true) {
			if(areas[j].b < areas[j+1].a && j+1<m) {
				end = areas[j].b;
				l -= end-start+1;
				if(j+1<m)
					start = areas[j+1].a;
				else 
					break;
			}
			if(j+1 == m-1) {
				end = areas[j+1].b;
				l -= end - start +1;
				break;
			}
			j++;
		}
		System.out.println(l);
		
	}
	
}
class Area implements Comparable<Area>{
	int a;
	int b;
	public Area(int a,int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public int compareTo(Area o) {
		// TODO Auto-generated method stub
		return this.a-o.a;
	}
	
}
