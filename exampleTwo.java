// User Input
import java.util.Scanner;

public class exampleTwo {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //Asking for user input
        System.out.println("Enter your name");

        String name = sc.nextLine();

        // Asking for user name
        System.out.println("How old are you");

        int age = sc.nextInt();
        sc.nextLine();

        // Asking for favourite color
        System.out.println("What is your favourite color");

        String color = sc.nextLine();

        // Asking for favourite food
        System.out.println("What is your favourite food?");

        String food = sc.nextLine();

        sc.close();

        // Print Outs
        System.out.println("Your name is: " + name);
        System.out.println("You are " + age + " years old.");
        System.out.println("Your favourite color is " + color);
        System.out.println("And your favourite food is " + food);

    }  

}
