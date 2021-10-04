package ch7;

import java.util.Arrays;

public class ch7p3 {
    public static void mainOLD(String[] args) {
        int n = 100_000;
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Math.random();
//            System.out.println("" + arr[i]);
        }
        myRunTime(arr);
        
    }
    public static void main(String[] args) {
        int n = 10_000;
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            int myLen = (int)(Math.random()*100) + 1;
            arr[i] = makeRandomString(myLen);

//            System.out.println("" + arr[i]);
        }
        myRunTimeString(arr);

    }

    private static String makeRandomString(int myLen) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < myLen; i++) {
            char c = (char)(int)(Math.random() * 255);
            builder.append(c);
        }
        String res = builder.toString();
        System.out.println("" + res);
        return res;
    }

    public static void myRunTimeString(String[] arr) {
        long start = System.nanoTime();
        // do something
//        Arrays.sort(arr);
        selectionSortString(arr);
        long endTime = System.nanoTime();
        double seconds = (endTime - start)/1_000_000_000.0;
        System.out.println("seconds = " + seconds);
    }

    public static void myRunTime(double[] arr) {
        long start = System.nanoTime();
        // do something
        Arrays.sort(arr);
//        selectionSort(arr);
        long endTime = System.nanoTime();
        double seconds = (endTime - start)/1_000_000_000.0;
        System.out.println("seconds = " + seconds);
    }

    static void selectionSort(double[] A) {
        // Sort A into increasing order, using selection sort

        for (int lastPlace = A.length-1; lastPlace > 0; lastPlace--) {
            // Find the largest item among A[0], A[1], ...,
            // A[lastPlace], and move it into position lastPlace
            // by swapping it with the number that is currently
            // in position lastPlace.
            int maxLoc = 0;  // Location of largest item seen so far.
            for (int j = 1; j <= lastPlace; j++) {
                if (A[j] > A[maxLoc]) {
                    // Since A[j] is bigger than the maximum we've seen
                    // so far, j is the new location of the maximum value
                    // we've seen so far.
                    maxLoc = j;
                }
            }
            double temp = A[maxLoc];  // Swap largest item with A[lastPlace].
            A[maxLoc] = A[lastPlace];
            A[lastPlace] = temp;

        }  // end of for loop

    }
    static void selectionSortString(String[] A) {
        // Sort A into increasing order, using selection sort
        for (int lastPlace = A.length-1; lastPlace > 0; lastPlace--) {
            // Find the largest item among A[0], A[1], ...,
            // A[lastPlace], and move it into position lastPlace
            // by swapping it with the number that is currently
            // in position lastPlace.
            int maxLoc = 0;  // Location of largest item seen so far.
            for (int j = 1; j <= lastPlace; j++) {
                if (A[j].compareTo(A[maxLoc]) > 0) {
                    maxLoc = j;
                }
            }
            String temp = A[maxLoc];  // Swap largest item with A[lastPlace].
            A[maxLoc] = A[lastPlace];
            A[lastPlace] = temp;

        }  // end of for loop

    }
    
}
