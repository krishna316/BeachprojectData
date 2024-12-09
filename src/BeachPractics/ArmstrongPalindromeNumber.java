package BeachPractics;

import java.util.Scanner;

public class ArmstrongPalindromeNumber {

    public static boolean isArmstrong(int num) {
        int temp = num;
        int sum = 0;
        int n = String.valueOf(num).length();

        while (temp != 0) {
           int digit = temp % 10;
            sum += Math.pow(digit, n);
            temp /= 10;
        }

        return sum == num;
    }

    public static boolean isPalindrome(int num) {
        int temp = num;
        int reversed = 0;

        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return reversed == num;
    }

    // Find Armstrong Palindrome numbers in the given range
    public static void findArmstrongPalindromeNumbers(int start, int end) {
        System.out.println("Armstrong Palindrome numbers in the range " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i) && isPalindrome(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();

        if(isArmstrong(num) && isPalindrome(num))
        {
            System.out.println(num + " is an Armstrong and Palindrome number.");
        }
        else if(isArmstrong(num))
        {
            System.out.println(num + " is an Armstrong number.");
        }
        else if(isPalindrome(num))
        {
            System.out.println(num + " is a Palindrome number.");
        }
        else
        {
            System.out.println(num + " is neither an Armstrong nor a Palindrome number.");
        }

        int start = 1, end = 1000;
        findArmstrongPalindromeNumbers(start, end);
    }
}
