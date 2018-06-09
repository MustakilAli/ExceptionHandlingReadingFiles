package readFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadFileDataIntoALisy {

	/*
	 * Store all numbers from Numbers.txt file into a List of Integers
	 *	
	 */
	public static void main(String[] args) {
		
		List<Integer>nums = new ArrayList<>();
		
		try (FileReader fr = new FileReader("Numbers.txt"); 
				BufferedReader br = new BufferedReader(fr); 
			) {       
				String value = "";

				while ((value = br.readLine()) != null) {
					nums.add(Integer.valueOf(value)); //Converting String to Object 
				}  
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		//Print Count of numbers
				System.out.println("Number of Lines:  " + nums.size()); //Because ArrayList's size is --> size();
		//Print Sum of all Numbers
				int sum = 0;
				for(Integer number: nums) {
					sum = sum+number;
				}
				System.out.println("Sum of all Numbers: " + sum);
		//Print the largest number
				int max = nums.get(0);
				for (int i = 1; i < nums.size(); i++) {
					if(nums.get(i) > max) {
						max = nums.get(i);
					}
				}
				System.out.println("Max with for loop: " + max);
		
		//Print the Largest Number by - Sorting it then take last value
				Collections.sort(nums);
				System.out.println("Max with for loop: " + nums.get(nums.size()-1));
		//Collections.max
				System.out.println("Max with Collections.max method: " + Collections.max(nums));
		//Print Unique Numbers
				/*
				 * 1. Create an empty arrayList (a)
				 * 2. read a number from nums list-  if the number is not in a then store into a 
				 * 3. If the number is already there, skip it.
				 * 4. repeat step 2-3 for all numbers
				 */
				List<Integer> newList = new ArrayList<>();
				for(Integer number : nums) {
					if(!newList.contains(number)) { //If newList DOES NOT contain number, 
						newList.add(number);
					}
				}
				System.out.println("Count of Unique Nums: " + newList.size());
				/*
		 * 1)Create a method checkForDuplicates. that accepts an arraylist of integers
		 * and return a boolean.
		 * 
		 * if arraylist has any duplication method returns false. otherwise returns true
		 * 
		 * ex: list1 --> 3,4,5,6 list2 --> 4,4,6,3,244,44,44
		 * 
		 * print checkForDuplicates(list1) --> false print checkForDuplicates(list2) -->
		 * true
		 * 
		 * 2) Find the second largest number in a list without sorting your list
		 * 
		 * 
		 */
		int secondLargest = nums.get(0);
		int largest = nums.get(0);
		for (int i = 1; i < nums.size(); i++) {
			if (nums.get(i) > largest) {
				secondLargest = largest;
				largest = nums.get(i);

				if (nums.get(i) > secondLargest && nums.get(i) != largest) {
					secondLargest = nums.get(i);
				}
			}
		}

		System.out.print("Second Largest Number: " + secondLargest);
			
		
		}
	public boolean checkForDuplicates(ArrayList<Integer>nums) {
		List <Integer> list1 = new ArrayList<>();
		
		return true;
		}
	}

