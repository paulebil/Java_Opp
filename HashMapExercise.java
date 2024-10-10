import java.util.HashMap;

public class HashMapExercise {
        public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> userMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        userMap.put(1, "Paul");
        userMap.put(2, "Bob");
        userMap.put(3, "Deo");

        // Access and display key-value pairs
        System.out.println("HashMap elements:");
        for (Integer key : userMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + userMap.get(key));
        }
    }
}
