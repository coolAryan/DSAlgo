class Solution(object):
    def findSmallestSetOfVertices(self, n, edges):
        tlist=[0 for i in range(n)]
        for t in edges:
            s,d=t[0],t[1]
            tlist[d]+=1
        ans=[]
        for k in range(n):
            if tlist[k]==0:
                ans.append(k)
        return ans