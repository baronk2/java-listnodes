//Section 5 code:  pp36 - 37

public class LN_3 {
   public static void main(String[] args) {
		ListNode list = new ListNode();
		list.data = 1;
		list.next = new ListNode();
		list.next.data = 2;
		
		System.out.println(list.data);
		System.out.println(list.next.data); 
		 		


    } // eoMain
} // eoClass

























// 		list.next = new ListNode(3, list.next); //5-3 insert new, data 3, point to previous list.next (2)
// 		
// 		System.out.println(list.data);
// 		System.out.println(list.next.data);
// 		System.out.println(list.next.next.data);