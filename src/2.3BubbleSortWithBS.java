
public class BubbleSortWithBS {

	public static void main(String[] args) {
		int ar[] = { 2, 3, 4, 5, 6, 7, 8, 9 };
		new BubbleSortWithBS().bubbleSort(ar);
		new BubbleSortWithBS().binarySearch(ar,3);
	}
	void bubbleSort(int ar[]) {
		int counter = 0, swaps = 0;
		for(int i=0; i<ar.length; i++) {
			for(int j=1; j<ar.length; j++) {
				counter++;
				if(ar[j-1] > ar[j]) {
					swaps++;
					int temp = ar[j-1];
					ar[j-1] = ar[j];
					ar[j] = temp;
				}
			}
			if(swaps == 0) {  
				break;
			}

		}
		display(ar);
	}
	
	void binarySearch(int arr[], int val) {
		int low = arr[0];
		int high = arr.length;
		
		while(low<high) {
			int mid = (low+high)/2;
			if(mid == val) {
				System.out.println(val + "is in "+mid+1 + " position");
			}
			else if(arr[mid] < val) {
				low = mid+1;
			}
			else if(arr[mid]>val) {
				high = mid-1;
			}
			else {
				System.out.println("value not found");
			}
		}
	}

	void display(int ar[]) {
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i]+", ");
		}
	}
}
