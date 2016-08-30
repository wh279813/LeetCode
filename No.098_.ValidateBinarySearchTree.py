# coding: utf-8
# Binary search tree要求左右子节点的值有要求，
# 而且要求左右子树里面所有的节点都相对于根节点满足要求。
# author: wang huan

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param {TreeNode} root
    # @return {boolean}
    def isValidBST(self, root):
        if not root:
            return True
        
        return self.isValidSubTree(root, float('-inf'), float('inf'))
        
    def isValidSubTree(self, node, lower, upper):
        return node.val < upper and node.val > lower \
        and (self.isValidSubTree(node.left, lower, node.val) if node.left else True) \
        and (self.isValidSubTree(node.right, node.val, upper) if node.right else True)

# 总结: 在python中，min和max是系统函数，不能用做自定义变量声明