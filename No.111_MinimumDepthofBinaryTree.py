# coding: utf-8
# 类似于104题求最大深度，只是这里有一种特殊情况
# 如上当node某一子节点为空时，此时最小深度为2，不是1，因为要判断子节点是否为空的情况 
# author: wang huan

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def minDepth(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if not root:
            return 0
        if not root.left:     # 如果节点的左子节点为空
            return self.minDepth(root.right) + 1
        if not root.right:    # 如果节点的右子节点为空
            return self.minDepth(root.left) + 1
        
        return min(self.minDepth(root.left),self.minDepth(root.right)) + 1
        