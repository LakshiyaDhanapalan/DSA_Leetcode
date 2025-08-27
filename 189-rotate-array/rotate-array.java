class Solution {
    public void rotate(int[] nums, int k) 
    {
        int n = nums.length;
        if (n <= 1) 
        return;   
        k = k % n;
        if (k == 0)
         return;
         int nums1[]=new int[n];
         for(int i=0;i<n;i++)
         {
            nums1[(i + k) % n]=nums[i];
         }
         for(int i=0;i<n;i++){
         nums[i]=nums1[i];
         }

    }

}