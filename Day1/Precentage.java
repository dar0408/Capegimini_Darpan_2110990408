import java.util.Scanner;

public class Precentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        String[] subjects = new String[3];
        String[] students = new String[3];
        int[][] marks = new int[3][3];
        int[] totalMarks = new int[3];
        int[] percentages = new int[3];

        System.out.println("Enter the names of the subjects:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjects[i] = sc.next();
        }

        System.out.println("Enter the names of the students:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            students[i] = sc.next();
        }

        System.out.println("Enter the marks for each student:");
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            System.out.println("Marks for " + students[i] + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("  " + subjects[j] + " (out of 100): ");
                marks[i][j] = sc.nextInt();
                sum += marks[i][j];
            }
            totalMarks[i] = sum;
            percentages[i] = (sum * 100) / 300;
        }

        System.out.println();
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println("Name: " + students[i]);
            System.out.println("Subject-wise Marks:");
            for (int j = 0; j < 3; j++) {
                System.out.println("  " + subjects[j] + ": " + marks[i][j]);
            }
            System.out.println("Total Marks: " + totalMarks[i]);
            System.out.println("Percentage: " + percentages[i] + "%\n");
        }
    }
}
