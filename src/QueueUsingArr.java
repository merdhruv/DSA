
public class QueueUsingArr {
	int arr[] = new int [2];
	int front = -1;
	int rear = -1;
	int size = arr.length;
	
	QueueUsingArr(int n){
		arr = new int [n];
		front = -1;
		rear = -1;
		size = n;
	}
	
	public void enqueue(int val) {
		if(rear == size-1) {
			System.out.println("OverFlow");
			return;
		}
		if(front == -1 && rear ==-1) {
			front = 0;
			rear = 0;
		}
		else {
			rear++;
		}
		arr[rear] = val;
	}
	public void dequeue() {
		if(front == -1 && rear ==-1) {
			System.out.println("UnderFlow");
			return;
		}
		else {
//			int item = arr[front];
			if(front == rear) {
				front = -1;
				rear = -1;
			}
			else {
				front++;
			}
		}
	}
	public void display() {
		if(front == -1) {
			System.out.println("Empty Queue");
			return;
		}
		for(int i = front; i <= rear; i++) {
			System.out.print(arr[i] + ", ");
		}
		
	}

	public static void main(String[] args) {
		
		QueueUsingArr qua = new QueueUsingArr(5);
		qua.enqueue(8);
		qua.enqueue(19);
		qua.dequeue();
		qua.dequeue();
		qua.dequeue();
//		qua.display();
//		qua.dequeue();
		qua.display();

	}

}
