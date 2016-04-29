// Import ListNode class first.
public class OutputLinkedList
{	
	public static void PrintLinkedList(ListNode head)
	{
		while(head != null)
		{
			System.out.println(head);
			head = head.next;
		}
	}
	
	public static void ReversePrintbyRecur(ListNode head)
	{
		if(head == null)
			return;
		else
		{
			ReversePrintbyRecur(head.next);
			System.out.println(head.value);
		}
	} 

	public static void ReversePrintbyStack(ListNode head)
	{
		Stack<ListNode> s = new Stack<ListNode>();
		while(head != null)
		{
			s.push(head);
			head = head.next;
		}
		while(!s.isEmpty)
		{
			System.out.println(s.pop().value);
		}
	}

}