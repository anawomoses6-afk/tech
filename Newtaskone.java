import java.util.Scanner;
public class Newtaskone{
public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Player one: Enter(ROCK,PAPER,SCISSORS):");
        String firstPlayer = input.next();

        System.out.println("Player two: Enter(ROCK, PAPER,SCISSORS):");
        String secondPlayer = input.next();

        if (firstPlayer.equals(secondPlayer)){
            System.out.println("It's A TIE.");
        } else if (firstPlayer.equals("ROCK") && secondPlayer.equals("SCISSORS")){
            System.out.println("Player one wins!");
        } else if (firstPlayer.equals("PAPER") && secondPlayer.equals("ROCK")){
           System.out.println("Player one wins!");
        } else if (firstPlayer.equals("SCISSORS") && secondPlayer.equals("PAPER")){
            System.out.println("Player one wins!");
        } else{
            System.out.println("Player two wins!");
        }

     }
}
