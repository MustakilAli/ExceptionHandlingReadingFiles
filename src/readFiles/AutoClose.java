package readFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AutoClose {
	public static void main(String[] args) {
		/*
		 * TRY - WITH RESOURCES. 
		 * WE USE PARANTHESIS AFTER TRY KEYWORD AND OPEN FILES THERE.
		 * IT WILL CLOSE THE OPENED FILES AUTOMATICALLY AT THE END.
		 */
		try (FileReader fr = new FileReader("Numbers.txt"); 
			BufferedReader br = new BufferedReader(fr); // Read File
		) 
		{       
			String value = "";

			while ((value = br.readLine()) != null) {
				System.out.println("num= " + value);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();   //ADDITONAL catch block, but remember Hierarchy or Exceptions in Try/Catch Block must be in order from subclass to superclass. 
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

