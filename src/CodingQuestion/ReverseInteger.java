package CodingQuestion;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input integer from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Reverse the integer
        int reversed = reverseInteger(number);
        System.out.println("Reversed Integer: " + reversed);
    }

    public static int reverseInteger(int number) {
        int reversed = 0;

        // Reverse the digits of the number
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;  // Remove the last digit from the original number
        }
        return reversed;
    }
}
