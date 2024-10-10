import java.util.Scanner;

public class DivisionByZeroExercise {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Take numerator input from user
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            // Take denominator input from user
            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            // Attempt division
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero error
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            // Handle any other input errors (e.g., non-integer input)
            System.out.println("Error: Invalid input. Please enter valid integers.");
        } finally {
            // This block will always be executed
            System.out.println("Execution completed.");
            System.out.println("This a program that handles a division by zero error.");
            System.out.println("Try making the denominator [0]");
            scanner.close(); 
        }
    }
}
