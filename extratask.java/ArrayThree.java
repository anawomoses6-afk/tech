import java.util.Scanner;
public class ArrayDeclearation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] arr = new double[5];
        
        for (int i = 0; i < 5; i++) {
          System.out.print("Enter a number: ");
           arr[i] = scanner.nextDouble();
         }
        
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }
}

