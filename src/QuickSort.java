
public class QuickSort {

	public static void main(String[] args) {
		int [] arr = {10, 3, 5, 12, 14, 45, 22};
		
		display(arr);
		
		quickSort(arr, 0, arr.length-1);
		
		display(arr);

	}
	public static int partition(int []arr, int low, int high) {
		
		int pivot = arr[low];
		int i = low;
		int j = high;
		
		while(i < j) {
			while(arr[i] <= pivot && i < high) {
				i++;
			}
			while(arr[j] > pivot && j > low) {
				j--;
			}
			if(i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			
		}
		int temp = arr[low];
		arr[low] = arr[j];
		arr[j] = temp;
		return j;
	}
	public static void quickSort(int []arr, int low, int high) {
		
		if(low < high) {
			int pInd = partition(arr, low, high);
			quickSort(arr, low, pInd-1);
			quickSort(arr, pInd+1, high);
		}
		
	}
	public static void display(int []arr) {
		for(int ar : arr) {
			System.out.print(ar + ",");
		}
		System.out.println();
	}

}
