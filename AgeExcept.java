package task11;
import java.util.Scanner;

public class AgeExcept {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age =sc.nextInt();
		try 
		{
			if (age <18)
			{
				throw new InvalidAgeException("Please enter correct age");
				
			}
		}
		catch (Exception e)
			{
				e.printStackTrace();
				
			}
		
		}
		
	}


