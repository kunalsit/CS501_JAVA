/* /**
 * Class: CS 501-WS Introduction to JAVA Programming <br />
 * Instructor: M. Jurkat <br />
 * I pledge by honor that I have abided by the Steven's Honor System. <br />
 *  <br />
 *  Assignment: 6
 *  Signed: Kunal Goyal <br />
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class CH10E13GeometryMyRectangle2DClass {
	public static void main(String[] args) {
	    int testcont = 1;
	    int cont = 1;
	    Scanner input = new Scanner(System.in);
	    
	    try{
	        while(cont == 1){
        	    System.out.println("First you need to enter details of the Base Rectangle. For that you need to specify the point (x, y) , width, and height ");
        	    System.out.print("Enter the value of x-cordinate in (x,y) point: ");
                double x = input.nextDouble();
                if(x < 0){
                    throw new IllegalArgumentException("Enter valid positive numbers");
                }
                
                System.out.print("Enter the value of y-cordinate in (x,y) point: ");
                double y = input.nextDouble();
                if(y < 0){
                    throw new IllegalArgumentException("Enter valid positive numbers");
                }
                
                System.out.print("Enter the width of the rectangle: ");
                double w = input.nextDouble();
                if(w < 0){
                    throw new IllegalArgumentException("Enter valid positive numbers");
                }
                
                System.out.print("Enter the height of the rectangle: ");
                double h = input.nextDouble();
                if(h < 0){
                    throw new IllegalArgumentException("Enter valid positive numbers");
                }
        		
        		MyRectangle2D r1 = new MyRectangle2D(x, y, w, h);
        
        		System.out.println("\nRectangle:");
        		System.out.println("Area: " + r1.getArea());
        		System.out.println("Perimeter: " + r1.getPerimeter());
        		System.out.print("\n");
        		
        		System.out.println("Enter a point to check if it exist inside the rectangle or outside the rectangle");
        	    System.out.print("Enter the value of x-cordinate in (x,y) point: ");
                double x1 = input.nextDouble();
                
                System.out.print("Enter the value of y-cordinate in (x,y) point: ");
                double y1 = input.nextDouble();
                System.out.print("The base rectangle ");
        		System.out.println((r1.contains(x1, y1) ? "Contains" : "Does not contain") + 
        			" the point (" + x1 + ", " + y1 + ").");
        		System.out.print("\n");
        		
        		System.out.println("Now please enter details of the test Rectangle. For that you need to specify the point (x, y) , width, and height ");
        	    while(testcont == 1){
            	    System.out.print("Enter the value of x-cordinate in (x,y) point: ");
                    double testx = input.nextDouble();
                    if(testx < 0){
                        throw new IllegalArgumentException("Enter valid positive numbers");
                    }
                    
                    System.out.print("Enter the value of y-cordinate in (x,y) point: ");
                    double testy = input.nextDouble();
                    if(testy < 0){
                        throw new IllegalArgumentException("Enter valid positive numbers");
                    }
                    
                    System.out.print("Enter the width of the rectangle: ");
                    double testw = input.nextDouble();
                    if(testw < 0){
                        throw new IllegalArgumentException("Enter valid positive numbers");
                    }
                    
                    System.out.print("Enter the height of the rectangle: ");
                    double testh = input.nextDouble();
                    if(testh < 0){
                        throw new IllegalArgumentException("Enter valid positive numbers");
                    }
            		
            		MyRectangle2D r2 = new MyRectangle2D(testx, testy, testw, testh);
            		
            		r1.overlaps(r2);
            		System.out.print("\n");
            		
            		System.out.print("Do you want to test another rectangle? Enter '1' for 'Yes' or '2' for 'No' : ");
                    testcont = input.nextInt();
        	    }
    	    
        	    System.out.print("Do you want to start with new base rectangle? Enter '1' for 'Yes' or '2' for 'No' : ");
                cont = input.nextInt();
                
                input.close();
	        }
	    }catch(InputMismatchException e){
	        System.out.print("Please enter valid numbers" + e.getMessage());
	    }
	    
	    
	}
}