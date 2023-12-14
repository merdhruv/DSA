package in.cdac.blr.day5;

public class StackUsingArray {

	int arr[];
	int top = -1; // if top is equal to -1, it implies the stack is empty
	int capacity = 5;
	
	public StackUsingArray(int size) {
		capacity = size;
		arr = new int[capacity];
		top = -1;
	}
	
	// PUSH - implies adding element to the TOP of the stack. Condition to checked: size of stack.
	// "item" represents the element to be pushed into the Stack
	public void push(int item) {
		// check whether the stack is full or not
		if(isFull()) {
			System.out.println("OVERFLOW! Regret element can't be added to the Stack");
			return;
		}
		// since the stack has space, we add the item to the top+1 index location of the Stack
		arr[++top] = item;
	}
	
	// PEEK - implies just viewing the element present at the TOP of the Stack. Condition to checked: non-empty Stack
	public void peek() {
		if(isEmpty()) {
			System.out.println("UNDERFLOW! Regret no element found");
			return;
		}
		System.out.println(arr[top]);
	}
	
	// POP - implies removal of the element present at the TOP of the Stack. Condition to checked: non-empty Stack
	public void pop() {
		if(isEmpty()) {
			System.out.println("UNDERFLOW! Regret no element found and so can't be popped.");
			return;
		}
		top--;
	}
	
	
	// check for underflow condition
	private boolean isEmpty() {
		return top == -1;
	}
	
	
	// check for overflow condition
	private boolean isFull() {
		return top == capacity - 1;
	}
	
	public static void main(String[] args) {
		StackUsingArray sua = new StackUsingArray(5);
		
		sua.push(420);
//		sua.peek();
		sua.push(840);
//		sua.peek();
		sua.pop();
		sua.pop();
//		sua.peek();
		sua.pop();
		sua.push(40);
		sua.push(84);
		sua.push(80);
		sua.push(88);
		sua.push(89);
		sua.peek();
		sua.push(34);
		sua.peek();
	}

}










