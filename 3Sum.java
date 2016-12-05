public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> rst = new ArrayList<>();
        if(nums == null || nums.length < 3) return rst;
        Arrays.sort(nums);
        for(int k = 0; k < nums.length; k++) {
            if(k == 0 || nums[k-1] != nums[k]) {
                int c = 0 - nums[k];
                int i = k + 1, j = nums.length - 1;
                while(i < j) {
                    int a = nums[i], b = nums[j];
                    if(a + b == c) {
                        List<Integer> item = new ArrayList<>();
                        item.add(a); item.add(b); item.add(-c); 
                        rst.add(item);
                        i++; j--;
                        while(i < j && nums[i-1] == nums[i]) {
                            i++;
                        }
                        while(i < j && nums[j+1] == nums[j]) {
                            j--;
                        }
                    } else if(a + b < c) {
                        i++;
                    } else {
                        j--;
                    }
                    
                }
            }
        }
        return rst;
    }
}