package in.cdac.blr.day2;

public class BinarySearchIteration {
	public static void main(String[] a) {
		int arr[] = {12, 15, 18, 24, 28, 29, 34, 39, 40, 43, 48};
		System.out.println("len: "+arr.length);
		System.out.println("element found at: "
		+new BinarySearchIteration().locateElementByBinarySearch(arr));
	}
	
	int locateElementByBinarySearch(int arr[]) {
		int low = 0, high = arr.length-1, mid = 0;
		int search = 34;  // the element to be located
		
		// iteration happens till the low and high indexes meet each other, 
		// implies the data structure is exhausted or we have located the element
		while(low < high) {  
			mid = (low+high)/2;
			// if the element being searched is greater than arr[mid] 
			// then reallocate low to (mid+1)
			// otherwise reallocate high to mid
			if(search >= arr[mid]) {
				low = mid+1;
			} else {
				high = mid;
			}
		}
		return low;
	}
}

