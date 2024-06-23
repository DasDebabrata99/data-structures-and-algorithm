package recursion;

public class Fibonacci {

	public static void main(String[] args) {
		Fibonacci obj = new Fibonacci();
		System.out.println(obj.fib(9));
	}

	long[] fibonacciCache = new long[51];

	public long fib(long n) {
		if (n <= 1) {
			return n;
		}
		if (fibonacciCache[(int) n] == 0) {

			long fibonacciOfN = fib(n - 1) + fib(n - 2);
			fibonacciCache[(int) n] = fibonacciOfN;
			return fibonacciOfN;
		}else {
			return fibonacciCache[(int) n];
		}

	}
}
