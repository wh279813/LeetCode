# coding: utf-8
# 链表每两位调换位置问题(按照普通思路曾经浪费了很长时间思考),
# 问题的思路在于从后往前解决，借助递归实现,
# 思路在很大程度上是和dfs相同的:
#   1. 先走到链表的最尾端，返回空或者该节点
#   2. 然后对于途中的一般情况，把前一个节点的next设为后面的递归结果，第二个节点的next设为第一个节点
#   3. 递归函数的返回为第二个节点(用tmp表示)  
# author: wanghuan


# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def swapPairs(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if not head:
            return 
        return self.recursive(head)
         
    def recursive(self, node):
        if not node:
            return
        if not node.next:
            return node
        # swap nodes
        tmp = node.next
        node.next = self.recursive(node.next.next) # 递归：把后面的点（每隔两位）都依次完成递归
        tmp.next = node

        return tmp
        
        
# 以下是更简单的不调用额外方法形式，不如第一种直观

class Solution(object):
    def swapPairs(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if not head:
            return
        if not head.next:
            return head
        # swap nodes
        tmp = head.next
        head.next = self.swapPairs(head.next.next)
        tmp.next = head

        return tmp