
import java.util.InputMismatchException;
import java.util.Scanner;
public class DivideByZeroNoExceptionHandling
{
	// demonstrate throwing an exception when a divide by zero occurs 
	public static int quotient(int numerator, int denominator)
	{
		return numerator / denominator;// posible division by zero
	} // end method quotient


	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in); //Scanner for input
		boolean continueLoop = true; //determines if more inports is needed

		do {
			try{
				System.out.print("please enter an Integer numerator: ");
				int numerator = input.nextInt();
				System.out.print("please enter an integer denominator: ");
				int denominator = input.nextInt();

				int result = quotient( numerator, denominator);
				System.out.printf("\n Result: %d / %d = %d\n", numerator, denominator, result );

				continueLoop = false; //input successful: end looping
			} // end try
			catch( InputMismatchException inputMismatchExeption){
				System.err.printf("\nException: %s\n", inputMismatchExeption);
				input.nextLine(); // Discard input so that user can try again
				System.out.println("You must Enter Integer pleace try again");
			}//end catch
			catch( ArithmeticException arithmeticException){
				System.err.printf("\nException: %s\n", arithmeticException );
				System.out.println("Zero is an invalid denominator. pleace try again.\n");
			}//end catch

		}while( continueLoop); //end do...while 

	}// end main 
}// end class DivideByZeroNoExcptionHandling