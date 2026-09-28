import java.util.Scanner;
public class inputDown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Number: ");
        int userInput = input.nextInt();
        
        for(int index = 1; index <= userInput; index--) {
            System.out.println(index);
        }
    }
}
