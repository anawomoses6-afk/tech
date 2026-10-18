/* 13. Initialize an array of size 20 with the values 1 to 20 using a loop.*/

public class CopyArray {
    public static void main(String[] args) {

        int[] numbers = new int[20];

       for (int count = 0; count < numbers.length; count++) {
          numbers[count] = count + 1;
        }
      for (int index = 0; index < numbers.length; index++) {
           System.out.println(numbers[index]);
        }
    }
}

