class Solution(object):
    def findSmallestSetOfVertices(self, n, edges):
        tlist=[[0,0] for i in range(n)]
        for t in edges:
            tlist[t[0]][1]+=1
            tlist[t[1]][0]+=1
        ans=[]
        for k in range(n):
            ind,outd=tlist[k]
            if ind==0:
                ans.append(k)
        return ans