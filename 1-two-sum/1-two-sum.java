class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>m1=new HashMap<>();
        int n=nums.length;
        
        for(int i=0;i<n;i++)
        {
            int req=target-nums[i];
           
            if(m1.containsKey(req))
            {
               return new int[]{i,m1.get(req)};
            }
            else
            {
                m1.put(nums[i],i);
            }
        }
        return null;
        
    }
}