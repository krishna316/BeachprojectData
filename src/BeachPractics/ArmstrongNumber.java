package BeachPractics;

import java.util.Scanner;

public class ArmstrongNumber {

    public static boolean isArmstrong(int num) {
        int sum = 0;
        int temp = num;
        int length = String.valueOf(num).length();

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, length);
            temp=temp/ 10;
        }

        return sum == num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= sc.nextInt();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

    }
}
