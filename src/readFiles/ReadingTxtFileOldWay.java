package readFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingTxtFileOldWay {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("Numbers.txt");
			br = new BufferedReader(fr); //Read File 
			
			String value = "";
			
			while((value=br.readLine()) != null) {
				System.out.println("num= " + value);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close(); //close also throws an exception, hence why a try/catch block is needed
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	} 
}
											//A regular file reader, if the file you are trying to reach is in a separate document- MUST PASTE FILE PATH
											
	//  BufferedReader br = new BufferedReader(new FileReader("Numbers.txt"));
		
		//Using for loop to print each number.txt out. 
//		for(int i = 1; i <=1000; i++) {
//			System.out.print(i + "-");
//			System.out.println(br.readLine()); //Read Line 

//		}
		
		
		
		
		//Incorrect while loop below ---> it is reading line in while condition and then reading in print statement - which is causing it to skip every other number. 
//		while(br.readLine() != null) {
//			System.out.println(br.readLine());
//		}
//		System.out.println(br.readLine()); //Read Line 

		
		
		
