public class Solution {
    public static ListNode[] ReverseFirstTwo(ListNode head)
    {
        ListNode[] newSnake = new ListNode[2];
        newSnake[1] = head.next.next;
        ListNode Temp = head.next;
        head.next = null;
        Temp.next = head;
        newSnake[0] = Temp;
        return newSnake;
    }


    public ListNode swapPairs(ListNode head) 
    { 
        ListNode TheHead = head;
        Do 
        {
            head = ReverseFirstTwo(head);
            head = head.next.next;
        }
        while(head != null && head.next!= null) 
        return TheHead;
    }
    
}
