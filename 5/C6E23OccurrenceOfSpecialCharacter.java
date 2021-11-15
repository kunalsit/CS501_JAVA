import java.util.Scanner;

public class C6E23OccurrenceOfSpecialCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int countinueNewString = 1;
        int count = 1;
        
        try{
        while(countinueNewString == 1){
            System.out.print("Enter a string to search occurrences of characters: ");
            String s = input.nextLine();
            
            if(count != 1){
                s = input.nextLine();
            }
            
            int countinueSearching = 1;
            
            while(countinueSearching == 1){
                System.out.print("Enter a character to find it's occurence in the given string: ");
                char ch = input.next().charAt(0);
        
                System.out.println("The number of occurrences of \'" + ch +"\' in \"" + s + "\" is " + count(s,ch));
            
                System.out.println("Do you want to continue searching? Type '1' for 'Yes' and '2' for 'No'");
                countinueSearching = input.nextInt();
                
                if(countinueSearching != 1){
                    System.out.println("Searching String ends.");
                }
            }
            
            System.out.println("Do you want to enter new string? Type '1' for 'Yes' and '2' for 'No'");
            countinueNewString = input.nextInt();
            
            if(countinueNewString != 1){
                System.out.println("End of the program");
            }
            
            count += 1;
        }
        }catch(Exception e){
            System.out.println("Invalid Inputs ==> " + e);
        }
    }

    public static int count(String str, char a) {
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) count++;
        }

        return count;
    }
}