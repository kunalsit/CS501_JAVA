/* /**
 * Class: CS 501-WS Introduction to JAVA Programming <br />
 * Instructor: M. Jurkat <br />
 * I pledge by honor that I have abided by the Steven's Honor System. <br />
 *  <br />
 *  Assignment: 3
 *  Signed: Kunal Goyal <br />
 */
 
import java.util.Scanner;

public class C5C6E16E20E10FindFactorsAndPrimeNumbers{
	// To display 8 prime numbers per line
	final static int NUM_PER_LINE = 8; 
	// Minimum of range for Prime Number
	final static int R1 = 2;
	// Maximum of range for Prime Number
	final static int R2 = 1000;
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args){
		// Scanner Started
		//Program Description
		System.out.println("This program allows you check if a number (less than 1000) is a prime number.");
		System.out.println("If your number is not prime, the program will display its prime factors in ascending order");
		System.out.println("The first 50 prime numbers (2 -> 229) are printed below.");

        // Ex 5.16 Factors of Ineteger Number **start
		// Get an Integer number
		System.out.print("Enter any Integer Number to get the Factors of that Number: ");
		int num1 = in.nextInt();
		System.out.println();
		
		factors(num1);
		// Ex 5.16 Factors of Ineteger Number **end
	    
	    System.out.println();
	    
	    // Ex 5.20 Display Prime Numbers **start
		System.out.println("The Prime Numbers between 2 and 1,000 (inclusive) are: \n");
	    displayPrime(R1,R2);
	    System.out.println();
	    // Ex 5.20 Display Prime Numbers **end
	    
	    // Ex 6.10 Check if the number is Prime or not **start
		recursiveOption();
	    // Ex 6.10 Check if the number is Prime or not **end
	}
	
	public static void factors(int num){
        int i = 2; 
        
        // Display factors of the Integer number given by user
		System.out.printf("The Factors of %d are: ", num);
        // Factors of an Integer logic start
    	while (num / i != 1){
    	    if (num % i  == 0){
    		    System.out.print(i + ", ");
    			num /= i; 
    		}else{
    			i++;
    		}
    	}
    	System.out.println(num + ".");
    	// Factors of an Integer logic end
    }
    
    public static void displayPrime(int num1, int num2){
        // Count the number of prime numbers
		int count = 0; 
		
        // Dispay Prime Numbers logic start
		// Repeated loop to find prime numbers
		for (; num1 <= num2; num1++){
		    boolean isPrime = true;
		    isPrime = checkPrime(num1);

			if (isPrime) {
				count++;	
                if (count % NUM_PER_LINE == 0){
					System.out.println(num1);
				}else{
					System.out.print(num1 + " ");
				}
			}
		}
		// Dispay Prime Numbers logic start
    }
    
    public static boolean checkPrime(int num1){
        boolean flag = true;	
        
        // check if the integer is prime or not logic start
        for (int div = 2; div <= num1 / 2; div++){
			if (num1 % div == 0){ 
				flag = false;	
				break;	
			}
		}
		// check if the integer is prime or not logic end
		
		return flag;
    }
    
    public static void recursiveOption(){

        
        System.out.println("Please enter any number between 2 and 1,000 (inclusive) to check if it is a Prime Number or not: \n");
	    int num2 = in.nextInt();
	    boolean flagPrime = checkPrime(num2);
	    
	    if(flagPrime){
	        System.out.println();
	        System.out.println("The number is Prime Number. Do you want to check another number? Please enter '1' for 'Yes', '2' for 'No'. \n");
	        int checkoContinue = in.nextInt();
	        if(checkoContinue == 1){
	            recursiveOption();
	        }
	        
	    }else{
	        System.out.println();
	        System.out.println("The number is not a Prime Number.");
	        factors(num2);
	        System.out.println();
	        System.out.println("Do you want to check another number? Please enter '1' for 'Yes', '2' for 'No'. \n");
	        int checkoContinue = in.nextInt();
	        if(checkoContinue == 1){
	            recursiveOption();
	        }
	        
	    }
	    
    }
}