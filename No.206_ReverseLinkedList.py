# coding: utf-8
# 递归的实现方式主要有4步：
# 1）如果head为空，或者只有head这一个节点，return head即可；
# 2）先遍历head->next为首的链表，得到一个头结点newHead；
# 3）把head赋值给head->next->next， head->next为空；
# 4）返回newHead。
# author : wanghuan


# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if not head:
            return
        return self.recurse(head)
         
    def recurse(self,head):    #递归，head为原链表的头结点，newhead为反转后链表的头结点
    	if head is None or head.next is None:
    		return head;
    	else :
    		newhead=self.recurse(head.next);
    		head.next.next = head;
    		head.next=None;
    	return newhead;
        