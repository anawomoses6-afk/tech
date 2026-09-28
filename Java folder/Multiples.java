public class MultiplesOfThree {
    public static void main(String[] args) {

        for (int number = 1; number <= 50; number++) {
            if (number % 3 == 0) {
                System.out.println("Multiple: " + number);
            }
        }
    }
}
