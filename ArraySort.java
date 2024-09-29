import java.util.Arrays;
import java.util.Collections;

public class ArraySort {
    public static void main(String[] args) {
        // Declearing and initializing an array
        Integer [] numbers = {42, 15, 8, 23, 4};

        // Printing the original array
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Sorting the numbers
        Arrays.sort(numbers);

        // Printing the sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // Reverse Sort
        Arrays.sort(numbers, Collections.reverseOrder());

        // Printing the reverse sorted array
        System.out.println("Reverse Sorted array: " + Arrays.toString(numbers));
    }
}
