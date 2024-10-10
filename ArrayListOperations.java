import java.util.ArrayList;

public class ArrayListOperations {
   public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> names = new ArrayList<>();

        // Adding elements to the ArrayList
        names.add("Paul");
        names.add("Bob");
        names.add("Deo");

        // Accessing elements in the ArrayList
        System.out.println("Accessing elements:");
        for (String name : names) {
            System.out.println(name);
        }

        // Removing an element from the ArrayList
        names.remove("Bob");

        // Display updated ArrayList
        System.out.println("\nUpdated ArrayList after removal:");
        for (String name : names) {
            System.out.println(name);
        }
    } 
}
