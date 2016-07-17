# coding: utf-8
# 有序链表去重：
#   思路：定义一个方法，对每一个节点执行这个方法。
#        该方法的目的是把和改节点相同值的节点都删除掉，链向第一个不为该节点值的下一个节点 

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def deleteDuplicates(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if not head:
            return
        if not head.next:
            return head
        resNode = head
        while(head != None):
            self.delRepeat(head)
            head = head.next
        return resNode    
        
    def delRepeat(self, node):
        if not node.next:
            return
        dic = {}
        dic[node.val] = ''
        tmpHead = node
        while(dic.has_key(tmpHead.next.val)):
            tmpHead = tmpHead.next
            if not tmpHead.next:
                break
        node.next = tmpHead.next
        return 
        