/* /**
 * Class: CS 501-WS Introduction to JAVA Programming <br />
 * Instructor: M. Jurkat <br />
 * I pledge by honor that I have abided by the Steven's Honor System. <br />
 *  <br />
 *  Assignment: 4
 *  Signed: Kunal Goyal <br />
 */


//package HW4;

import java.util.Scanner;

public class C9E11E12LinearEquationsAndIntersectingPoint {

	public static void main(String[] args) {
			
		// Prompt the user to enter four endpoints
		Scanner input = new Scanner(System.in);

		double[][] points = new double[4][2]; 
		
		System.out.print("Enter value of x1(X-cordinate of Point 1): ");
		points[0][0] = input.nextDouble();	
		System.out.print("Enter value of y1(Y-cordinate of Point 1): ");
		points[0][1] = input.nextDouble();	
		System.out.print("Enter value of x2(X-cordinate of Point 2): ");
		points[1][0] = input.nextDouble();	
		System.out.print("Enter value of y2(Y-cordinate of Point 2): ");
		points[1][1] = input.nextDouble();
		System.out.print("Enter value of x3(X-cordinate of Point 3): ");
		points[2][0] = input.nextDouble();
		System.out.print("Enter value of y3(Y-cordinate of Point 3): ");
		points[2][1] = input.nextDouble();
		System.out.print("Enter value of x4(X-cordinate of Point 4): ");
		points[3][0] = input.nextDouble();
		System.out.print("Enter value of y4(Y-cordinate of Point 4): ");
		points[3][1] = input.nextDouble();

		// Get a, b, c, d, e and f from entered points
		double[] p = getArguments(points);

        LinearEquation intersectingPoint = 
			new LinearEquation(p[0], p[1], p[2], p[3], p[4], p[5]);
		
		// Display results For points X and Y and the intersection point
		if (!intersectingPoint.isSolvable()) {
			System.out.println("The two lines are parallel");
			System.out.println("The equation has no solution.");
		}
		else{
			System.out.println("x is " + intersectingPoint.getX() +
				" and y is " + intersectingPoint.getY());
			System.out.println("The intersecting point is at (" + 
				intersectingPoint.getX() + ", " + intersectingPoint.getY() + ")");
		}
		
		input.close();
	}

	/** getArguments returns the linear equation arquments a, b, c, d, e, and f */
	public static double[] getArguments(double[][] points) {
		double[] p = new double[6];
		p[0] = points[0][1] - points[1][1];
		p[1] = -1 * (points[0][0] - points[1][0]);
		p[2] = points[2][1] - points[3][1];
		p[3] = -1 * (points[2][0] - points[3][0]);
		p[4] = (points[0][1] - points[1][1]) * points[0][0] - 
					  (points[0][0] - points[1][0]) * points[0][1];
		p[5] = (points[2][1] - points[3][1]) * points[2][0] - 
					  (points[2][0] - points[3][0]) * points[2][1];
		return p;
	}
}