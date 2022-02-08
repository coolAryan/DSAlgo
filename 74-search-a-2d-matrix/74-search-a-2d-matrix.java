class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++)
        {
            int k=0;
            int j=m;
         while(k<j)
         {
          int mid=(k+j)/2;   
           if(target==matrix[i][mid])
           {
               return true;
           }
            else if(target>matrix[i][mid])
            {
                k=mid+1;
            }
             else
             {
                 j=mid;
                 
             }
        }
            
        }
        return false;
    }
}