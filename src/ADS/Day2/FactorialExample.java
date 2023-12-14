package in.cdac.blr.day2;

public class FactorialExample {
	public static void main(String[] args) {
		new FactorialExample().factorial(5);
	}
	int factorial(int n) {
		if(n == 0) {
			return 1;
		}
		return n * factorial(n-1);
		// base condition
		// termination condition
	}
}
