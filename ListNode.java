// ListNode is a class for storing a single node of a linked list storing
// integer values.  It has two public data fields for the data and the link to
// the next node in the list and has three constructors.

public class ListNode {
    public int data;       // data stored in this node
    public ListNode next;  // link to next node in the list  Recursive object

    // post: constructs a node with data 0 and null link
    public ListNode() {
	this(0, null);
    }

    // post: constructs a node with given data and null link
    public ListNode(int data) {
	this(data, null);
    }

    // post: constructs a node with given data and given link
    public ListNode(int data, ListNode next) {
      this.data = data;
      this.next = next;
  }
//}

// Second version of sample code
// -----------------------------

    public static void main(String[] args) {
		ListNode list = new ListNode(3, new ListNode(7, new ListNode(12)));
		System.out.println(list.data + " " + list.next.data + " "
				   + list.next.next.data);
    }
}
