class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals=sorted(intervals,key=lambda x:x[0])
        curr=intervals[0]
        res=[]
        for nextInterval in intervals:
            if nextInterval[0]<=curr[1]:
                if nextInterval[1]>curr[1]:
                    curr[1]=nextInterval[1]
            else:
                res.append(curr)
                curr=nextInterval
        res.append(curr)
        return res
            
                