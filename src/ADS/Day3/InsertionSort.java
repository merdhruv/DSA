package in.cdac.blr.day3;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = { 9, 3, 6, 2, 7, 8, 5, 4 };
		new InsertionSort().sort(arr);
	}

	void sort(int arr[]) {
		int temp = 0, j = 0;
		for(int i=0; i < arr.length; i++) {
			temp = arr[i];  // pick the ith element
			// traverse from (i-1)th location till index 0 to suitably place the ith element
			for(j = i; (j > 0 && arr[j-1] > temp); j--) {
				// shifting of the larger elements by one location to the right
				arr[j] = arr[j-1];
			}
			// placing the ith element at the suitable position in the sorted array
			arr[j] = temp;
		}
		display(arr);
	}
	
	void display(int ar[]) {
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i]+", ");
		}
	}
}

