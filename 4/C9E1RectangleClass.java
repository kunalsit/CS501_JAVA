//package HW4;

import java.util.Scanner;

public class C9E1RectangleClass
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		getRectangleDetails(input);
		input.close();
	}
	
	public static void getRectangleDetails(Scanner input){
	    int j = 2;
	    
	    try{
		    // Prompt user to enter width in correct format
    		System.out.print("Enter width of a rectangle in centemeters and in numeric format : ");
    		Double width = input.nextDouble();
    		
    		// Prompt user to enter height in correct format
    		System.out.print("Enter height of a rectangle in centemeters and in numeric format: ");
    		Double height = input.nextDouble();
    		
    		// create object of Rectangle class to find Area and perimeter
    		Rectangle rectangle1 = new Rectangle(width, height);
        	
        	// Display the width, height, area, and perimeter of rectangle1
        	System.out.println("-------------------------------------");
        	System.out.println("\n Rectangle Details:");
        	System.out.println("-------------------------------------");
        	System.out.println("Width(in cm):     " + rectangle1.width);
        	System.out.println("Height(in cm):    " + rectangle1.height);
        	System.out.println("Area(in cm^2):    " + rectangle1.getArea());
        	System.out.println("Perimeter(in cm): " + rectangle1.getPerimeter());
        	System.out.println("-------------------------------------");
        	System.out.println("Do You want to enter the details again? Enter '1' for 'Yes' and '2' for 'No'");
		    
		    j = input.nextInt();
		    
		    if(j == 1){
		        getRectangleDetails(input);
		    }else{
		        return;
		    }
		}catch(Exception e){
		    // throw exception if any exists
		    System.out.println("Invalid Input: Please enter correct width and height in number format." + e);
		    System.out.println("Do You want to enter the details again? Enter '1' for 'Yes' and '2' for 'No'");
		    
		    j = input.nextInt();
		    
		    if(j == 1){
		        getRectangleDetails(input);
		    }else{
		        return;
		    }
		}
	}
}