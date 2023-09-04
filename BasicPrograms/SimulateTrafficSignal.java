package BasicPrograms;

import java.util.Scanner;

public class SimulateTrafficSignal {
    public static void main(String[] args) {
        // Simulate a traffic light with three possible states: "Red," "Yellow," and "Green.
        // "Write a program that takes an integer representing the current
        // state of the traffic light and prints the next state.
        // Use a switch statement to cycle through the states.

        // 1 -> Red -> Yellow
        // 2 -> Yellow -> Green
        // 3 -> Green -> Red

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the state from 1-3 in which you are in");

        int state = scanner.nextInt();

        switch (state){

            case 1 :
                System.out.println("Next Signal will be Yellow");
                break;
            case 2:
                System.out.println("Next Signal will be Green");
                break;
            case 3:
                System.out.println("Next Signal will be Red");
                break;

            default:
                System.out.println("invalid signal state");

        }
        System.out.println();
    }
}
