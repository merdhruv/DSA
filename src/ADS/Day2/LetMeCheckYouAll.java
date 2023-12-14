package in.cdac.blr.day2;

public class LetMeCheckYouAll {

	public static void main(String[] args) {
		new LetMeCheckYouAll().m1();
	}

	public void m1() {
		System.out.println("in m1() method");
		// Base condition to start-with
		// termination condition
		m1();
	}
	
	public void m2() {
		System.out.println("in m2() method");
		m1();
	}
	
}
