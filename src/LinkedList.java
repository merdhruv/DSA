
public class LinkedList {
	
	Node head ;
	
	static class Node{
		int data;
		Node next;
		
		Node(int val){
			data = val;
			next = null;
		}
		
	}
		
		
		public static void insertAtBegin(LinkedList ll,int data) {
			Node newnode = new Node(data);
			if(ll.head == null) {
				ll.head = newnode;
			}
			else {
				newnode.next = ll.head;
				ll.head = newnode;
			}
		}
		
		public static void insertAtEnd(LinkedList ll, int data) {
			Node newnode = new Node(data);
			if(ll.head == null) {
				ll.head = newnode;
			}
			else {
				Node cur = ll.head;
				while(cur.next != null) {
					cur = cur.next;
				}
				cur.next = newnode;
			}
			
		}
	public static void insertAfter(LinkedList ll, int data, int afterdata) {
		Node newnode = new Node(data);
		Node cur = ll.head;
		while(cur.next != null && cur.data != afterdata) {
			cur = cur.next;
		}
		if(cur.data == afterdata) {
			newnode.next = cur.next;
			cur.next = newnode;
		}
		else {
			System.out.println("afterData not found");
		}
		
	}
	public static void insertBefore(LinkedList ll, int data, int beforedata) {
		Node newnode = new Node(data);
		Node cur = ll.head;
		while(cur.next != null && cur.next.data != beforedata) {
			cur = cur.next;
		}
		if(cur.next.data == beforedata) {
			newnode.next = cur.next;
			cur.next = newnode;
		}
		else {
			System.out.println("beforedata not found");
		}
	}
	
	public static void deleteAtFront(LinkedList ll) {
		
		ll.head = ll.head.next;
	}
		
		
	public static void display(LinkedList ll) {
		Node cur = ll.head;
		while(cur.next != null) {
			System.out.print(cur.data + "-> ");
			cur = cur.next;
		}
		System.out.println();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
