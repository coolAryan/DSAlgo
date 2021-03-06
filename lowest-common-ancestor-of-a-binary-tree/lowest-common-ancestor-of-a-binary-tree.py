# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        if root:
            if root.val==p.val or root.val==q.val:
                return root
            l,r=self.lowestCommonAncestor(root.left,p,q),self.lowestCommonAncestor(root.right,p,q)
            if l and r:
                return root
            return l if l else r
        return None
        