
//Question 1: Write a java program that checks if a number is positive,
//negativa, or zero using  if-elseif-else statement
import java.util.Scanner;
public class exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number here");
        int number = sc.nextInt();
        sc.nextLine();
        sc.close();

        if (number > 0){
            System.out.println("Number is positve.");
        }else if (number == 0){
            System.out.println("Number is Zero.");
        }
        else{
            System.out.println("Number is negative.");
        }
        
    }
}
