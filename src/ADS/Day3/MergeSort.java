package in.cdac.blr.day3;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = { 9, 3, 6, 2, 7 };
		MergeSort mergesort = new MergeSort();
		mergesort.divide(arr, 0, arr.length-1);
		
		display(arr);
	}

	void divide(int arr[], int left, int right) {
		// termination condition, checks whether we have reached the leaf element,
		// meaning the last individual element
		if(left < right) {
			int middle = (left+right)/2;
			
			// recursively call the division to divide the data structure into individual
			// elements
			divide(arr, left, middle); // the left half of the array at a given point
			divide(arr, middle+1, right); // the right half of the array at a given point
		
			// once division is complete for a sub-tree then call conquer/merge for 
			// that sub-array of the sub-tree
			merge(arr, left, middle, right);
		}
	}
	
	void merge(int arr[], int left, int middle, int right) {
		
		int lefthalfsize = middle - left + 1; // the size of the left half of the array
		int righthalfsize = right - middle; // the size of the right half of the array
		
		// two temporary arrays to have the left half array and the right half array
		int leftarray[] = new int[lefthalfsize];
		int rightarray[] = new int[righthalfsize];

		// copying left half of arr into the temporary array leftarray
		for(int i=0; i<lefthalfsize; i++) {
			leftarray[i] = arr[left+i];
		}
		// copying right half of arr into the temporary array rightarray
		for(int i=0; i<righthalfsize; i++) {
			rightarray[i] = arr[middle+1+i];
		}
		
		int i = 0,j = 0;
		int k = left;
		// the following while loop is the conquering or merging part of the divide & conquer approach
		// at the end of the while loop, either the leftarray or the rightarray will be exhausted
		// termination condition
		while(i < lefthalfsize && j < righthalfsize) {
			// if the ith element of leftarray is smaller than the jth element of rightarray
			// then move the ith element of leftarray to the sorted array (final array - arr)
			if(leftarray[i] <= rightarray[j]) {
				arr[k] = leftarray[i];
				i++;
			} else {
				arr[k] = rightarray[j];
				j++;
			}
			k++;
		}
		// remaining part of leftarray is appended to the rear of the final array
		while(i < lefthalfsize) {
			arr[k] = leftarray[i];
			i++; k++;
		}
		// remaining part of rightarray is appended to the rear of the final array
		while(j < righthalfsize) {
			arr[k] = rightarray[j];
			j++; k++;
		}
	}

	static void display(int ar[]) {
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i]+", ");
		}
	}
}
