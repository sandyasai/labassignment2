package com.greatlearningTravel;
import java.util.Scanner;

public class Debit {
	int size;
	int arr;

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of the currency denominations");
		int size = s.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the curency denominations value: ");
		//arr[i] = s.nextInt();
		for(int i=0; i<arr.length;i++) {
			arr[i] = s.nextInt();
			System.out.println(arr[i]);
		}
		
		//Sorting the array
		Sort sorting = new Sort(arr);
		sorting.descending();
		
		//AMOUNT WE WANT TO PAY
		
		 int amount;
		System.out.println("Enter amount you want to pay");
		amount = s.nextInt();
		System.out.println("Amount is "+ amount); 
		
		//now here we get no of denominations
		
		StringBuilder result = new StringBuilder();
		boolean outcome = false;
		for(int i=0; i<arr.length;i++) {
			
			int Value = arr[i];
	    	int quotient = amount / Value;
			int remainder = amount % Value;
			
			if(quotient==0){
				
			}else {
			result.append(String.format
					("Denomination Value %d, DenominationCount %d", Value,quotient));
			result.append(System.getProperty("line.separator"));
				amount = remainder;
			}
			if(remainder==0) {
				outcome = true;
				break;
			}
		}
		if(outcome) {
			System.out.println("Success");
		System.out.println(result);
	}else {
		System.out.println("Failure");
	} 
			
		}
	}