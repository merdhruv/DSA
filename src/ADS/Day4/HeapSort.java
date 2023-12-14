package in.cdac.blr.day4;

public class HeapSort {

	public static void main(String[] args) {
		int arr[] =  { 9, 3, 6, 2, 7, 8, 5, 4 };
		new HeapSort().constructheapandswapwithroot(arr);
		display(arr);
	}

	// Max-heapify: picking the largest in the sub-tree(trio)
	// in the parameters of the function, "n" is the size of the array, "i" is the present root
	void heapify(int arr[], int n, int i) {
		// assume the index of the present sub-tree's root is the largest in the trio
		int largest = i;
		// for the ith index, the left child will be at (2*i+1)th index
		int l = 2 * i + 1;
		// for the ith index, the right child will be at (2*i+2)th index
		int r = 2 * i + 2;
		
		// check if the left child is greater than the root element, while also checking the boundary condition
		if(l < n && arr[l] > arr[largest]) {
			largest = l; // the left child is larger than the root of the trio
		}
		// check if the right child is greater than the root element, while also checking the boundary condition
		if(r < n && arr[r] > arr[largest]) {
			largest = r; // 
		} // at the end of this if condition the index of the largest element in the trio will be known
	
		// if the root element is not the largest, then we swap the root with the largest child of the trio
		if(largest != i) {   // ternary operator, XOR operation and others, identify swap techniques without using temporary variable 
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;
			
			// recursively call heapify to move to the next sub-tree or trio and heapify the same
			heapify(arr, n, largest);
		}
	}
	
	// construct the heap and call heapify to perform max-heapification, and then swap the root with the last leaf
	public void constructheapandswapwithroot(int arr[]) {
		int n = arr.length;
		
		// building or constructing the heap
		for(int i=n/2-1; i>=0; i--) {
			heapify(arr, n, i);
		}
		
		// after max-heapification, the root node is to be swapped with the last leaf node
		// and then recursively construct new heap to continue max-heapification
		for(int i=n-1; i>0; i--) {
			// swap the root node with the last leaf node
			int temp = arr[0]; // root node
			arr[0] = arr[i];
			arr[i] = temp;     // a swap of root with last leaf
			// this implies that the present largest element has occupied its apt index location
			// and so we need now construct a fresh heap with number of elements reduced by 1
			heapify(arr, i, 0);
		}
	}
	
	static void display(int ar[]) {
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i]+", ");
		}
	}
}
