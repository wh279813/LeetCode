public class Solution {
    public static ListNode ReverseTwoNodes(ListNode head)
    {
        ListNode temp = head.next;
        head.next = temp.next;
        temp.next = head;
        return temp;
    }


    public ListNode swapPairs(ListNode head) 
    { 
        ListNode TheHead = head;
        Do 
        {
            head = ReverseTwoNodes(head);
            head = head.next.next;
        }
        while(head != null && head.next!= null) 
        return TheHead;
    }
    
}
