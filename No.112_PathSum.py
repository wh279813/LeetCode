#coding: utf-8
# dfs搜索问题：
#   对于判断是否至少存在一个可能性的问题，
#   直接return 左递归 or 右递归 即可 
#   不用设全局变量来存储结果


# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def hasPathSum(self, root, sum):
        """
        :type root: TreeNode
        :type sum: int
        :rtype: bool
        """
        if(root == None):
            return False
        if(root.left or root.right):
            return self.hasPathSum(root.left, sum - root.val) or self.hasPathSum(root.right,sum - root.val)
        if(sum == root.val):
            return True
        else:
            return False