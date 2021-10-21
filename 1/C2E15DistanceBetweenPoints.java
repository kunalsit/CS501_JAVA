import java.util.Scanner;

public class C2E15DistanceBetweenPoints{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        
        System.out.print("Enter x2 and y2: ");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();

        double d 			= Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
        double squareRoot 	= Math.pow(d, 0.5);

        System.out.printf("The distance of the two points is %.15f", squareRoot);

    }
}