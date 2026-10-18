

import java.util.Scanner;

public class Happiness {

    public static String Score() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first score: ");
        int firstScore = input.nextInt();

        System.out.print("Enter second score: ");
        int secondScore = input.nextInt();

        double average = (firstScore + secondScore) / 2.0;

        if (average > 76.2) {
            return "Sufficient - Score: " + average;
        }
        else if (average >= 50 && average <= 76.2) {
            return "You are getting there - Score: " + average;
        }
        else {
            return "Get better - Score: " + average;
        }
    }

    public static void main(String[] args) {

        String result = Score();

        System.out.println(result);
    }
}

    
    
