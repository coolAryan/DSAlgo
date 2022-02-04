class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        int b[]=new int[2];
        while(i<j)
        {
            if(numbers[i]+numbers[j]==target)
            {
                b[0]=i+1;
                b[1]=j+1;
                break;
            }
            else if(numbers[i]+numbers[j]>target)
            {
                j--;
            }
            else if(numbers[i]+numbers[j]<target)
            {
                i++;
            }
            
        }
        return b;
    }
}