#coding: utf-8  
# 动态规划问题：
#   某一个节点所拥有的层数dp[node]，等于其两个字节点中，拥有层数较多的那一个 max(dp[node.left],dp[node.right]) + 1

#Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def maxDepth(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if not root:
            return 0
        
        return max(self.maxDepth(root.left),self.maxDepth(root.right)) + 1
        
        