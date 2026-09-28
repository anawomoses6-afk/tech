import java.util.Scanner;
public class SumofN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sum = 0;
        
        System.out.print("Enter Number: ");
        int userInput = input.nextInt();
        
        for(int index = 1; index <= userInput; index++) {
            sum += index;
            System.out.println(sum);
        }
    }
}
