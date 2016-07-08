# coding: utf-8
# 判断是否两个二叉树相等：
#   1. 如果都为空，则相等，如果只有一个为空，则不等
#   2. 递归判断两个节点的左右子节点
# 注意第32行，需要将递归的函数返回值（布尔型）返回





# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def isSameTree(self, p, q):
        """
        :type p: TreeNode
        :type q: TreeNode
        :rtype: bool
        """
        if (p is None and q is None):
            return True
        if (p is None and q is not None):
            return False
        if (p is not None and q is None):
            return False
        if (p.val == q.val):
            return self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right)
        else:
            return False
        
        