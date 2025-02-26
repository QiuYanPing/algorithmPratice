package doublePointer;

import java.util.Arrays;

public class num283 {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

    }
    public static void moveZeroes(int[] nums) {
        if(nums.length == 0)
            return;
        for (int i = 0; i < nums.length; i++) {
            while(i<nums.length && nums[i] != 0 )
                i++;

            int j = i+1;
            while(j<nums.length && nums[j] == 0)
                j++;

            if(i<nums.length && j<nums.length){
                //交换值
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
    }
}
