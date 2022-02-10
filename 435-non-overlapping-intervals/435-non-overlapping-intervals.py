class Solution:
    def eraseOverlapIntervals(self, intervals: List[List[int]]) -> int:
        c=1
        intervals=sorted(intervals,key=lambda x:x[1])
        
        print(intervals)
        prevend=intervals[0][1]
        for s,e in intervals[1:]:
            if s>=prevend:
                prevend=e
                c+=1
            
        return len(intervals)-c
            
            
            
            
            
            
            
            
            
            
            
    
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        #     print(intervals)
        #     if nextInterval[0]<curr[1] and nextInterval[1]>=curr[1]:
        #         print("c1")
        #         print(curr)
        #         # intervals.pop(nextInterval)
        #         print(nextInterval)
        #         print(intervals)
        #         c=c+1
        #     elif nextInterval[1]<curr[1]:
        #         c=c+1
        #         # intervals.pop(nextInterval)
        #     elif nextInterval[1]==curr[1]:
        #         print("c2")
        #         # intervals.pop(nextInterval)
        #         c=c+1
        #     curr=nextInterval
        # return c