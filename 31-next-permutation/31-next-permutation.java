class Solution {
    void swap(int nums[],int c,int j)
    {
        int t=nums[c];
        nums[c]=nums[j];
        nums[j]=t;
       
    }
    void reverse(int nums[],int k,int j)
    {
        while(k<j)
        {
            // System.out.println(nums[k]+" "+nums[j]);
            swap(nums,k,j);
             // System.out.println(nums[k]+" "+nums[j]);
            k++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        if(n<2)
        {
            return;
        }
        int i=n-2;
        
        while(i>=0 && nums[i]>=nums[i+1])
        {
                i--;
            
        }
        // System.out.println(c+" "+nums[c]);
        int j=n-1;
        if(i>=0)
        {
            while(nums[j]<=nums[i])
            {
                j--;
            }
            // System.out.println(j+" "+nums[j]);
            swap(nums,i,j);
        }
        // System.out.println(nums[c]+" "+nums[j]);
        reverse(nums,i+1,n-1);
        
    }
}