class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int answer[]=new int[n];
        answer[0]=1;
        
        for(int i=1;i<n;i++)
        {
           
            answer[i]=nums[i-1]*answer[i-1];
           
            
             
            
        }
        int temp=1;
        for(int i=n-2;i>=0;i--)
        {
            answer[i]*=nums[i+1]*temp;
           temp=temp*nums[i+1];
                
        }
         return answer;
    }
}