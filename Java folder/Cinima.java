import java.util.Scanner;
public class cinema {

    public static void displaySeats(char[][] seats) {
        for (int row = 0; row < seats.length; row++) {
            for (int seat = 0; seat < seats[row].length; seat++) {
                System.out.print(seats[row][seat] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }



    public static void main(String[] args) {
            char[][] seats = new char[4][5];
            for (int row = 0; row < seats.length; row++) {
                for (int seat = 0; seat < seats[row].length; seat++) {
                    seats[row][seat] = (char) ('O');
                }
            }

            displaySeats(seats);

            Scanner input = new Scanner(System.in);
            System.out.print("Enter row number: ");
            int rowNum = input.nextInt();
            System.out.print("Enter seat number: ");
            int seatNum = input.nextInt();

            seats[rowNum - 1][seatNum - 1] = (char) ('X');

            displaySeats(seats);
    }
}
