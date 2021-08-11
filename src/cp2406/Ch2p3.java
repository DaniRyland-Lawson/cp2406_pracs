package cp2406;
import java.util.Scanner;

public class Ch2p3 {

    /*Write a program that asks the user's name, and then greets the user by name.
       Before outputting the user's name, convert it to upper case letters.
       For example, if the user's name is Fred, then the program should respond "Hello, FRED, nice to meet you!".
        */

    public static void main(String[] args) {
        Scanner stdin = new Scanner( System.in );

        String usersName;      // The user's name, as entered by the user.
        String upperCaseName;  // The user's name, converted to upper case letters.

        System.out.print("Please enter your name: ");
        usersName = stdin.nextLine();

        upperCaseName = usersName.toUpperCase();

        System.out.println("Hello, " + upperCaseName + ", nice to meet you!");

    }  // end main()

}  // end class

