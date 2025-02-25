package hash;

import java.util.HashSet;

public class num128 {
    public static void main(String[] args) {

    }
    public static int longestConsecutive(int[] nums) {
        //要求时间复杂度为o(n)
        //使用哈希表可以优化

        //去重
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int length = 0;
        for (Integer num : set) {
            if(!set.contains(num - 1)){
                //不存在，说明没有计算过
                int target = num+1;
                int size = 1;
                while(set.contains(target)){
                    size++;
                    target += 1;
                }
                length = Math.max(length,size);
            }
        }
        return length;
    }
}
