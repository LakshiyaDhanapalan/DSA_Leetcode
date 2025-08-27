class Solution {
    public int maxSubArray(int[] nums)
     {
        int current_sum=nums[0];
        int maxsum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            current_sum=Math.max(nums[i],current_sum+nums[i]);
            maxsum=Math.max(current_sum,maxsum);
        }
        return maxsum;
    }
}