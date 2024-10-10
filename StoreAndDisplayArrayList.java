import java.util.ArrayList;

public class StoreAndDisplayArrayList {
    public static void main(String[] args) {
        // Creating an ArrayList to store numbers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Displaying the elements
        System.out.println("Displaying the ArrayList elements:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
