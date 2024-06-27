package task11;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileNotFoundExpe {

	public static void main(String[] args) {
		
		
		
		try {
			FileOutputStream file = new FileOutputStream("C:\\Users\\HP\\eclipse-workspace\\Task10\\src\\task15\\dom.txt");
		
			file.write(1234);
			file.close();
		} 
		
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("check the file");
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		catch(IOException e)
		{
			e.printStackTrace();
			
		}
	}

}
