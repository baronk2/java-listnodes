//Section 5 code:  pp36 - 37

public class ListTest_start {
    public static void main(String[] args) {
	ListNode list = new ListNode();
	list.data = 5;
	list.next = new ListNode();
	list.next.data = 4;
	list.next.next = new ListNode();
	list.next.next.data = 3;
	list.next.next.next = null;
	
	// ListNode temp = new ListNode();
// 	temp.data = 3;
// 	temp.next = new ListNode();
// 	temp.next.data = 4;
// 	temp.next.next = null;
	
	list.next.next.next = list; // connect to front // 5-8
	System.out.println(list.next.next.data);
	list = list.next;  // front shifts to second LN
	System.out.println(list.data);
	list.next.next.next = null; // break the connection
	System.out.println(list.next.next.data);

// 	ListNode list2 = list; //5-7
// 	list = list.next;
// 	list2.next = list2.next.next;
// 	list.next = null;
	
// 	list.next.next = temp.next;  // 5-6
//  	temp.next = list.next;
// 	list.next = temp;
	
// 	temp.next.next = list.next;  // 5-5
// 	list.next = temp;
	
		
	//list.next = new ListNode(3, list.next); //5-3
	
	//list = new ListNode(3, list); // 5-2
	
	//list.next.next = new ListNode(3, null);  // 5-1
	
	
		//System.out.println(list.data);
// 		System.out.println(list2.data + " " 
// 						 + list2.next.data + " "); 
						 //+ list2.next.next.next.data);
    }
}


// list.next.next = new ListNode();
// 	list.next.next.data = 13;
// 	list.next.next.next = null;
//  System.out.println(list.data + " " + list.next.data + " "
//  System.out.println(temp.data + " " + temp.next.data);