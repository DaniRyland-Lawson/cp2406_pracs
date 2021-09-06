package cp2406;

public class Ch3p1b {
    /*
    How many times (on Average) do you have to roll a pair of dice before they come up snake eyes?
    You could do the experiment by rolling the dice by hand. Write a computer program that simulates the experiment.
     The program should report the number of rolls that it makes before the dice come up snake eyes.
     (Note: "Snake eyes" means that both dice show a value of 1.)
     Exercise 2.2 explained how to simulate rolling a pair of dice.
     */

    public static void main(String[] args) {
        rollOnce();

        int num = 100000;
        double count = 0;
        for (int i = 0; i < num; i++) {
            int[] res = rollOnce();
            if (res[0] == 1 && res[1] == 1) {
                count++;

            }
        }
        System.out.println("prob = " + count/num);
        double actual = (1./6) * (1./6);
        System.out.println("actul=" + actual );;
    }

    public static int[] rollOnce() {

        int die1;   // The number on the first die.
        int die2;   // The number on the second die.
        int roll;   // The total roll (sum of the two dice).

        die1 = (int)(Math.random()*6) + 1;
        die2 = (int)(Math.random()*6) + 1;
        roll = die1 + die2;

 //       System.out.println("The first die comes up " + die1);
//        System.out.println("The second die comes up " + die2);
//        System.out.println("Your total roll is " + roll);

        int[] ret = {die1, die2};
        return ret;

    }  // end main()

}  // end class


