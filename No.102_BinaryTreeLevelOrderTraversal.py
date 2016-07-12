# coding: utf-8
#	广度优先遍历问题，目标是把属于同一层的节点聚集在一起
#	思路： 引入一个Queue，把属于同一层的节点放入Queue， 再依次把Queue里的节点值get()到list中
# author : wang huan

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def levelOrder(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        import Queue

        if not root:
        	return []

        result = []
        myQueue = Queue.Queue()
       	myQueue.put(root)     # 将根节点（第一层）放入队列中
       	while not myQueue.empty():
       		size = myQueue.qsize()
       		tmp = []
       		for i in range(size):
       			node = myQueue.get()
       			if node.left:
       				myQueue.put(node.left)
       			if node.right:
       				myQueue.put(node.right)
       			tmp.append(node.val)
       		result.append(tmp)

       	return result





        
  