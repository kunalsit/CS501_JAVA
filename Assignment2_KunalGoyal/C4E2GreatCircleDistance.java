import java.util.Scanner;

public class C4E2GreatCircleDistance {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	//creates Scanner

		// Constant value for the average radius of the earth
		final double EARTH_RADIUS = 6371.01;	
		
		System.out.println("This program allows you to enter the latitude and longitude in degrees for two coordinates on earth");
		System.out.println("It will then calculate the Great Circle Distance between the two");
		System.out.println("North and West coordinates are positive, South and East are negative");
		
		
		// Prompt the user to enter the latitude and longitude of two points on the earth in degrees
		System.out.print("Enter point 1 (latitude and longitude) in degrees in a single line separated by spaces: ");
		double lat1 = input.nextDouble();
		double lon1 = input.nextDouble();
		
		System.out.print("Enter point 2 (latitude and longitude) in degrees in a single line separated by spaces: ");
		double lat2 = input.nextDouble();
		double lon2 = input.nextDouble();
		
		System.out.println("\nYour coordinates:");
		System.out.println("-----------------");
		System.out.println("Point 1 = ("+ lat1 +", "+ lon1 +")");
		System.out.println("Point 2 = ("+ lat2 +", "+ lon2 +")");

		// Convert degrees to radians
		lat1 = Math.toRadians(lat1);
		lon1 = Math.toRadians(lon1);
		lat2 = Math.toRadians(lat2);
		lon2 = Math.toRadians(lon2);

		// Calculate its great circle distance
		double distance = EARTH_RADIUS * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));

		// Result
		System.out.println("The distance between the two points is " + distance + " km");
		
		input.close();
	}
}