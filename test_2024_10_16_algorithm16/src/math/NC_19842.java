package math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NC_19842 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long gcd = gcd(a, b);
        List<Long> list = new ArrayList<>();
        //全部公约数为最大公因数的因数
        //剪枝
        long m = (long) Math.sqrt(gcd);
        for (long i = 1; i <= m; i++) {
            if (gcd % i == 0) {
                list.add(i);
                if (i != gcd / i) {
                    list.add(gcd / i);
                }
            }
        }
        Collections.sort(list);
        for (Long res : list) {
            System.out.print(res+" ");
        }
    }

    private static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}
