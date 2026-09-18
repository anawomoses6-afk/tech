import java.util.Scanner;        
public class CommonFactor{
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    
    System.out.println("Enter Number");
      for (int number = 1; number <= 6; number++) {
            if (commonFactor %  number==0) {
                System.out.println(number);
            }
        }
             
  }
}
