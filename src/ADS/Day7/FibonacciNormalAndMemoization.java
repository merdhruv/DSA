package in.cdac.blr.day7;

public class FibonacciNormalAndMemoization {

	public static void main(String[] args) {

		long pretime = System.currentTimeMillis();
		System.out.println(fibonacciNormal(50));
		long posttime = System.currentTimeMillis();
		System.out.println("time take for the computation: "+(posttime-pretime));
//		System.out.println(24L*60*60*1000*1000);  // micro seconds per day
		
	}

	public static long fibonacciNormal(long n) {
		if(n==0 || n==1)
			return n;
		return fibonacciNormal(n-1)+fibonacciNormal(n-2);
	}
	
}
