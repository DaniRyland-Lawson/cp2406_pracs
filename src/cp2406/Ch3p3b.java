package cp2406;
import java.util.Scanner;

/*
Write a program that will evaluate simple expressions such as 17 + 3 and 3.14159 * 4.7.
The expressions are to be typed in by the user. The input always consists of a number, followed by an operator,
followed by another number. The operators that are allowed are +, -, *, and /.
You can read the numbers with TextIO.getDouble() and the operator with TextIO.getChar().
Your program should read an expression, print its value, read another expression, print its value, and so on.
The program should end when the user enters 0 as the first number on the line. */


public class Ch3p3b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Calculate your numbers (number operator number): ");

        double d1 = scanner.nextDouble();
        System.out.println("d1 = " + d1);

        String op = scanner.next();
        System.out.println("op = " + op);
        double d2 = scanner.nextDouble();

        System.out.println("d12 = " + d2);

            }

}
