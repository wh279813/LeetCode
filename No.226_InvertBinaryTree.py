# coding: utf-8 
# 大名鼎鼎的google卡住homebrew作者的面试题，翻转二叉树
# Google: 90% of our engineers use the software you wrote (Homebrew), but you can’t invert a binary tree on a whiteboard so fuck off.
# 这个题目并不是难思考，常用dfs就可以解决
# author : wanghuan


# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def invertTree(self, root):
        """
        :type root: TreeNode
        :rtype: TreeNode
        """
        if not root:
            return
        if root.left is None and root.right is None:
            return root
        return self.dfs(root)
         
        
    def dfs(self, node):
        # dfs方法返回的节点值，其子节点都已经翻转好
        """
        :type node: TreeNode
        :rtype: TreeNode
        """
        if not node:
            return 
        
        tmp = self.dfs(node.left)
        node.left = self.dfs(node.right)
        node.right = tmp
        
        return node
        
        
