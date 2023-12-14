import java.util.ArrayList;

public class MergeSort {

	public static void main(String[] args) {
		
		int [] arr = {10, 3, 5, 12, 14, 45, 22};
		
		display(arr);
		
		mergeSort(arr, 0, arr.length-1);
		
		display(arr);

	}
	public static void mergeSort(int []arr, int low, int high) {
		if (low >= high) return;
		int mid = (low+high)/2;
		
		mergeSort(arr, low, mid);
		mergeSort(arr, mid+1, high);
		
		merge(arr, low, high , mid);
		
	}
	public static void merge(int[] arr, int low, int high, int mid) {
		ArrayList <Integer> temp = new ArrayList<Integer>();
		int left = low;
		int right = mid+1;
		
		while(left <= mid && right <= high) {
			if(arr[left] < arr[right]) {
				temp.add(arr[left++]);
			}
			else {
				temp.add(arr[right++]);
			}
		}
		while(left <= mid) {
			temp.add(arr[left++]);
		}
		while(right <= high) {
			temp.add(arr[right++]);
		}
		for(int i = low; i<=high; i++) {
			arr[i] = temp.get(i - low);
		}
	}
	public static void display(int []arr) {
		for(int ar : arr) {
			System.out.print(ar + ",");
		}
		System.out.println();
	}

}
