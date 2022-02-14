
class Solution {
//     class myComparator implements Comparator<Interval>
// {
//     public int compare(Interval a,Interval b)

//     {
//         return a.end-b.end;
//     }
// }
    public int eraseOverlapIntervals(int[][] intervals) {
        
        
        Arrays.sort(intervals,(i1,i2)->Integer.compare(i1[1],i2[1]));
        int end=intervals[0][1];
        int count=1;
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]>=end)
            {
                end=intervals[i][1];
                count++;
            }
        }
        return intervals.length-count;
        
       
    }
 
        
}