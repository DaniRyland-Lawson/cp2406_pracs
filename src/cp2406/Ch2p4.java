package cp2406;

import java.util.Scanner;

public class Ch2p4 {

    public static void main(String[] args) {
        /*
    Write a program that helps the user count his change.
    The program should ask how many quarters the user has, then how many dimes, then how many nickels, then how many pennies.
    Then the program should tell the user how much money he has, expressed in dollars.
     */

        Scanner scanner = new Scanner(System.in);

        //  prompt for how many quarters
        System.out.print("How many quarters: ");
        int numQuarters = scanner.nextInt();
        System.out.println("inputted " + numQuarters);
        scanner.nextLine();

        System.out.print("How many dimes: ");
        int numDimes = scanner.nextInt();
        System.out.println("inputted " + numDimes);
        scanner.nextLine();

        System.out.print("How many nickels: ");
        int numNickels = scanner.nextInt();
        System.out.println("inputted " + numNickels);
        scanner.nextLine();

        System.out.print("How many pennies: ");
        int numPennies = scanner.nextInt();
        System.out.println("inputted " + numPennies);
        scanner.nextLine();

        int sum = 25 * numQuarters + 10 * numDimes + 5 * numNickels + numPennies;
        System.out.println("sum "+ sum);

        System.out.println("sum $"+ sum/100.);
    }
}
