
/**
 *  Write code that reads a series of test scores (as integers) from the user until the user 
 *  enters -1. The test scores should be in a range from 0 to 100. If the user enters an invalid number
 *  tell them to re-enter the value. Keep track of the number of passing and failing test grades. Assume 
 *  that a failing grade is below a 60. When the user enters '-1', print out the number of passing and failing students.
 */

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter -1 to quit");
        int passing = 0;
        int failing = 0;
        int sum = 0;
        int students = 0;
        double average = 0;
        while (true) {
            System.out.println("Please enter a student's test score");
            int score = Integer.valueOf(scanner.nextLine());
            if (score == -1) {
                break;
            }
            if (score >= 0 && score <= 100) {
                sum += score;
                students++;
                if (score >= 60) {
                    passing++;
                } else {
                    failing++;
                }
            } else {
                System.out.println("Invalid number.");
            }
        }
        if (students > 0) {
            System.out.println("The number of passing students was " + passing + ".");
            System.out.println("The number of failing students was " + failing + ".");
            average = (double) sum / students;
            System.out.println("");
            System.out.println("The average score was" + average + ",");
            if (average >= 60)
                System.out.println(" it was a passing grade.");
            else {
                System.out.println(" it was a failing grade.");
            }

        } else {
            System.out.println("No valid scores entered.");
        }
    }
}
