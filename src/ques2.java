import java.util.Scanner;

public class ques2 {
	
	
	public static class LinkedList{
		public class Node{
			String data;
			Node next;
			
			Node(String val){
				data = val;
				next = null;
			}
		}
		
		Node front = null;
		Node rear = null;
		int stage = 0;
		
		public char lastChar(Node n) {
			return n.data.charAt(n.data.length()-1);
		}
		
		public void enqueue(String name) {
			char c = name.charAt(name.length()-1);
			Node newnode = new Node(name);
			if(rear == null) {
				rear = newnode;
				front = newnode;
			}
			else if(c == lastChar(rear)) {
				stage++;
				return;
			}
			rear.next = newnode;
			rear = newnode;
		}
		
		public void display() {
			Node cur = front;
			while(cur!=null) {
				System.out.print(cur.data+"=>");
				cur = cur.next;
			}
			System.out.println();
		}
	}
	
	public static void standInQueue(String []arr) {
		int n = arr.length;
		LinkedList lq = new LinkedList();
		for(int i = 0;i<n;i++) {
			lq.enqueue(arr[i]);
		}
		lq.display();
		System.out.println(lq.stage);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the number of Students ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String [] arr = new String [n];
		
		for(int i =0 ; i<n;i++) {
			arr[i] = sc.next();
		}
		
		standInQueue(arr);
		
	}
}
