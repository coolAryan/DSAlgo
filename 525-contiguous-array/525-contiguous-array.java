class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer>m=new HashMap<>();
        int lon=0;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            
                sum+=nums[i]==0?-1:1;
            
          
            if(sum==0)
            {
                if(lon<i+1)
                {
                 lon=i+1;
                }
            }
            if(m.containsKey(sum))
            {
                
                if(i-m.get(sum)>lon)
                {
                    lon=i-m.get(sum);
                }
            }
            else 
            {
                m.put(sum,i);
            }
            
        }
        return lon;
    }
}