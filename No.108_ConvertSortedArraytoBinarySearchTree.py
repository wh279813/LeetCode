# coding: utf-8
# 构建平衡二叉树的问题（二分法）
# 基于有序数列建立AVL: 递归法，二分，不断找到当前数组的中点作为节点
# author: wang huan

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def sortedArrayToBST(self, nums):
        """
        :type nums: List[int]
        :rtype: TreeNode
        """
        l = len(nums)
        if(l == 0):             # 二分法跳出条件为nums长度为0
            return
    
        root = TreeNode(nums[l/2])
        root.left = self.sortedArrayToBST(nums[:l/2])               # 递归建立左子节点
        root.right = self.sortedArrayToBST(nums[l/2 + 1:])          # 递归建立右子节点
        return root