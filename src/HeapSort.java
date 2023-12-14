
public class HeapSort {

	public static void main(String[] args) {
		int [] arr = {10, 3, 5, 12, 14, 45, 22};
		
		display(arr);
		
		heapSort(arr);
		
		display(arr);

	}
	
	public static void heapSort(int []arr) {
		int n = arr.length;
		for(int i = (n/2)-1; i>=0; i--) {
			heapify(arr, i, n);
		}
		for(int i = n-1; i>=0; i--) {
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			heapify(arr, 0, i);
		}
		
		
	}
	public static void heapify(int []arr, int i, int n) {
		int left = (2*i)+1;
		int right = (2*i)+2;
		int largest = i;
		
		if(left < n && arr[left] > arr[largest]) {
			largest = left;
		}
		if(right < n && arr[right] > arr[largest]) {
			largest = right;
		}
		if(largest!=i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			
			heapify(arr, largest, n);
		}
		
	}
	
	public static void display(int []arr) {
		for(int ar : arr) {
			System.out.print(ar + ",");
		}
		System.out.println();
	}

}
