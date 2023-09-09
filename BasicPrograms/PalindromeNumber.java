package BasicPrograms;

import javax.swing.plaf.TableHeaderUI;
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int enterednumber = number;
        int reverse =0;

        while(number !=0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;

        }
        System.out.println("the reverse number is " + reverse);

        if (enterednumber == reverse) {
            System.out.println("Number is palindrome");
        }
        else {
            System.out.println("Not a palindrome number");
        }


    }

}
