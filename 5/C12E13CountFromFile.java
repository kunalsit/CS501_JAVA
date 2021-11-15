import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class C12E13CountFromFile {
    public static void main(String[] args) throws IOException {
      int needsToContinue = 1;
      Scanner input = new Scanner(System.in);

      while(needsToContinue == 1){
        int charsCount = 0;
        int wordsCount = 0;
        int linesCount = 0;

        try{
          Scanner in = null;
          File selectedFile = null;
          JFileChooser chooser = new JFileChooser();
          FileNameExtensionFilter filter = new FileNameExtensionFilter("Text File", "txt");
          chooser.setFileFilter(filter);
          if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            selectedFile = chooser.getSelectedFile();
            in = new Scanner(selectedFile);
          }

          while (in.hasNext()) {
            String tmpStr = in.nextLine();
            
            if (!tmpStr.equalsIgnoreCase("")) {
              String replaceAll = tmpStr.replaceAll("\\s+", "");
              charsCount += replaceAll.length();
              wordsCount += tmpStr.split(" ").length;
            }
              
            ++linesCount;
          }
      
          System.out.println("Number of Characters: " + charsCount);
          System.out.println("Number of words: " + wordsCount);
          System.out.println("Number of lines: " + linesCount);

          in.close();
              
          System.out.println("Do you want to try another file? Press '1' for 'Yes' and '2' for 'No'");
          int test = input.nextInt();
            
          if(test == 1){
            needsToContinue = 1;
          }else{
            needsToContinue = 2;
          }
        }catch(Exception e){
          System.out.println("File doesn't exist ==> " + e);
          System.out.println("Do you want to try another file? Press '1' for 'Yes' and '2' for 'No'");
          int test = input.nextInt();
              
          if(test == 1){
            needsToContinue = 1;
          }else{
            needsToContinue = 2;
          }
        }
      }
    
      input.close();
    }
}