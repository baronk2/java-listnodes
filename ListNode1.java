// ListNode is a class for storing a single node of a linked list storing
// integer values.  Class ListNode has no methods, only public data fields
// for the data and the link to the next node in the list.

public class ListNode1 {  //Rename to ListNode
    public int data;
    public ListNode next;


    public static void main(String[] args) {
		ListNode list = new ListNode();
		list.data = 3;
		list.next = new ListNode();
		list.next.data = 7;
		list.next.next = new ListNode();
		list.next.next.data = 12;
		list.next.next.next = null;
		System.out.println(list.data + " " + list.next.data + " "
				   + list.next.next.data);
    }
}

