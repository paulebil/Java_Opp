import java.util.HashSet;

public class HashSetExercise {
       public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> uniqueNames = new HashSet<>();

        // Add elements to the HashSet
        uniqueNames.add("Paul");
        uniqueNames.add("Bob");
        uniqueNames.add("Deo");
        uniqueNames.add("Bob"); // Attempting to add the same element again

        // Display HashSet (duplicates won't be added)
        System.out.println("HashSet elements (unique):");
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }   
}
