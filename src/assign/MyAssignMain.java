package assign;

import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;


public class MyAssignMain {
    public static void main(String[] args) {
        System.out.println("Assign cp2406");
        // googled read csv in java
        // found opencsv - lib
        // searched for opencsv jar
        Reader reader = null;
        try {
            reader = new FileReader(
                    "./src/assign/MountSheridanStationCNS.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        CSVReader csv = new CSVReader(reader);
//        CSVReader csv = new CSVReaderHeaderAware(reader);
        List<String[]> data = null;
        try {
            data = csv.readAll();

            System.out.println("data.size =" + data.size());
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] next = null;
        String[] header = data.remove(0);
        System.out.println("header" + header[0]);
        System.out.println(Arrays.toString(header));

        int MONTH_IDX = 3;
        int RAIN_IDX = 5;

//      [Product code,
//      Bureau of Meteorology station number,
//      Year,
//      Month,
//      Day,
//      Rainfall amount (millimetres),
//      Period over which rainfall was measured (days),
//      Quality]

//      b. Calculate monthly rainfall totals along with
//      minimum daily and maximum daily rainfall during
//      each month, across the 10+ years’ worth of data

        Hashtable<String, Double> monthStats = new Hashtable<>();

        for (Iterator iterator = data.iterator(); iterator.hasNext(); ) {
            next =  (String[])iterator.next();
            String rainStr = next[RAIN_IDX];
            String monthStr = next[MONTH_IDX];
            System.out.println(Arrays.toString(next));
            System.out.println("month = " + monthStr);
            System.out.println("rain = " + rainStr);
            double rain = 0;
            try {
                rain = Double.parseDouble(rainStr);
            } catch (Exception e) {
            }
            System.out.println("rain = " + rain);
            if (monthStats.containsKey((monthStr))) {
                double currTotal = monthStats.get(monthStr);
                monthStats.put(monthStr, currTotal + rain);
            } else {
                monthStats.put(monthStr, rain);
            }
        }
        System.out.println(monthStats.toString());

        }
        }

// Up to 26:20 Collabrative Prac 21
//        try {
//            Map<String, String> values = new CSVReaderHeaderAware(
//                    new FileReader("MountSheridanStationCNS.csv")).readMap();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

