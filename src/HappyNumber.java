import java.util.Scanner;
import java.util.*;


public class HappyNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner (System.in);
		System.out.println("Enter the starting number : ");
		int start = s.nextInt();
		System.out.println("Enter the ending number : ");
		int end = s.nextInt();
		List<int []> res = new ArrayList<int[]>();
				
		while(start <= end) {
			int count = isHappy(start, 0);
			if(count != -1) {
				int[] ans = {start, count};
				res.add(ans);
			}
			start++;
		}
		
		for(int i=0; i < res.size(); i++) {
			int[] pair = res.get(i);
            System.out.println("Number: " + pair[0] + ", Count: " + pair[1]);
		}
		
	}
	public static Integer isHappy(int num, int counter) {
		if(num == 1) {
			return ++counter;
		}
		if(counter >= 10) {
			return -1;
		}
		int res = 0;
		int num1 = num;
		while(num1 >= 1) {
			res += (int) Math.pow((num1%10),2);
			num1 = num1/10;
		}
		counter++;
		num = res;
		return isHappy(num, counter);
	}

}
