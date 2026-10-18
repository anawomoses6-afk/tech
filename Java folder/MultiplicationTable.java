public class MultiplicationTable {
    public static void main(String[] args) {

        System.out.println("        Multiplication Times Table");
        System.out.println("       1   2   3   4   5   6   7   8   9  10");
        System.out.println("    ---------------------------------------------");

        for (int index = 1; index <= 10; index++) {

            System.out.printf("%2d |", index);

            for (int count = 1; count <= 10; count++) {

                System.out.printf("%4d", index * count);
            }

            System.out.println();
        }
    }
}


