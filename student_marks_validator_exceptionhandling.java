/*
Create a program that:

Takes marks of a student
Rules:
If marks < 0 OR marks > 100 → throw custom exception InvalidMarksException
Requirements:
Use throw inside method
Use throws in method signature
Output:
Valid Marks OR InvalidMarksException handled
*/
import java.util.Scanner;
class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

public class student_marks_validator_exceptionhandling {

 
    public static void validateMarks(int marks) throws InvalidMarksException {

        // Using throw
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException(
                    "Marks should be between 0 and 100.");
        }

        System.out.println("Valid Marks: " + marks);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();

            validateMarks(marks);

        } catch (InvalidMarksException e) {
            System.out.println("InvalidMarksException: " + e.getMessage());
        }

        sc.close();
    }
}