package BeachPractics;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesWithHashMap {

    // Method to remove duplicates using a HashMap
    public static int[] removeDuplicates(int[] arr) {
        // Create a HashMap to store unique elements
        Map<Integer, Boolean> map = new HashMap<>();

        // Loop through the array and add elements to the HashMap
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], true);  // Value doesn't matter, only keys are important
        }

        // Convert the keys of the HashMap to an array
        int[] result = new int[map.size()];
        int index = 0;
        for (Integer key : map.keySet()) {
            result[index++] = key;
        }

        return result;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 3, 5, 6, 1, 7};

        // Removing duplicates
        int[] uniqueArray = removeDuplicates(arr);

        // Printing the result
        System.out.println("Array after removing duplicates: ");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
        Map<Days, Integer> map1 = new EnumMap<>(Days.class);
        map1.put(Days.MONDAY, 1);
        map1.put(Days.TUESDAY, 2);
        String s= String.valueOf(map1.get(Days.MONDAY));
        System.out.println(s);

    }


}
enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}