package BasicPrograms;

import java.util.Locale;
import java.util.Scanner;

public class VowelOrNot {

    public static void main(String[] args) {
        System.out.println("Enter a Char to Check vowel or not");

        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        c.toLowerCase(Locale.ROOT);

        switch (c) {

            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Is a Vowel");
                break;
            default:
                System.out.println("Not a vowel");
        }


    }
}
