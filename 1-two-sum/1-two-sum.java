class Solution {
    public int[] twoSum(int[] nums, int target) {
      
        int n=nums.length;
        int b[]=new int[2];
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
                {
                    int sum=nums[i]+nums[j];
                    if(sum==target)
                     {
                        b[0]=i;
                        b[1]=j;
                        return b;
                     }   
                }
        }
        return b;
    }
}