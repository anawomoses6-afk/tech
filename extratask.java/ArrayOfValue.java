public class ArrayValues {
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

