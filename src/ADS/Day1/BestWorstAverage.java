package in.cdac.blr.day1;

import java.util.Scanner;

// Best case: Least possible complexity. In this, the data structure appears to be 
// biased to the conclusion to be derived. Example: the element being searched is present 
// as the first element encountered. Value: O(1)

// Worst case: Worst possible complexity. In this, the data structure is hostile to the 
// conclusion to be derived at. Example: the element being searched may be present as the
// last element or may not be present at all in the data structure. Value: O(n)

// Average case: An average of all attempts to search an element in the data structure 
// including the best and the worst cases.

// Linear search on an Array data structure
public class BestWorstAverage {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		
		for(int j=0; j<size; j++) {
			arr[j] = s.nextInt();
		}
		
		for(int j=0; j<size; j++) {
			System.out.println(arr[j]);
		}
		
		int search = 13;
		boolean isfound = false;
		int location = -1;
		int counter = 0;
		for(int i=0; i<arr.length; i++) {
			counter++;
			if(arr[i] == search) {
				isfound = true;
				location = i;
				System.out.println("element found!!!");
//				break;
				return;
			} /*else {
				System.out.println("NOT found!!!");
			}*/
		}
//		if(isfound) {
//			System.out.println(search+" element found at: "+location);
//		} else {
			System.out.println("NOT found  :( ");
//		}
//		System.out.println("the number of attempts to locate the element: "+counter);
	}
}
