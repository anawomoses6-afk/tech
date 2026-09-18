 import java.util.Scanner;
public class Long{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int firstUserInput = userInput.nextInt();
        System.out.print("Enter Second number:");
        int secondUserInput = userInput.nextInt();

        if (secondUserInput == 0){
            System.out.println("cannot divide by zero");
        
        } else {
             int result = firstUserInput / secondUserInput;
        System.out.println("result: " + result);
         
         }
        
    }

}
