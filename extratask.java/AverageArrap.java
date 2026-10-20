public class AverageArra {
    public static void main(String[] args) {

        double[] numbers = {20.5, 10.20, 10.5, 10.5};
        double sum = 0;

        for (int index = 0; index < numbers.length; index++) {
            sum = sum + numbers[index];
        }

        double average = sum / numbers.length;

        System.out.println(average);
    }
}

