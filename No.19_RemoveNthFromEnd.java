/*
 * This problem can be solved through fast and slow pointer.
 * Process : Setting the fast and slow pointer and the distance between them are n.
 * So when the faster one arrives terminal, the position of slow pointer is the node to be deleted.
*/
package javapractice;


import javapractice.DataStruct.ListNode;
/**
 *
 * @author wanghuan
 */

public class Solution{
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;   
        ListNode slow = head;
        
        if(head.next == null)
            return null;
        
        //Set up the distance. 快指针先提前走n步。
        for(int i=0;i<n;i++)
        {
            fast = fast.next;
        }
        
        //If faster runs to null, then return head.next 
        //For the case n is larger then the length of linkedlist, delete the first node.
        if(fast == null)
            return head.next;
        
        while(fast.next != null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next;
        return head;
        
    }
}


