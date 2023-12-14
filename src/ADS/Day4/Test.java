package in.cdac.blr.day4;

public class Test {

	public static void main(String[] args) {
		int arr1[] = new int[5];
		System.out.println(arr1.length);   // 5
		int arr2[] = new int[10];
		arr1 = arr2;
		System.out.println(arr1.length);   // 10
	}

}
