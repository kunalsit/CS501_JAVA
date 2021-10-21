/* /**
 * Class: CS 501-WS Introduction to JAVA Programming <br />
 * Instructor: M. Jurkat <br />
 * I pledge by honor that I have abided by the Steven's Honor System. <br />
 *  <br />
 *  Assignment: 3
 *  Signed: Kunal Goyal <br />
 */
 

import java.util.Scanner;

public class C7E9E10E20FindMinValueAndSorting {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		// Create array of length 10
		double[] numbers = new double[10]; 
		
		// get 10 numbers from use 
		System.out.print("Enter ten numbers with one space between in one line: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}

		// Display the lowest value
		System.out.println("The lowest valued number is: " + low(numbers));
		
		// Display the lowest value's index
		System.out.println("The lowest value's index is:" +
			indexOfSmallestElement(numbers));
			
		// call selectionSort
		System.out.println("The Sorted array is:");
		selectionSort(numbers);

		// Display the sorted numbers
		for (double e: numbers) 
			System.out.print(e + " ");

	}

	public static double low(double[] ar) {
		double low = ar[0];	
		for (double i: ar) {
			if (i < low)
				low = i;
		}
		return low;
	}
	
	public static int indexOfSmallestElement(double[] ar){
		if (ar.length <= 1)
			return 0;
		
		double low = ar[0];
		int lowIndex = 0;
		
		for (int i = 1; i < ar.length; i++){
			if (ar[i] < low){
				low = ar[i];
				lowIndex = i;
			}
		}
		return lowIndex;
	}
	
	public static void selectionSort(double[] list){
		for (int i = list.length - 1; i >= 0; i--){
			double currentMax = list[i];
			int currentMaxIndex = i;

			for (int j = i - 1; j >= 0; j--){
				if (currentMax < list[j]){
					currentMax = list[j];
					currentMaxIndex = j;
				}
			}

			if (currentMaxIndex != i){
				list[currentMaxIndex] = list[i];
				list[i] = currentMax;
			}
		}
	}
}