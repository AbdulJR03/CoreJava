package BasicPrograms;

import java.util.Scanner;

import static javax.management.Query.value;

public class RomanToChar2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int value = 0;
        int prevvalue =0;
        int total=0;
        int i = 0;

        int l =input.length();

        for (i = l-1; i >= 0; i--) {
            char currentchar = input.charAt(i);

            if (currentchar == 'I') {
                value = 1;
            } else if (currentchar == 'V') {
                value = 5;
            } else if (currentchar == 'X') {
                value = 10;
            } else if (currentchar == 'L') {
                value = 50;
            } else if (currentchar == 'C') {
                value = 100;
            } else if (currentchar == 'D') {
                value = 500;
            } else if (currentchar == 'M') {
                value = 1000;
            }

            if(value>=prevvalue) {
                total= total + value;
            }else {
                total= total - value;

            }
            prevvalue = value;

        }

            System.out.println("The intiger number is "+ total );
        }

    }





