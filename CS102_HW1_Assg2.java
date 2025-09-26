import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CS102_HW1_Assg2 {
    public static void main(String[] args) 
    {
        int option;
        boolean done = false;
        Scanner in = new Scanner(System.in);
        int arraySize = 0;
        
        // Getting user input to determine array size
        System.out.print("Please enter an integer to determine the array size: ");
        try 
        {
            arraySize = in.nextInt();   
        } 
        catch (Exception e) 
        {
            System.out.println("Invalid input. Please enter an integer.");
        }
        
        // Creating the array and filling it
        int[] arr = new int[arraySize];
        fillArray(arr);
        
        // Printing the array
        System.out.println(Arrays.toString(arr));

        // 0 for exitting
        while( !done )
        {
            System.out.println("-------MENU OPTIONS-------\n" +
                            "1 - find the maximum of the array \n" +
                            "2 - find the minimum of the array \n" +
                            "3 - find the average of the array and the difference of each element \n" +
                            "4 - finding the sum of the elements in odd and even indexes \n" +
                            "0 - exit \n"
            );

            option = in.nextInt();
            //exiting
            if (option == 0)
            {
                System.out.println("Successfully exitted.");
                done = true;
            }

            // finding the maximum of the array
            else if (option == 1 )
            {
                int maximum;
                maximum = maximum(arr);
                if ( maximum != -1){
                    System.out.println("The maximum element of the array is: " + maximum);
                }
                else {
                    System.out.println("Array is empty, can't determine maximum.");
                }

            }

            // finding the minimum of the array
            else if (option == 2 )
            {
                int minimum;
                minimum = minimum(arr);
                if ( minimum != -1){
                    System.out.println("The minimum element of the array is: " + minimum);
                }
                else {
                    System.out.println("Array is empty, can't determine minimum.");
                }
            }

            // finding the average of the array and the difference of each element
            else if (option == 3 )
            {
                double[] avgDifference;
                avgDifference = differencesFromAverage(arr);
                System.out.println("The difference array is : " + Arrays.toString(avgDifference));
            }

            // finding the sum of the elements in odd and even indexes
            else if (option == 4 )
            {

                int[] oddAndEvenIndexSums = oddAndEvenIndexedSumFinder(arr);
                int sumOfOdd = oddAndEvenIndexSums[0];
                int sumOfEven = oddAndEvenIndexSums[1];
                System.out.println("Sum of odd indexes: " + sumOfOdd);
                System.out.println("Sum of even indexes: " + sumOfEven);
            }

            else 
            {
                System.out.println("Invalid Option");
            }
        }

        in.close();
    }
    
    private static int minimum(int[] arr)//Finding the minimum of the array 
    {
        if (arr.length == 0){
            return -1;
        }
        else{
            int min = arr[0];
            for (int i = 1; i < arr.length; i++) 
            {
                if (arr[i] < min) 
                {
                    min = arr[i];
                }
            }
            return min;
        }

    }

    private static int maximum(int[] arr)//Finding the maximum of the array 
    {
        if (arr.length == 0){
            return -1;
        }
        else{
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) 
            {
                if (arr[i] > max) 
                {
                    max = arr[i];
                }
            }
            return max;
        }
    }

    // Filling array with random numbers
    public static void fillArray(int[] arr) 
    {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = random.nextInt(101);
        }
    }

    // Finding the odd and even numbered numbers in the array
    public static int[] oddAndEvenIndexedSumFinder(int[] array)
    {
        int[] returnThis = new int[2] ;
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (i % 2 == 0 && array.length > 1)
            {
                evenSum += array[i];
                returnThis[1] = evenSum;
            }
            else
            {
                oddSum += array[i];
                returnThis[0] = oddSum;
            }
        }
        return returnThis;
    }


    //Displaying the difference of the elements in an array
   public static double[] differencesFromAverage(int[] arr) 
   {
    //finding the avg, the default value set as 0
    double avg = 0;
    double [] avgDifference = new double[arr.length];
    for (int num : arr) 
    {
        avg += num;
    }
    avg = avg / arr.length;

    for (int i = 0; i < arr.length; i++) 
    {
        avgDifference[i] = arr[i] - avg; 
    }
    return avgDifference;
    }
}
