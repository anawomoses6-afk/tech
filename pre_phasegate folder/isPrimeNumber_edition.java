import java.util.Scanner;
public class isPrimeNumber_edition {

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter a number:");
        int number = inputCollector.nextInt();

        boolean result = isPrimeNumber(number);
        System.out.println(result);
        inputCollector.close();
    }
    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
