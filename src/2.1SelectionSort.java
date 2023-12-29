
public class SelectionSort {

	public static void main(String[] args) {
		int []arr = {4, 13, 3, 7, 12, 34};
		display(arr);
		selectionSort(arr);
		display(arr);

	}
	public static void selectionSort(int[]arr) {
		for(int i = 0; i < arr.length; i++) {
			int mini = i;
			for(int j = i+1; j<arr.length; j++) {
				if(arr[j] < arr[mini]) {
					mini = j;
				}
			}
			if(mini != i) {
				int temp = arr[i];
				arr[i] = arr[mini];
				arr[mini] = temp;
			}
		}
	}
	public static void display(int []arr) {
		for(int ar : arr) {
			System.out.print(ar + ",");
		}
		System.out.println();
	}
}
