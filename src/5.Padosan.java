package dsa.project;

//import java.util.Scanner;


public class Padosan {
	
	public static void main(String[] args) {
		
		
		
//		int [][] arr = {	
//							{1, 1, 3, 1, 3, 3, 1, 3},
//							{3, 1, 5, 1, 5, 3, 3, 3},
//							{5, 1, 7, 1, 7, 3, 5, 3},
//							{1, 3, 3, 3, 3, 5, 1, 5},
//							{1, 7, 3, 7, 3, 9, 1, 9},
//							{3, 7, 5, 7, 5, 9, 3, 9},
//							{5, 4, 7, 4, 7, 6, 5, 6}
//							};
		
//		int [][] arr = {
//								{1, 1, 3, 1, 3, 3, 1, 3},
//								{3, 1, 5, 1, 5, 3, 3, 3},
//								{1, 3, 3, 3, 3, 5, 1, 5},
//								{3, 3, 5, 3, 5, 5, 3, 5}
//						};
		
		
		int [][] arr = {
								{0, 0, 0, 2, 2, 0, 2, 2},
//								{2, 0, 2, 2, 2, 4, 0, 4},
								{2, 2, 2, 4, 4, 2, 4, 4},
//								{3, 3, 5, 3, 5, 5, 3, 5}
						};
		
		int n = arr.length;
		Square [] s = new Square [n];
		
		for(int i = 0; i < arr.length; i++) {
			
				
				int x1 = arr[i][0];
				int y1 = arr[i][1];
				int x2 = arr[i][2];
				int y2 = arr[i][3];
				int x3 = arr[i][4];
				int y3 = arr[i][5];
				int x4 = arr[i][6];
				int y4 = arr[i][7];
				
				Pair p1 = new Pair(x1, y1);
				Pair p2 = new Pair(x2, y2);
				Pair p3 = new Pair(x3, y3);
				Pair p4 = new Pair(x4, y4);
				
				s[i] = new Square(p1, p2, p3, p4);
				
		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("enter the number of square");
//		int n = sc.nextInt();
//		
//		Square [] s = new Square [n];
//		
//		for(int i = 0; i < n; i++) {
//			
//			int x1 = sc.nextInt();
//			int y1 = sc.nextInt();
//			int x2 = sc.nextInt();
//			int y2 = sc.nextInt();
//			int x3 = sc.nextInt();
//			int y3 = sc.nextInt();
//			int x4 = sc.nextInt();
//			int y4 = sc.nextInt();
//			
//			Pair p1 = new Pair(x1, y1);
//			Pair p2 = new Pair(x2, y2);
//			Pair p3 = new Pair(x3, y3);
//			Pair p4 = new Pair(x4, y4);
//			
//			s[i] = new Square(p1, p2, p3, p4);
//			
//		
//		}
		
		
		
		int [][] ans = new int [n][2];
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			count = 0;
			for(int j = 0; j < n; j++) {
				if(i==j) {
					continue;
				}
				
//				System.out.println("in starting, count: " + count);
				
				if(s[i].p1.equals(s[j].p1) || s[i].p1.equals(s[j].p2) || s[i].p1.equals(s[j].p3) || s[i].p1.equals(s[j].p4)) {
					count++;
				}
				if(s[i].p2.equals(s[j].p1) || s[i].p2.equals(s[j].p2) || s[i].p2.equals(s[j].p3) || s[i].p2.equals(s[j].p4)) {
					count++;
				}
				if(s[i].p3.equals(s[j].p1) || s[i].p3.equals(s[j].p2) || s[i].p3.equals(s[j].p3) || s[i].p3.equals(s[j].p4)) {
					count++;
				}
				if(s[i].p4.equals(s[j].p1) || s[i].p4.equals(s[j].p2) || s[i].p4.equals(s[j].p3) || s[i].p4.equals(s[j].p4)) {
					count++;
				}
				
//				System.out.println("count: " + count);
			}
			
			ans[i][0] = i+1;
			ans[i][1] = count/2;
			
		}
		
		
		for(int i = 0; i < n; i++) {
			System.out.println(ans[i][0] + " " + ans[i][1]);
		}
		
	}

}
