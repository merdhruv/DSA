package in.cdac.blr.day8;

public class FibonacciNormalAndMemoization {

	public static long arr[] = new long[101];   // array to be used for Memoization
	
	public static void main(String[] args) {

		long pretimenormal = System.nanoTime();
		System.out.println("FIB value: "+fibonacciNormal(45));
		long posttimenormal = System.nanoTime();
		System.out.println("time take for the computation (nano seconds): "+(posttimenormal-pretimenormal));
		
		
		
		long pretimememoized = System.nanoTime();
		System.out.println("FIB memoized value: "+fibonacciMemoized(45));
		long posttimememoized = System.nanoTime();
		System.out.println("time take for the memoized computation (nano seconds): "+(posttimememoized-pretimememoized));
		
//		System.out.println(24L*60*60*1000*1000);  // micro seconds per day
		
	}

	public static long fibonacciNormal(long n) {
		if(n==0 || n==1)
			return n;
		return fibonacciNormal(n-1)+fibonacciNormal(n-2);
	}
	
	public static long fibonacciMemoized(long n) {
		long fibvalue = 0;
		if(n==0) {
			return 0;
		} else if(n==1) {
			return 1;
		} else if(arr[(int)n]!=0) {   // if it is not zero, it implies that fib recursive call with n was already executed
			return arr[(int)n];
		} else {
			fibvalue = fibonacciMemoized(n-1)+fibonacciMemoized(n-2);
			arr[(int)n] = fibvalue;
			return fibvalue;
		}
	}
	
}
