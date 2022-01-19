class Solution(object):
    def findCircleNum(self, isConnected):
        v=len(isConnected)
        par=[i for i in range(v)]
        # print(par)
        count=v
        for i in range(v):
            for j in range(i+1,v):
                if isConnected[i][j]==1:
                    # print(i,j)
                    pi,pj=i,j
                    while par[pi]!=pi:
                        pi=par[pi]
                    while par[pj]!=pj:
                        pj=par[pj]
                    if pi!=pj:
                        count-=1
                        par[pi]=pj
        return count
        