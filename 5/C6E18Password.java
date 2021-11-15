import javax.swing.JOptionPane;

public class C6E18Password {
    public static void main(String[] args){
        int option = JOptionPane.YES_OPTION;
        
        while(option == JOptionPane.YES_OPTION){
            try{
                String password = JOptionPane.showInputDialog("Enter a Password: Must be 8 or more letters or numerical digits 2 of which must be digits");
                if(isValidPassword(password)){
                  option = JOptionPane.showConfirmDialog(null,"Valid Password \n Do you want to continue?");
                }else{
                  option = JOptionPane.showConfirmDialog(null,"Invalid Password \n Do you want to continue?");
                }
                
            }catch(Exception ex){
                String outputStr = " Invalid Password: " + ex.getMessage() + "\nDo you want to continue? ";option = JOptionPane.showConfirmDialog(null, outputStr);
                
            }
        } 
    } 
    
    private static boolean isValidPassword(String password) throws Exception{    
        final int LENGTH_OF_VALID_PASSWORD = 8;	
	    final int MINIMUM_NUMBER_OF_DIGITS = 2;	
		boolean validPassword = 
			isValidLength(password, LENGTH_OF_VALID_PASSWORD) && 
			isOnlyLettersAndDigits(password) &&
			hasNDigits(password, MINIMUM_NUMBER_OF_DIGITS);

		return validPassword;
    }
    
	public static boolean isValidLength(String password, int validLength) {
		return password.length() >= validLength;
	}

	public static boolean isOnlyLettersAndDigits(String password) {
		for (int i = 0; i < password.length(); i++) {
			if (!Character.isLetterOrDigit(password.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static boolean hasNDigits(String password, int n) {
		int numberOfDigits = 0;
		for (int i = 0; i < password.length(); i++) {
			if (Character.isDigit(password.charAt(i))) {
				numberOfDigits++;
			}
			if (numberOfDigits >= n) {
				return true;
			}
		}
		return false;
	}
    
} 
