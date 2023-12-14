package in.cdac.blr.day5;

public class RevisitRecursion {

	static int i = 0;
	public static void main(String[] args) {
		new RevisitRecursion().m1();
	}
	void m1() {
		System.out.println("m1 is called!: "+i++);
		if(i<10) {
			m1();
		}
		m2();
	}
	
	void m2() {
		System.out.println("m2 is called!: "+i++);
	}
}
