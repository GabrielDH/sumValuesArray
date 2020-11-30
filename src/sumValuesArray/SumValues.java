package sumValuesArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SumValues {
	public static void main(String[] args) {
		boolean validPrompt=false;
		Scanner userInput = new Scanner(System.in);
		while (validPrompt==false) {
			System.out.println("1 for Sum on Arrays - 2 for ToPower Method");
			String stringProgram=userInput.nextLine().toUpperCase();
			int programID=Integer.parseInt(stringProgram);			
			if ((programID==1) || (programID==2)) {
				validPrompt=true;
			}
			else {
				System.out.println("Please insert 1 or  2 ");
			}
			
			//Write a program to sum all the values of a given Array in Java.
			if (programID==1) {
				validPrompt=false;
				while (validPrompt==false) {
					System.out.println("Insert the # of values in your Array (max200)");
					String stringArray=userInput.nextLine().toUpperCase();
					int intArray=Integer.parseInt(stringArray);		
					if (intArray<200) {
						validPrompt=true;
						System.out.println("Si");
						int[] arrayInt= new int[intArray];
						int i=0;
						while(i<intArray) {
							System.out.println("Insert Value");
							String stringValue=userInput.nextLine().toUpperCase();
							int intValue=Integer.parseInt(stringValue);			
							arrayInt[i]=intValue;
							i++;
						}
						int total=0;
						for (i = 0; i < arrayInt.length; i++) {
							total += arrayInt[i];
						}		
						System.out.println("Sum is "+total);
					}
					else {
						System.out.println("Please insert a number below 200");
					}
				}
			}
			
			//toPower Method
			if (programID==2) {
				System.out.println("Insert the size of your array");
				String stringSize=userInput.nextLine().toUpperCase();
				int intSize=Integer.parseInt(stringSize);		
				System.out.println("Insert the power");
				String stringPower=userInput.nextLine().toUpperCase();
				int intPower=Integer.parseInt(stringPower);
				toPower(intSize,intPower);
			}
		}
	}

	static void toPower(int intSize, int intPower) {
		int[] arrayInt= new int[intSize];
		int[] returnArray= new int[intSize];
		int i=0;
		int j=0;
		String output=null; 
		//Filling inputArray
		while(i<intSize) {
			int total=1;
			arrayInt[i]=i;					
			for (j = 0; j < intPower; j++) {
				total *= arrayInt[i];
			}
			returnArray[i]=total;
			if (i==0) {
				output="["+returnArray[i];
			}else if (i==(intSize-1)){
				output=output+","+returnArray[i]+"]";						
			}else {
				output=output+","+returnArray[i];
			}
			System.out.println("Product "+i +" is "+returnArray[i]);
			i++;
		}		
		System.out.println(output);
	}
}

/*
Write a public static method called "toPower" that takes in as parameters two integers called size and power. 
The method should return an array of size "size" with each array index raised to the value of "power." 
So, for example, if we passed in "size = 4" and "power = 2" to the "toPower," the method should return the following result: [0,1,4,9].*/