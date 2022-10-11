package com.greatlearningMerchant;

import java.util.Arrays;
import java.util.Scanner;

public class Money {
	int size;
	int[]arr;
     
	Scanner s = new Scanner(System.in);
	
	public static void main(String[]args) {
	 
	Scanner s = new Scanner(System.in);
	
	//here we can get the no of transactions that mean we get an array
	
			System.out.println("ENTER THE NUMBER OF TRANSACTIONS THAT ARE SUCCESSFUL");
	
	int size = s.nextInt();
	int []arr = new int[size];
	
	for(int i=0; i<arr.length;i++) {
		System.out.println("Elements at " +i + " position is ");
		arr[i] = s.nextInt();
		System.out.println(arr[i]);
	}
	System.out.println("The transactions are as follows:");
	System.out.println(Arrays.toString(arr)+" ");
	
	
	//we get targets to be achieved
	int target;
	int valueTarget;
	
	System.out.println("Enter the valueTarget : ");
	valueTarget = s.nextInt();
	
	//now we will get the target value, and the below code will give us either we achieve it or not
	
	int temp = 0;
	for(int i=0;i<arr.length;i++) {
		temp = temp+arr[i];
		
		if(temp >= valueTarget) {
			System.out.println("Target achieved at "+ (i+1) + " Transaction");
			break;
		}
	}
	if(temp < valueTarget)
			System.out.println("Target not achieved");
			
		}
		
	
	
	}