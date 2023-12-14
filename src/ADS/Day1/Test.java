package in.cdac.blr.day1;

public class Test {

	public static void main(String[] args) {
		int a=1345, b=134, c=879;
		if(a>=b) {
			if(a>=c) {
				System.out.println("a is largest: "+a);
			} else {
				System.out.println("c is largest: "+c);
			}
		} else if(b>=c) {
			System.out.println("b is largest: "+b);
		} else {
			System.out.println("c is largest: "+c);
		}
		
		/*
		 * if ((a > b) && (a > c)) { System.out.println("a is largest: "+a); } else if
		 * ((b > a) && (b > c)) { System.out.println("b is largest: "+b); } else {
		 * System.out.println("c is largest: "+c); }
		 */
	}
}


