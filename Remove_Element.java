public class Solution {
    public int removeElement1(int[] nums, int val) {
        // if there are a lot of elements to remove
        int j = -1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                int temp = nums[++j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }
        return j+1;
    }
    public int removeElement2(int[] nums, int val) {
        // if there are only a few elements to remove
        int n = nums.length;
        for(int i = nums.length - 1; i >= 0; i--) {
            if(nums[i] == val) {
                nums[i] = nums[n-1];
                n--;
            }
        }
        return n;
    }
}