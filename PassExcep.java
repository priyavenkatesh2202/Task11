package task11;
import java.util.Scanner;
public class PassExcep {
	
		
		    public static final String pass = "password@123";

		    public static void checkPass(String password) throws Exception {

		        if(!password.equals(pass)){
		            throw new InvalidPasswordException("Enter the correct password");
		        }

		    }

		    public static void main(String[] args) throws Exception {

		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the password");

		        try {
		            checkPass(sc.nextLine());
		            System.out.println("Login Successful");
		        }catch (Exception e){
		        	
		        	e.printStackTrace();
		            System.out.println("wrong password");
		        }

		    }
		}
		
	


