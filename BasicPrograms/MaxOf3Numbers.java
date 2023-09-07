package BasicPrograms;

import java.util.Scanner;

public class MaxOf3Numbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        int MaxOf3Number = (a > b) ? (a > b ? a : b) : (a > c ? a : c);

        System.out.println("LargestNumber is" + MaxOf3Number);
    }


}

