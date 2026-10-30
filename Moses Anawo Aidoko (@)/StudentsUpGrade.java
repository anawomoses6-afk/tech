
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many students? ");
        int numStudents = input.nextInt();
        System.out.print("How many subjects? ");
        int numSubjects = input.nextInt();

        int[][] scores = new int[numStudents][numSubjects];

        for (int s = 0; s < numStudents; s++) {
            for (int sub = 0; sub < numSubjects; sub++) {
                int score;
                while (true) {
                    System.out.print("Student " + (s + 1) +
                                     ", Subject " + (sub + 1) + ": ");
                    score = input.nextInt();
                    if (score >= 0 && score <= 100) break;
                    System.out.println("Score must be 0–100. Try again.");
                }
                scores[s][sub] = score;
            }
        }

        int[] studentTotals = new int[numStudents];
        for (int s = 0; s < numStudents; s++) {
            for (int sub = 0; sub < numSubjects; sub++) {
                studentTotals[s] += scores[s][sub];
            }
        }

        int[] position = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            int rank = 1;
            for (int j = 0; j < numStudents; j++) {
                if (studentTotals[j] > studentTotals[i]) rank++;
            }
            position[i] = rank;
        }
    }
}

