package doublePointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class num15 {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> lists = threeSum(nums);
        System.out.println(lists);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        /**
         * 要求不重复，可以对数组进行排序解决
         *  暴力求解的时间复杂度为O(n^3)
         *
         *  优化：固定一个，后使用双指针找两数之和
         */


        List<List<Integer>> lists = new ArrayList<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; ) {
            int a = nums[i];
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                if(nums[left]+nums[right] == -a){
                    //三数和为0
                    List<Integer> list = new ArrayList<>();
                    list.add(a);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    lists.add(list);
                    //移动到下一个不重复的位置
                    left++;
                    while(nums[left] == nums[left-1])
                        left++;
                }else if(nums[left]+nums[right] <-a ){
                    left++;
                }else{
                    right--;
                }
            }
            //找到下一个不重复的值
            i++;
            while(i<nums.length && nums[i] == nums[i-1] )
                i++;
        }
        return lists;
    }
}
