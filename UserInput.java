import java.util.Scanner;

public class UserInput {
    public static void main(String [] args){
    
        Scanner scanner = new Scanner(System.in);

        //Ask for user's name
        System.out.println("Enter you're name");
        String name = scanner.nextLine();

        //Ask for user's age
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        scanner.nextLine();

        scanner.close();

        // Print out the results
        System.out.println("Your name is:" + name);
        System.out.println("You are " + age + " years old");

    }
}
