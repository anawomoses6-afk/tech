import java.util.Scanner;
public class WhileLoopNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int count = 1; count <= 5; count++) {
            System.out.println("Enter a number:");
            int number = input.nextInt();
            sum = sum + number;
        }

        System.out.println(sum);
    }
}


