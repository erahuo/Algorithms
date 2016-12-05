public class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        int cnt = 0;
        if(nums == null || nums.length < 3) {
            return cnt;
        } else {
            Arrays.sort(nums);
            for(int k = 0; k < nums.length; k++) {
                int i = k + 1, j = nums.length - 1;
                while(i < j) {
                    int sum = nums[k] + nums[i] + nums[j];
                    if(sum < target) {
                        cnt += (j - i);
                        i++;
                    } else {
                        j--;
                    }
                }
            }
        }
        return cnt;
    }
}