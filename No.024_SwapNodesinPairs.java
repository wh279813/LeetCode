/* 链表每两位调换位置问题(按照普通思路曾经浪费了很长时间思考),
* 问题的思路在于从后往前解决，借助递归实现,
* 思路在很大程度上是和dfs相同的:
*   1. 先走到链表的最尾端，返回空或者该节点
*   2. 然后对于途中的一般情况，把前一个节点的next设为后面的递归结果，第二个节点的next设为第一个节点
*   3. 递归函数的返回为第二个节点(用tmp表示)  
*/
package javapractice;




/**
 *
 * @author wanghuan
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null)
            return null;
        if(head.next == null)
            return head;
        // swap nodes
        ListNode tmp = head.next;
        head.next = swapPairs(head.next.next);
        tmp.next = head;
        return tmp;
    }
}