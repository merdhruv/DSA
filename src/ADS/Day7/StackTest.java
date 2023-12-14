package in.cdac.blr.day7;

public class StackTest {

	public static void main(String[] args) {
		StackUsingList stackbylist = new StackUsingList();
	}

}

class StackUsingList {
	private class Node {
		int data;
		Node next;
	}
	Node top;
	public StackUsingList() {
		this.top = null;
	}
	public void push(int x) {
		Node temp = new Node();
		temp.data = x;
		temp.next = top;   // insertion of node at the beginning of the list
		top = temp;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public int peek() {
		if(!isEmpty()) {
			return top.data;
		} else {
			System.out.println("LIST EMPTY!");
			return Integer.MIN_VALUE;
		}
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("LIST EMPTY! UNDERFLOW!");
			return;
		}
		System.out.println("The element popped is: "+top.data);
		top = top.next;
	}
	
}