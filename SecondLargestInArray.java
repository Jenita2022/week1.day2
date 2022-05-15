package week1.day2;

import java.util.Arrays;

public class SecondLargestInArray {

	public static void main(String[] args) {
		
		int [] arr = {12,15,16,17,10,5};
		 int totItems =arr.length;
		//System.out.println(totItems);
		 Arrays.sort(arr);
		 int secondLargest = arr[totItems-2];
		System.out.println(secondLargest);

	}

}
