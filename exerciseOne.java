import java.util.Scanner;

public class exerciseOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks here:");
        int marks = sc.nextInt();
        sc.nextLine();
        sc.close();

        marks = marks / 10;

        System.out.println(marks);
        

        switch (marks) {
            //case 10:
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B");
                break;
            case 7:
                System.out.println("Grade: C");
                break;
                
            case 6:
                System.out.println("Grade: D");
                break;
            case 5:
                System.out.println("Grade: E");
                break;        
            default:
                System.out.println("Grade: F");
                break;
        }
    }
}
