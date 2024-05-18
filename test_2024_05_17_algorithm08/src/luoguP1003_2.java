import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * Mle内存
 */
public class luoguP1003_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
//		Scanner scanner = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter writer = new PrintWriter(System.out);
		int n = Integer.parseInt(reader.readLine());
		int[][] arr =new int[10000][10000];
//		ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();
		StringBuffer stringBuffer = new StringBuffer();
		char c ;
		for (int i = 1; i <= n; i++) {
			stringBuffer = new StringBuffer();
			while((c = (char)reader.read()) != ' ') {
				stringBuffer.append(c);
			}
			int a = Integer.parseInt(stringBuffer.toString());
			
			stringBuffer = new StringBuffer();
			while((c = (char)reader.read()) != ' ') {
				stringBuffer.append(c);
			}
			int b = Integer.parseInt(stringBuffer.toString());
			
			stringBuffer = new StringBuffer();
			while((c = (char)reader.read()) != ' ') {
				stringBuffer.append(c);
			}
			int g = Integer.parseInt(stringBuffer.toString());
			
			stringBuffer = new StringBuffer();
			while((c = (char)reader.read()) != '\r') {
				stringBuffer.append(c);
			}
			reader.read();
			int k = Integer.parseInt(stringBuffer.toString());
			for (int j = a; j <= a+g; j++) {
				for (int j2 = b; j2 <= b+k; j2++) {
					arr[j][j2] = i;
					
				}
			}
		}
		stringBuffer = new StringBuffer();
		while((c = (char)reader.read()) != ' ') {
			stringBuffer.append(c);
		}
		int x = Integer.parseInt(stringBuffer.toString());
		
		stringBuffer = new StringBuffer();
		while((c = (char)reader.read()) != '\r') {
			stringBuffer.append(c);
		}
		int y = Integer.parseInt(stringBuffer.toString());
		if(arr[x][y] == 0)
			writer.print(-1);
		else {
			writer.print(arr[x][y]);
		}
		reader.close();
		writer.close();
	}
}
