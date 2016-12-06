public class Solution {
    public void moveZeroes(int[] nums) {
        if(nums == null) return; 
        int j = -1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[++j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }
    }
}