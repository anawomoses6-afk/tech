/* 12. Fill an array with the first 10 even numbers.*/

public class InitializeArray {
    public static void main(String[] args) {

        int[] numbers = new int[10];

        for (int count = 0; count < numbers.length; count++) {
            numbers[count] = (count + 1) * 2;
        }

        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }
    }
}
