public class ArrayExample {
    public static void main(String[] args){
        // Accessing items inside arrays through a for loop

        int[] numbers = {10, 20, 30, 40, 50};

        for (int i=0; i < numbers.length; i++){
            System.out.println("Index of Number: "+ i + " And Number: "+ numbers[i]);
        }
       
    }
}
