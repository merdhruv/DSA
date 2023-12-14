import java.util.Scanner;
import java.util.Stack;

public class TowerOfHanoi {
	
	public static int N;
	
	public static Stack <Integer> [] tower = new Stack[4];
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		tower[1] = new Stack<Integer>();
		tower[2] = new Stack<Integer>();
		tower[3] = new Stack<Integer>();
		System.out.println("Enter the number of disks");
		int num = sc.nextInt();
		N = num;
		toh(num);
		
	}

	public static void toh(int n) {
		for(int i = n; i > 0; i--) {
			tower[1].push(i);
		}
		display();
		move(n, 1, 2, 3);
	}
	
	public static void move(int n, int a, int b, int c) {
		if(n>0) {
			move(n-1, a, c, b);
			int i = tower[a].pop();
			tower[c].push(i);
			display();
			move(n-1, b, a, c);
		}
	}
	public static void display() {
		System.out.println("  A  |  B  |  C  ");
		System.out.println("------------------");
		for(int i = N-1; i>=0; i--) {
			String d1 = " ", d2 = " ", d3 = " ";
			try {
				d1 = String.valueOf(tower[1].get(i));
			}
			catch(Exception e) {
				
			}
			try {
				d2 = String.valueOf(tower[2].get(i));
			}
			catch(Exception e) {
				
			}
			try {
				d3 = String.valueOf(tower[3].get(i));
			}
			catch(Exception e) {
				
			}
			System.out.println("  "+d1+"  |  "+d2+"  |  "+d3);
		}
		System.out.println("\n");
	}
	
}
