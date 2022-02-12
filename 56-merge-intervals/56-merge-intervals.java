class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(i1,i2)->Integer.compare(i1[0],i2[0]));
        List<int[]>res=new ArrayList<>();
        int curr[]=intervals[0];
        for(int[] nextinterval:intervals)
        {
            if(curr[1]>=nextinterval[0])
            {
                if(curr[1]<=nextinterval[1])
                {
                    curr[1]=nextinterval[1];
                }
            }
            else
            {
                res.add(curr);
                curr=nextinterval;
            }
        }
        res.add(curr);
        return res.toArray(new int[res.size()][]);
    }
}