# 提交不成功，因为leetcode给出二叉树结构不明，错误不明确
# BFS解决二叉树问题：（利用queue）
#   1. 首先声明一个queue，只包含根节点
#   2. 循环：当queue长度不为0时，循环len(queue)次，把每个node从queue中pop出来，并把其子节点压入queue中
#   3. 循环知道queue为空
# author : wanghuan

# Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution(object):
    def isSymmetric(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if not root:
            return True
        queue = [root]
        result = True
        while queue:
            # import pdb
            # pdb.set_trace()
            tmp = self.isSymmetricList(queue)
            # import pdb
            # pdb.set_trace()
            if not self.isSymmetricList(queue):
                result = False
                break
            for i in range(len(queue)):
                node = queue.pop(0)
                if node:
                    if node.left or node.right:
                        queue.append(node.left)
                        queue.append(node.right)
        return result
            
    def isSymmetricList(self, list):
        res = True
        length = len(list)
        for i in range(length/2):
            obj1 = list[i]
            obj2 = list[length - i - 1]
            if not obj1 or not obj2:
                if(type(obj1) != type(obj2)):
                    res = False
                    break
                if not obj1 and not obj2:
                    pass
            if(obj1.val != obj2.val):
                res = False
                break
        return res
        
    def LDR(self, node, list):
        if not node:
            list.append(None)
            return 
        else:
            self.LDR(node.left, list)
            list.append(node)
            self.LDR(node.right, list)


node1 = TreeNode(1)  
node2 = TreeNode(2)  
node3 = TreeNode(2)  
node4 = TreeNode(3)  
node5 = TreeNode(4) 
node6 = TreeNode(4) 
node7 = TreeNode(3)
node1.left = node2
node1.right = node3
node2.left = node4
node2.right = node5
node3.left = node6
node3.right = node7
test = Solution()
result = test.isSymmetric(node1)
print(result)



