# coding: utf-8
# 此题基于第104题，动态规划法求节点深度 
#   平衡二叉树（AVL）定义：要么是一棵空树，要么左右子树都是AVL树，并且左右子树的深度之差的绝对值不大于1
#   现已有节点深度，再依次遍历每一个节点，看是否全部满足左右子树深度差绝对值不大于1


# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def isBalanced(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if not root:
            return True
        nLeft = self.NodeDepth(root.left)
        nRight = self.NodeDepth(root.right)
        if( nLeft - nRight > 1 or nRight - nLeft > 1):
            return False
        return self.isBalanced(root.left) and self.isBalanced(root.right)
        
    def NodeDepth(self,node):  
        """
        DP获取树的节点深度，同104题
        :type root: TreeNode
        :rtype: int
        """
        if not node:
            return 0
        return max(self.NodeDepth(node.left),self.NodeDepth(node.right)) + 1
        
        