package in.cdac.blr.day3;

public class Bubble {

	public static void main(String[] args) {
//		int ar[] = { 9, 3, 6, 2, 7, 8, 5, 4 };
		int ar[] = { 2, 3, 4, 5, 6, 7, 8, 9 };
		new Bubble().bubbleSort(ar);
	}
	// a bubble sort for non-descending order (ascending order) = Complexity = O(n^2)
	void bubbleSort(int ar[]) {
		// Outer loop
		int counter = 0, swaps = 0;
		for(int i=0; i<ar.length; i++) {
			// Inner loop
			for(int j=1; j<ar.length; j++) {
				// if the present element is larger than the previous
				counter++;
				if(ar[j-1] > ar[j]) {
					swaps++;
					int temp = ar[j-1];
					ar[j-1] = ar[j];
					ar[j] = temp;
				}
			}
			if(swaps == 0) {  // O(n) complexity, this is modified bubble sort
				break;
			}
//			System.out.println();
//			display(ar);
		}
		System.out.println("number of iterations : "+counter);
		System.out.println("number of swaps : "+swaps);
		display(ar);
	}

	void display(int ar[]) {
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i]+", ");
		}
	}
}
