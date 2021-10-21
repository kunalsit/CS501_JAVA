import java.util.Scanner;

public class C3E27PointInTriangle {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in); 	

		//Description of the program
        System.out.println("This program will find if the co-ordinates entered by user is inside the given triangle or not.");
        System.out.println();
        
		// Prompt the user to enter a point with x and y coordinates
		System.out.print("Enter a point's x- and y-coordinates in a single line separated by spaces: ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		// Determine whether the point is inside the triangle
		// getting the point of ina line that starts at point 

		// Get the intersecting point with the hypotenuse side of the triangle
		// of a line that starts and points (0, 0) and touches the user points
		double xintersection = (-x * (200 * 100)) / (-y * 200 - x * 100);
		double yintersection = (-y * (200 * 100)) / (-y * 200 - x * 100);

		// Display results
		System.out.println("The point " + ((x > xintersection || y > yintersection)? "is not " : "is " ) + "in the triangle");
	}
}