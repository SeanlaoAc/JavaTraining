package basics;

public class Fibonacci {

	public static void main(String[] args) {
		// Fibonacci defined by sum of 2 previous fibonacci numbers
		System.out.println(fib(3));
		

	}
	public static int fib(int n) {
		if (n == 0 ) {
			return 1;
		}
		else if (n==1) {
			return 1;
		}
		return (fib(n-1) + fib(n-2));
	}

}
