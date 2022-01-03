# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def buildTree(self, inorder: List[int], postorder: List[int]) -> Optional[TreeNode]:
        val=postorder[-1]
        print(val)
        root=TreeNode(val)
        ino=inorder.index(val)
        root.left=self.buildTree(inorder[:ino],postorder[:ino])if ino else None
        root.right=self.buildTree(inorder[ino+1:],postorder[ino:-1])if ino!=len(inorder)-1 else None
        return root
        