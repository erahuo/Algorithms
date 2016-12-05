public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Integer rst = null;
        if(nums == null || nums.length < 3) {
            return rst;
        } else {
            Arrays.sort(nums);
            for(int k = 0; k < nums.length; k++) {
                if(k == 0 || nums[k-1] != nums[k]) {
                    int i = k + 1, j = nums.length - 1;
                    while(i < j) {
                        int sum = nums[k] + nums[i] + nums[j];
                        if(rst == null || Math.abs(target - sum) < Math.abs(target - rst)) {
                            rst = sum;
                        }
                        if(sum == target) {
                            return rst;
                        } else if (sum < target) {
                            i++;
                        } else {
                            j--;
                        }
                    }
                }
            }
        }
        return rst;
    }
}