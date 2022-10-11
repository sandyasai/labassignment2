package com.greatlearningTravel;

public class Sort {
	private int[]arr;
	
	public Sort(int []arr) {
		this.arr = arr;
	}
	void descending() {
		int length = arr.length;
		
		for(int i=0;i<length;i++) {
			for(int j=0;j<(length-i-1);j++) {
				if(arr[j]<arr[j+1]) {
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}	
			}
		}
	}

}