package ch7;

import java.util.ArrayList;
import java.util.Iterator;

public class Ch7p1 {
    public static void main(String[] args) {
        System.out.println("ex7.1");
//        ArrayList<Integer> arr = new ArrayList<>();
        int testSize = 100;
        int testMaxVal = 20;
        ArrayList<Integer> arr = makeIntArray(testSize, testMaxVal);
        System.out.println("arr.size()" + arr.size());
        if (arr.size() == testSize) {
            System.out.println("testSize PASSED");
        } else {
            System.out.println("testSize FAILED");
            return;
        }

        // itco TAB
        int myMax = -Integer.MAX_VALUE;
        for (Iterator<Integer> iterator = arr.iterator(); iterator.hasNext(); ) {
            Integer next =  iterator.next();
            int v = next;
            if (v > myMax) {
                myMax = v;
            }
        }

        if (myMax <= testMaxVal) {
            System.out.println("testMaxVal PASSED");
        } else {
            System.out.println("testMaxVal FAILED");
            return;
        }
    }
    public static ArrayList<Integer> makeIntArray(int arrSize, int maxVal) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < arrSize; i++) {
            int v = (int)(Math.random() * maxVal) + 1;
            System.out.println("" + v);
            arr.add(v);
        }
        return arr;
    }
}
