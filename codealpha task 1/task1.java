import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> grades = new ArrayList<>();
        int totalGrades = 0;
        int lowestGrade = Integer.MAX_VALUE;
        int highestGrade = Integer.MIN_VALUE;

        System.out.println("Enter student grades (enter -1 to finish):");

        while (true) {
            System.out.print("Enter grade (or -1 to finish): ");
            int grade = scanner.nextInt();

            if (grade == -1) {
                break;
            }

            grades.add(grade);
            totalGrades += grade;
            lowestGrade = Math.min(lowestGrade, grade);
            highestGrade = Math.max(highestGrade, grade);
        }

        if (grades.isEmpty()) {
            System.out.println("No grades entered.");
        } else {
            double average = (double) totalGrades / grades.size();

            System.out.println("Average Grade: " + average);
            System.out.println("Highest Grade: " + highestGrade);
            System.out.println("Lowest Grade: " + lowestGrade);
        }
    }
}
