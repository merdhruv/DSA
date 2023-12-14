package in.cdac.blr.day3;

import java.util.Scanner;

public class TestYourself {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}   // constant complexity O(10) - constant
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println(i);
		}   // linear complexity O(n)
		
		int counter = 0;
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				counter++;
				System.out.println(counter);
			}
		}  // constant complexity O(100)
		
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				counter++;
				System.out.println(counter);
			}
		} // quadratic complexity O(n^2)
	}

}
