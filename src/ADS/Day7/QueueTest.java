package in.cdac.blr.day7;


class UserDefinedQueue {
	
	private Node rear = null, front = null;
	
	// Peek operation: happens at the front node of the queue, meaning the head of the list 
	public String peek() {
		if(isEmpty()) {
			System.out.println("Empty Queue! Underflow!");
			return null;
		}
		return front.data;   // if the list is present then we return the data of the head (front) node
	}
	
	// Dequeue operation happens at the front of the queue
	// meaning the front(head) is reassigned
	public String dequeue() {
		if(isEmpty()) {
			System.out.println("Empty Queue! Underflow!");
			return null;
		}
		Node temp = front;
		System.out.println("the dequeued element is: "+front.data);
		front = front.next;   // the front (head) gets shifted to the next node
		if(front == null) {  // if the queue(list) had a single node and that got deleted, then
			// the rear is also to be made null so that we get to identify the EMPTY QUEUE
			rear = null;
		}
		return temp.data; 
	}
	
	
	// Enqueue operation happens at the end of the queue
	// meaning the rear (refers to the last node) is reassigned such that the new node becomes the last node
	public void enqueue(String item) {
		Node node = new Node(item);
		// if front is null, it implies that the node created above is to be added as the first node in the
		// queue
		if(front == null) {
			front = node;
			rear = node;
		} else {
			rear.next = node;
			rear = node;
		}
		
	}
	
	
	
	public boolean isEmpty() {
		return rear == null && front == null;
	}
}

class Node {
	String data;
	Node next;
	
	public Node(String data) {
		this.data = data;
		this.next = null;
	}
}

public class QueueTest {

	public static void main(String[] args) {

	}

}