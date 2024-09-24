// Write a Java program that ask for a password and allows the user 3
// attempts to input the correct password using while loop.

import java.util.Scanner;

public class exerciseFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "paul"; 
        String userInput;
        int attempts = 0;
        int maxAttempts = 3;

        while (attempts < maxAttempts) {
            System.out.print("Enter your password: ");
            userInput = scanner.nextLine();
            
            if (userInput.equals(correctPassword)) {
                System.out.println("Password accepted!");
                break;  
            } else {
                attempts++;
                System.out.println("Incorrect password. You have " + (maxAttempts - attempts) + " attempts left.");
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Maximum attempts reached. Access denied.");
        }

        scanner.close();
    }
}
