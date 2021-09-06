package cp2406;

/*
Which integer between 1 and 10000 has the largest number of divisors, and how many divisors does it have?
Write a program to find the answers and print out the results.
It is possible that several integers in this range have the same, maximum number of divisors.
Your program only has to print out one of them.
An example in Subsection 3.4.2 discussed divisors. The source code for that example is CountDivisors.java.

You might need some hints about how to find a maximum value.
The basic idea is to go through all the integers, keeping track of the largest number of divisors
that you've seen so far. Also, keep track of the integer that had that number of divisors.
 */

public class Ch3p2b {

    public static void main(String[] args) {
        getDivisors(100);
        int m = 10000;
        int maxCount = 0;
        for (int i = 1; i < m; i++) {
           int count = getDivisors(i);
           if (count > maxCount) {
               maxCount = count;
               System.out.println("number " + i + " has maxCount = " +maxCount);
           }
        }
    }

      public static int getDivisors(int n) {

        int testDivisor;  // A number between 1 and n that is a
        // possible divisor of n.
        int divisorCount;  // Number of divisors of n that have been found.
        int numberTested;  // Used to count how many possible divisors
        // of n have been tested.  When the number
        // reaches 10000000, a period is output and
        // the value of numberTested is reset to zero.

        /* Get a positive integer from the user. */

    /* while (true) {
            System.out.print("Enter a positive integer: ");
            n = TextIO.getlnInt();
            if (n > 0)
                break;
            System.out.println("That number is not positive.  Please try again.");
        } */

        /* Count the divisors, printing a "." after every 10000000 tests. */

        divisorCount = 0;
        numberTested = 0;

        for (testDivisor = 1; testDivisor <= n; testDivisor++) {
            if (n % testDivisor == 0)
                divisorCount++;
            numberTested++;
            if (numberTested == 10000000) {
                System.out.print('.');
                numberTested = 0;
            }
        }

//        System.out.println();
//        System.out.println("The number of divisors of " + n
//                + " is " + divisorCount);
        return divisorCount;

    } // end main()
             

}