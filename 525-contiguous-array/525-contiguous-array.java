class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer>m=new HashMap<>();
        int lon=0;
        int sum=0;
        m.put(0,-1);//for making sure in case we encounter 0,since we dont have 0 yet so -1 is used                     // as its value
        for(int i=0;i<nums.length;i++)
        {
            
                sum+=nums[i]==0?-1:1;  
           // if we encounter sum as 0 it means we have equal no of 0 and 1 ,
          // from the start till curr index. so =>i+1
           
            //if we encounter same sum value again ,it means equal 0 and 1,
            //between same sum value that had occured previously and now so=>i-m.get(sum)
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