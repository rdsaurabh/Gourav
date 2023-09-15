package recursion;

import java.util.Scanner;

public class FibonacciRecursion {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ans = fib(n);
		System.out.println(ans);
	}

	private static int fib(int n) {
		if(n == 0) return  0;
		if(n == 1) return 1;
		return fib(n - 1) + fib(n - 2);
	}

}
