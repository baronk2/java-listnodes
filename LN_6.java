//Section 5 code:  pp36 - 37

public class LN_6 {
    public static void main(String[] args) {
	ListNode list = new ListNode();
	list.data = 1;
	list.next = new ListNode();
	list.next.data = 2;
	
	ListNode temp = new ListNode();
	temp.data = 3;
	temp.next = new ListNode();
	temp.next.data = 4;
	

	
    } // eoMain
} //eoClass































// 	list.next.next = temp.next; // point 2 to next of 3
// 	temp.next = list.next; // point temp.next(3) to list.next( 2)
// 	list.next = temp;  	// point list.next to temp, breaking previous connection to list.next


