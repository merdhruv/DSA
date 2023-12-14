package in.cdac.blr.day7;

public class CircularQueue {

	static class Node {
		int data;
		Node next;
	}
	
	static class Queue {
		Node front, rear;
	}
	
	// Enqueue happens at the rear
	// "q" represent the queue to which the element is to be enqueued
	// "value" is the element to be enqueued
	static void enqueue(Queue q, int value) {
		// instantiation and creation of a new node
		Node temp = new Node();
		temp.data = value;
		
		// if the following statement is true, then we are supposed add the first node
		if(q.front == null) {
			q.front = temp; // first node added
		} else {
			// enqueue happens at the rear
			q.rear.next = temp;
		}
		q.rear = temp;  // the temp becomes the last node in the queue
		q.rear.next = q.front;  // restoring the circular nature of the queue
	}
	
	// Dequeue happens at the front
	static void dequeue(Queue q) {
		// check if the queue is non-empty
		if(q.front == null) {
			System.out.println("Empty Queue! UNDERFLOW...");
			return;
		}
		// check if the queue has more than one node
		if(q.front == q.rear) {
			// making both NULL implies the queue has become empty after deletion of the single node it had
			Node temp = q.front;
			q.front = null;
			q.rear = null;
			System.out.println("the dequeued element is: "+temp.data);
		} else {
			Node temp = q.front;
			// shifing front implies we are dequeueing the front element and making the 2nd node as the new front node
			q.front = q.front.next;
			// to maintain the circular nature of the queue
			q.rear.next = q.front;
			System.out.println("the dequeued element is: "+temp.data);
		}
	}
	
	
	public static void main(String[] args) {

	}

}
