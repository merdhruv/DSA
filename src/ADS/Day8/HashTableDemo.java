package in.cdac.blr.day8;

public class HashTableDemo {

	int arr[];
	int size;
	
	public HashTableDemo(int size) {
		this.size = size;
		arr = new int[this.size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;   // initializing the array to have a least possible -ve integer value
		}
	}

	public void insert(int value) {
		arr[value % size] = value;  // where "value % size" is the simple hash function used
	}

	public boolean locate(int value) {
		return arr[value % size] == value;
	}
	
	public void display() {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		HashTableDemo demo = new HashTableDemo(9);
		demo.insert(18);
		demo.insert(20);
		demo.insert(5);
		demo.insert(3);
		demo.insert(11);   // collision, a collision resolution technique can be applied here
		System.out.println("located? "+demo.locate(18));
		demo.display();
	}

}
