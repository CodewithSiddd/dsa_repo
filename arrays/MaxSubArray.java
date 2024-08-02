//Leetcode question - 

class Solution {

    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int sum = 0;
        for(int i : nums) {
            sum = sum + i;
            if(sum > maxSum) {
                maxSum = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }

}
