public class Addsum {

    public static void main(String[] args) {

        int[] numbers = {30, 50, 60, 90, 94};

        int result = calculateSum(numbers);

        System.out.println(result);
            }
    public static int calculateSum(int[] numbers) {

        int sum = 0;

        for (int number : numbers) {
            sum = sum + number;
        }

        return sum;
    }
}
