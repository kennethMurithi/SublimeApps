//fibonacci(0)=0
//fibonacc1(1)=1
// fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
import java.math.BigInteger;

public class FibonacciCalculator
{
	private static BigInteger TWO = BigInteger.valueOf(2);

	// recusive declaration of method fibonacci
	public static BigInteger fibonacci( BigInteger  number )
	{
		if ( number.equals( BigInteger.ZERO) || 
			number.equals (BigInteger.ONE)) // base case
		   return number;
		   
		else // recursion step
			return fibonacci(number.subtract ( BigInteger.ONE )).add(
				fibonacci( number.subtract(TWO)));	
	} // end method fibonacci

	// display the fibonacci value from 0-40
	public static void main(String[] args)
	{
		for (int counter = 0; counter <= 40; counter++)
			System.out.printf(" Fibonacci of %d is : %d\n", counter , 
				fibonacci( BigInteger.valueOf( counter )));
	}// end main
} // end class FibonaccciCalculator