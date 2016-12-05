public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> rst = new ArrayList<>();
        if(nums == null || nums.length < 4) return rst;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            if(i != 0 && nums[i] == nums[i-1]) {
                continue;
            }
            for(int j = i+1; j < nums.length; j++) {
                if(j != i+1 && nums[j] == nums[j-1]) {
                    continue;
                }
                int a = nums[i], b = nums[j], c = 0, d = 0;
                int m = j + 1, n = nums.length - 1;
                while(m < n) {
                    c = nums[m];
                    d = nums[n];
                    if(a + b + c + d == target) {
                        List<Integer> tuple = new ArrayList<>();
                        tuple.add(a); tuple.add(b); tuple.add(c); tuple.add(d); 
                        rst.add(tuple);
                        while(m < n && nums[m] == nums[m + 1]) {
                            m++;
                        }
                        while(m < n && nums[n] == nums[n - 1]) {
                            n--;
                        }
                        m++;
                        n--;
                    } else if(a + b + c + d < target) {
                        m++;
                    } else {
                        n--;
                    }
                }
            }
        }
        return rst;
    }
}