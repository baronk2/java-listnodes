//Lecture: White Pages: 12 - 21
public class ListTest2 { 
	public static void main(String[] args) { 
		ListNode list = new ListNode(3, new ListNode(7, new ListNode(12))); 
		System.out.println(list.data + " " + list.next.data + " " + list.next.next.data); 
	}
}