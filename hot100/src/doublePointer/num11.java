package doublePointer;

public class num11 {
    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        int i = maxArea(height);
        System.out.println("i = " + i);
    }

    public static int maxArea(int[] height) {
        /**
         * 容量= min(h[left],h[right]) * (right-left)
         *  移动后，(right-left)一定变小，故需移动低的那根柱子，才有可能变大
         */

        int left = 0 ;
        int right = height.length-1;
        int max = Math.min(height[left],height[right]) * (right-left);
        while(left<right){
            if(height[left] < height[right]){
                left++;
            }else {
                right--;
            }
            int newMax = Math.min(height[left],height[right]) * (right-left);
            max = Math.max(max,newMax);
        }

        return max;
    }
}
