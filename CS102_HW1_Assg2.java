import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class CS102_HW1_Assg2 {
    public static void main(String[] args) {
        int option;
        boolean done = false;
        Scanner in = new Scanner(System.in);
        int arraySize = 0;
        
        // Getting user input to determine array size
        System.out.print("Please enter an integer to determine the array size: ");
        try {
            arraySize = in.nextInt();   
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
        
        // Creating the array and filling it
        int[] arr = new int[arraySize];
        fillArray(arr);
        
        // Printing the array
        System.out.println(Arrays.toString(arr));


        System.out.println("-------MENU OPTIONS-------\n" +;
                            "1 - find the maximum of the array \n" +
                            "2 - find the minimum of the array \n" +
                            "3 - find the average of the array and the difference of each element \n" +
                            "4 - finding the sum of the elements in odd and even indexes \n" +
                            "0 - exit \n" +

        )


        // 0 for exitting
        while( !done ){
            option = in.nextInt();
            //exiting
            if (option == 0){
                System.out.println("Successfully exitted.");
                done = true;
            }

            // finding the maximum of the array
            else if (option == 1 ){
                int maximum;
                maximum = maximum(arr[]);
                System.out.println("The maximum element of the array is: " + maximum);
            }

            // finding the minimum of the array
            else if (option == 2 ){
                int minimum;
                minimum = minimum(arr[]);
                System.out.println("The minimum element of the array is: " + minimum);
            }

            // finding the average of the array and the difference of each element
            else if (option == 3 ){
                int[] differencesFromAverage;
                differencesFromAverage = difference(arr[]);
                System.out.println("The difference array is : " + Arrays.toString(differencesFromAverage[]));
            }

            // finding the sum of the elements in odd and even indexes
            else if (option == 4 ){
                int sumOfOdd = sumOfOdd(arr[]);
                int sumOfEven = sumOfEven(arr[]);
                System.out.println("Sum of odd indexes: " + sumOfOdd);
                System.out.println("Sum of even indexes: " + sumOfEven);
            }

            else {
                System.out.println("Invalid Option");
            }
        }

        in.close();
    }
    
    // Filling array with random numbers
    public static void fillArray(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101);
        }
    }



}
