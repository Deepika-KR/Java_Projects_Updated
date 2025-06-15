package ex_05_Ternaryoperators;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks (0-100): ");
        int marks = scanner.nextInt();

        // Nested ternary operator for grade calculation
        String grade = (marks >= 90) ? "A" :
                (marks >= 80) ? "B" :
                        (marks >= 70) ? "C" :
                                (marks >= 60) ? "D" : "F";

        System.out.println("Grade: " + grade);
    }
}