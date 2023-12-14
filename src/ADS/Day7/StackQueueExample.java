package in.cdac.blr.day7;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class StackQueueExample {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(420);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(490);  // enqueue
		q.peek();
		q.remove();  // dequeue
	}
}
