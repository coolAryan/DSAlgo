class Solution(object):
    def findRedundantConnection(self, edges):
        par=[i for i in range(1001)]
        for e in edges:
            pi,pj=e
            while par[pi]!=pi:
                pi=par[pi]
            while par[pj]!=pj:
                pj=par[pj]
            if pi!=pj:
                
                par[pi]=pj
            else:
                return e
        