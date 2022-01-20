def f(src,graph):
    if len(graph)-1==src:
        return [[len(graph)-1]]
    ans=[]
    for adjnode in graph[src]:
        adj=f(adjnode,graph)
        ans.extend([[src]+x for x in adj])
    return ans
        

class Solution(object):
    def allPathsSourceTarget(self, graph):
        return f(0,graph)
        