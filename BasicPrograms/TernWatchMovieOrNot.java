package BasicPrograms;

import java.util.Scanner;

public class TernWatchMovieOrNot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age to watch movie");
        int age = sc.nextInt();
        String CanIwatchMovie =  age >18 ? "yes can watch move" : "No cannot watch";

        System.out.println(CanIwatchMovie);



    }
}
