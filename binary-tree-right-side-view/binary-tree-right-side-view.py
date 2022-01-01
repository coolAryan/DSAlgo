# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
def f(root,m,y):
    if root:
        m[y]=root.val
        f(root.left,m,y+1)
        f(root.right,m,y+1)
class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        m=dict()
        f(root,m,0)
        return m.values()