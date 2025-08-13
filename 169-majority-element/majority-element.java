class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num : nums)
        {
           map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int max=nums[0];
        int max_count=0;
        for(int key : map.keySet())
        {
            if(map.get(key)>max_count)
            {
                max_count=map.get(key);
                max=key;
            }
        }
  
     return max;

        
    }
}