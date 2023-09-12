package BasicPrograms;

import java.util.Scanner;

public class PalindromeStringChecker {
    public static void main(String[] args) {

        Scanner a =  new Scanner(System.in);
        System.out.println("Enter the input String to check");
        String x , y = "";
        x =  a.nextLine();
        int l = x.length();

        for (int k= l- 1 ; k>=0; k--){

                y= y+ x.charAt(k);
        }
        if (x.equalsIgnoreCase(y)){
            System.out.println("String is Palindrome");
        }
        else {
            System.out.println("String is not palindrome");
        }



    }
}
