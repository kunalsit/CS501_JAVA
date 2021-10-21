import java.util.Scanner;

public class C3E3CramerRuleForLinearEquations { 
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Description of the program
        System.out.println("This program will find solutions for Linear equations using Cramer's Rule ");
        
		//Linear equation format for users to understand what is a, b, c, d, e, and f
        System.out.println("A linear equation will be like: ");
        System.out.println("ax + by = e");
        System.out.println("cx + dy = f");
        
		// Prompt the user to enter a, b, c, d, e, and f.
		
		System.out.print("Enter a, b, c, d, e, f in a single line separated by spaces: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		// Echo input back to user
		System.out.println("Your two equations are: ");
		System.out.println("\t "+a+"x + "+b+"y = "+e); 
		System.out.println("\t "+c+"x + "+d+"y = "+f);

		// Solve the linear equation
		if (a * d - b * c == 0)
			System.out.println("The equation has no solution.");
		else
		{
			double x = (e * d - b * f) / (a * d - b * c);
			double y = (a * f - e * c) / (a * d - b * c);
			System.out.println("x is " + x + " and y is " + y);
		}
	}
}