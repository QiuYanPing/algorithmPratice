package math;

import java.util.Arrays;
import java.util.Scanner;

public class NC_254015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //宽度：n
        //数组大小4n*4n
        char[][] map = new char[4*n][4*n];
        int count = 0;
        for (int i = 0; i < map[0].length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if(i<3*n) {
                    if(j<n || j>3*n-1){
                        /*map[i][j] = '*';*/
                        System.out.print('*');
                    }else{
                        /*map[i][j] = '.';*/
                        System.out.print('.');
                    }
                }else{
                    if(j>count && j<count+n+1 || j<4*n-1-count && j>3*n-2-count){
                        /*map[i][j] = '*';*/
                        System.out.print('*');

                    }else{
                        /*map[i][j] = '.';*/
                        System.out.print('.');
                    }
                }
            }
            System.out.println();
            if(i>=3*n)
                count++;
        }

    }
}
