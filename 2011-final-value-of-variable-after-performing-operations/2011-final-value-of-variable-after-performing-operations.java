class Solution {
    public int finalValueAfterOperations(String[] operations) {
       int sum=0;
        for(int i=0;i<operations.length;i++)
        {
            String s=operations[i];
            // System.out.print(s+" ");
           if(s.charAt(1)=='+')
           {
               sum+=1;
               System.out.print(s+" ");
           }
            else
            {
                sum-=1;
            }
        }
        return sum;
    }
}