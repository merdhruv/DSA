package in.cdac.blr.day2;

public class BinarySearchRecursion {

	public static void main(String[] args) {
		int arr[] = {12, 15, 18, 24, 28, 29, 34, 39, 40, 43, 48, 52, 67, 98, 99};
		int search = 15;
		System.out.println(new BinarySearchRecursion().locateelementusingrecursioninbinarysearch(arr, 0, arr.length-1, search));
	}

	int locateelementusingrecursioninbinarysearch(int arr[], int low, int high, int search) {
		// if low is greater than high, it implies that the element was not present in the array
		if(low > high) {
			return -1;
		}
		int mid = (low+high)/2;
		// if the element being searched is smaller than the element at "mid", then
		// we need to move to the left half, meaning re-assign the "high"
		// if the mid element matches the searched element, then return the "mid"
		if(search == arr[mid]) {
			return mid;
		} else if(search < arr[mid]) {  // else make recursive call
			return locateelementusingrecursioninbinarysearch(arr, low, mid-1, search);
		}
		
		// otherwise means that the searched element is larger than the element at "mid", then
		// we need to move to the right half, meaning re-assign the "low"
		return locateelementusingrecursioninbinarysearch(arr, mid+1, high, search);
	}
}



