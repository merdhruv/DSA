package in.cdac.blr.day4;

public class DynamicArray {

	private int arr[];
	// the capacity or size of the array
	private int capacity;
	// the present capacity of the array under effective usage
	private int presentlength;
	
	public DynamicArray() {
		this.arr = new int[2];
		this.capacity = 2;
		this.presentlength = 0;
	}

	public void insert(int data) {
		if(presentlength == capacity) {
			// create a temporary array which is twice the size of the existing capacity
			int temp[] = new int[2*capacity];

			// copy element from smaller array (arr) to the re-sized array (temp)
			for(int i=0; i<capacity; i++) {
				temp[i] = arr[i];
			}
			capacity = capacity * 2;  // revised capacity
			arr = temp;  // the size of arr will become equal to the size of temp
		}
		// the data to be appended is added to the array arr after re-sizing it
		arr[presentlength] = data;
		presentlength++;
	}
	
	public static void main(String[] args) {
		
	}
	
	
}
