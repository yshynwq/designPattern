package lengthOfLinkedList;

class ListNode{
	ListNode next;
	int value;
	
	public ListNode(int val) {
		this.value = val;
	}
}

public class LengthOfLinkedList {
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2= new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		System.out.println(getLenght(node1));
	}
	
	public static int getLenght(ListNode root){
		int count = 0;
		while(root!=null){
			count++;
			root=root.next;
		}
		return count;
	}
}
