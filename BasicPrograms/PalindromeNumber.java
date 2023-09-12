package BasicPrograms;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int EnteredNumber = number;

        int reverse = 0;

        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println(" Reverse number is " + reverse);

        if (EnteredNumber == reverse) {
            System.out.println("number Entered is Palindrome");

        } else {
            System.out.println("Not a palindrome number");
        }
    }

}
