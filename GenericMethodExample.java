public class GenericMethodExample {
     // Generic method that works with any data type
     public static <T> void displayArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    // Using the method to display intArray and StrArray

    public static void main(String[] args) {
        // Using generic method with Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Displaying Integer Array:");
        displayArray(intArray);

        // Using generic method with String array
        String[] strArray = {"Alice", "Bob", "Charlie"};
        System.out.println("\nDisplaying String Array:");
        displayArray(strArray);
    } 
}
