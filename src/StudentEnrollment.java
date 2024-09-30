import java.util.Scanner;

public class StudentEnrollment {

    // Create a variable that you want to keep constant to ensure consistency and readability
    public static final int max_subjects = 10;
    public static final int fee_per_unit = 1000;

public static void main (String [] args) {

    // Create an object of Scanner class to get an input from the user
    Scanner scanner = new Scanner (System.in);

    // To print the required output
    System.out.println("Enter Student Name: ");
    String studentName = scanner.nextLine(); // To return a string that contains all of the characters up to the next new line

    System.out.println("Enter Course: ");
    String course = scanner.nextLine(); // To return a string that contains all of the characters up to the next new line

    System.out.println("Enter Course Code: ");
    String courseCode = scanner.nextLine(); // To return a string that contains all of the characters up to the next new line

    int totalUnits = 0;
    // Execute a block of statements continuously until the given condition is true using Do-While Loop
    do {
        System.out.println("Enter Number of Units (Maximum number of subjects is 10): ");
        totalUnits = scanner.nextInt();

        if (totalUnits > max_subjects) {
            System.out.println("Error: The number of units cannot execeed" + max_subjects);
        }
    } while (totalUnits > max_subjects);

    int totalFee = totalUnits * fee_per_unit;

    System.out.println("Student's Name: " + studentName);
    System.out.println("Total Enrollment Fee: PHP " + totalFee);

    System.out.println("Enter Payment Amount: PHP ");
    int payment = scanner.nextInt();

    // Specifying a new condition if the first condition is false using Else If statement
    if (payment == totalFee) {
        System.out.println("Fully Paid");
    } else if (payment < totalFee) {
        System.out.println("Partial Payment = PHP " + payment);
    } else
        System.out.println("Invalid Payment");

    // This closes the file or input stream that the scanner was reading
    scanner.close();
}
}