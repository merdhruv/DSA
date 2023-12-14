
public class StackUsingArr {
	static int arr[] = new int[2];
	static int top = -1;
	static int capacity = arr.length;
	
	StackUsingArr(int size){
		capacity = size;
		arr = new int[size];
		top = -1;
	}
	
	public  boolean isFull() {
		return top == capacity-1;
	}
	public  boolean isEmpty() {
		return top == -1;
	}
	public  void push(int val) {
		if(isFull()) {
			System.out.println("OverFlow");
			return;
		}
		arr[++top] = val;			
	}
	public  int peek() {
		if(isEmpty()) {
			System.out.println("UnderFlow");
			return -1;
		}
		System.out.println(arr[top]);
		return arr[top];
	}
	public  void pop() {
		if(isEmpty()) {
			System.out.println("UnderFlow");
			return;
		}
		top--;
	}

	public static void main(String[] args) {
		StackUsingArr sua = new StackUsingArr(5);
		sua.push(10);
		sua.push(20);
		sua.push(20);
		sua.push(20);
		sua.push(20);
		sua.push(20);
//		sua.peek();
//		sua.pop();
//		sua.pop();
		sua.peek();
	}

}
