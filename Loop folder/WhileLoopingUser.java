import java.util.Scanner;
public class WhileLoopingUser {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
          int number = 1;
          while (number != 0) {
          System.out.println("Enter number: ");
          number = input.nextInt();
            
         }
            System.out.println(number);
    }
}
