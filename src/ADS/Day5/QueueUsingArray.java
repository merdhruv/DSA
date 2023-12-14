package in.cdac.blr.day5;

/*
 * In this program, we implement a linear data structure, queue, such that its 2 operations, enqueue and dequeue
 * happen at the rear and front respectively.
 */
public class QueueUsingArray {

	static int[] ar = new int[2];
	static int n = ar.length;    // the size of the array
	static int front = -1;   // dequeue happens at the front
	static int rear = -1;    // enqueue happens at the rear
	
	// ENQUEUE - implies adding element to a queue, condition to be checked: OVERFLOW
	// "item" is the element to be added to the queue
	static void enqueue(int item) {
		// check for overflow
		if(rear == n-1) {
			System.out.println("OVERFLOW! Regret element can't be added to the Queue");
			return;
		} else {
			// if this is true, then it implies its a empty Queue
			if(front == -1 && rear == -1) {
				front = 0;
				rear = 0;
			} else {
				rear++;
			}
			// enqueue the new element at the rear
			ar[rear] = item;
			System.out.println("element enqueued !");
		}
	}
	
	// DEQUEUE - implies removing element from the queue, condition to be checked: UNDERFLOW
	// this method dequeues the element at the "front"
	static void dequeue() {
		// check for underflow
		if(front == -1 && rear == -1) {
			System.out.println("UNDERFLOW! Regret no element found and so can't be dequeued.");
			return;
		} else {
			int item = ar[front];  // this the element to be dequeued
			if(front == rear) {  // if true, it implies that the queue has a single element
				front = -1;
				rear = -1; // implies queue has become empty following the dequeue operation
			} else {
				front++;   // ignoring the previous element which actually is effectively dequeued
			}
			System.out.println("the dequeued element is: "+item);
		}
	}
	
	static void display() {
		if(front == -1) {
			System.out.println("Empty Queue");
			return;
		} else {
			for(int i=front; i<=rear; i++) {
				System.out.print(ar[i]+" ,");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
	}

}










