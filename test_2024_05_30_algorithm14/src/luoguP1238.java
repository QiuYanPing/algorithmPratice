import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class luoguP1238 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		int[][] arr = new int[m+2][n+2];
		int[] start = new int[2];
		int[] end = new int[2];
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				arr[i][j] =scanner.nextInt();
			}
		}
		start[0] = scanner.nextInt();
		start[1]= scanner.nextInt();
		end[0] = scanner.nextInt();
		end[1] = scanner.nextInt();
		LinkedList<LinkedList<Integer[]>> lines = new LinkedList<LinkedList<Integer[]>>();
		
		dfs(start,end,new LinkedList<Integer[]>(),lines,arr);
		
		if(lines.size() == 0) {
			System.out.println(-1);
		}
		
	}

	private static void dfs(int[] start, int[] end, LinkedList<Integer[]> line,
			LinkedList<LinkedList<Integer[]>> lines,int[][] arr) {
		if(start[0] == end[0] && start[1] == end[1]) {
			lines.push(new LinkedList<Integer[]>(line));
			int num = 0;
			for (int i = line.size()-1; i >= 0 ; i--) {
				Integer[] node = line.get(i);
				if(num == 0) {
					System.out.print("("+node[0]+","+node[1]+")");
				}
				else {
					System.out.print("->"+"("+node[0]+","+node[1]+")");
				}
				
				num++;
			}
			System.out.print("->"+"("+end[0]+","+end[1]+")");
			System.out.println();
			return;
		}
		if(arr[start[0]][start[1]-1] == 1) {//左
			arr[start[0]][start[1]] = 0;
			Integer[] node = {start[0],start[1]};
			line.push(node);
			
			int[] tmp = {start[0],start[1]-1};
			dfs(tmp, end, line, lines, arr);
			
			line.pop();
			arr[start[0]][start[1]] = 1;
		}
		if(arr[start[0]-1][start[1]] == 1) {//上
			arr[start[0]][start[1]] = 0;
			Integer[] node = {start[0],start[1]};
			line.push(node);
			
			int[] tmp = {start[0]-1,start[1]};
			dfs(tmp, end, line, lines, arr);
			
			line.pop();
			arr[start[0]][start[1]] = 1;
		}
		if(arr[start[0]][start[1]+1] == 1) {//右
			arr[start[0]][start[1]] = 0;
			Integer[] node = {start[0],start[1]};
			line.push(node);
			
			int[] tmp = {start[0],start[1]+1};
			dfs(tmp, end, line, lines, arr);
			
			line.pop();
			arr[start[0]][start[1]] = 1;
		}
		
		if(arr[start[0]+1][start[1]] == 1) {//下
			arr[start[0]][start[1]] = 0;
			Integer[] node = {start[0],start[1]};
			line.push(node);
			
			int[] tmp = {start[0]+1,start[1]};
			dfs(tmp, end, line, lines, arr);
			
			line.pop();
			arr[start[0]][start[1]] = 1;
		}
		
		// TODO Auto-generated method stub
		
	}

}
