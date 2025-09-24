import java.util.Scanner;
import java.util.Random;

public class CS102_HW1_Assg2 {
    public static void main(String[] args) {
        int arraySize = 0;
        Scanner in = new Scanner(System.in);
        
        // Getting user input to determine array size
        System.out.print("Please enter an integer to determine the array size: ");
        try {
            arraySize = in.nextInt();   
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
        
        int[] arr = new int[arraySize];
        fillArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
    // Filling array with random numbers
    public static void fillArray(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101);
        }
    }
}
