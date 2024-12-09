package BeachPractics;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {10,63, 20, 25, 63, 96, 57};
        int Secondlargest = findSecondLargest(arr);
        System.out.println("Second Largest Element: " + Secondlargest);
    }

    private static int findSecondLargest(int[] arr) {
        if(arr.length < 2) {
            System.out.println("Invalid Input");
            return -1;
        }
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }
}
