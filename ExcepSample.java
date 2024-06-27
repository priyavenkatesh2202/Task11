package task11;
import java.util.Scanner;
public class ExcepSample {
	

	
	    public ExcepSample(String message) {
		// TODO Auto-generated constructor stub
	}

		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter the first number: ");
	        int dividend = sc.nextInt();
	        
	        System.out.print("Enter the second number: ");
	        int divisor = sc.nextInt();
	        
	        sc.close();
	        try {
	            double result = divide(dividend, divisor);
	            System.out.println("Result: " + result);
	            
	        } catch (ArithmeticException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	    
	    public static double divide(int dividend, int divisor) {
	        if (divisor == 0) {
	            throw new ArithmeticException("Cannot divide by zero. Please enter a non-zero denominator.");
	        }
	        
	        return (double) dividend / divisor;
	    }
	
	


}
