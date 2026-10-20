public class largestElementp {
    public static void main(String[] args) {

        int[] numbers = {25, 17, 25, 13, 18};
        int largest = numbers[0];

        for (int count = 0; count < numbers.length; count++) {
            if (numbers[count] > largest) {
                largest = numbers[count];
            }
        }

        System.out.println(largest);
    }
}

