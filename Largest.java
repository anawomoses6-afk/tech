import java.util.Scanner;
public class Largest{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
            
        System.out.print("Enter first number: ");
        int firstNumber = userInput.nextInt();
        
        System.out.print("Enter second number: ");
        int secondNumber = userInput.nextInt();

        
        System.out.print("Enter third : ");
        int thirdNumber = userInput.nextInt();
        
        int largest = 0;
        if (firstNumber > secondNumber && firstNumber > thirdNumber ){
            largest = firstNumber;
        } 
        if (secondNumber > firstNumber && secondNumber > thirdNumber ){
            largest = secondNumber;
        }
        if (thirdNumber > firstNumber && thirdNumber > secondNumber){
            largest = thirdNumber;
        }    
        System.out.println("Result: " + largest);

  }
       
}
