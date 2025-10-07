import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        return kSum(nums, target, 4, 0);
    }

    private List<List<Integer>> kSum(int[] nums, long target, int k, int start) {
        List<List<Integer>> res = new ArrayList<>();
        if (k == 2) {
            int left = start, right = nums.length - 1;
            while (left < right) {
                long sum = (long) nums[left] + nums[right];
                if (sum < target) 
                left++;
                else if (sum > target) 
                right--;
                else {
                    res.add(Arrays.asList(nums[left], nums[right]));
                    left++;
                    while (left < right && nums[left] == nums[left - 1]) left++;
                }
            }
            return res;
        }

        for (int i = start; i < nums.length - k + 1; i++) 
        {
            if (i > start && nums[i] == nums[i - 1]) 
            continue;
            List<List<Integer>> temp = kSum(nums, target - nums[i], k - 1, i + 1);
            for (List<Integer> t : temp)
            {
                List<Integer> quad = new ArrayList<>();
                quad.add(nums[i]);
                quad.addAll(t);
                res.add(quad);
            }
        }

        return res;
    }
}