package BeachPractics;

import java.util.Arrays;

public class RemoveDuplicates {

    // Method to remove duplicates from an array
    public static int[] removeDuplicates(int[] arr) {
        // Create a new array to store unique elements
        int n = arr.length;
        int[] temp = new int[n];

        // Variable to keep track of the size of the unique elements
        int j = 0;

        // Loop through the original array
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // Check if the current element is already in the temp array
            for (int k = 0; k < j; k++) {
                if (arr[i] == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If the element is not a duplicate, add it to temp
            if (!isDuplicate) {
                temp[j] = arr[i];
                j++;
            }
        }

        // Create a new array with the exact size of unique elements
        int[] result = Arrays.copyOf(temp, j);

        return result;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 3, 5, 6, 1, 7};

        // Removing duplicates
        int[] uniqueArray = removeDuplicates(arr);

        // Printing the result
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }
}