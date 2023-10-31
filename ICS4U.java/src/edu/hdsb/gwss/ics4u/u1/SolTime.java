/*
 * Name: Calvin Ip
 * Date: Febuary 15, 2021
 * Version: 1.1
 * Description: This program will convert Earth Time to Sol Time (Mars Time)
 *                   
 */
package edu.hdsb.gwss.ics4u.u1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Calvin
 */
public class SolTime {

    /**
     * @param args the command line arguments
     */
    static final String FS = File.separator;

    public static void main(String[] args) throws FileNotFoundException {
        // Objects
        File dataInput = new File("." + FS + "data" + FS + "u1" + FS + "solTimeInput.txt");
        Scanner input = new Scanner(dataInput);

        //Variables
        int eDay, eHour, eMinute;
        double eSeconds;

        //Splash Screen
        displaySplashPage();
        
        //Processing
        while (input.hasNextLine()) {
            //Object
            StringTokenizer st = new StringTokenizer(input.nextLine());

            while (st.hasMoreTokens()) {
                //Stores Earth Days, Minutes, and Minutes
                eDay = Integer.parseInt(st.nextToken());
                eHour = Integer.parseInt(st.nextToken());
                eMinute = Integer.parseInt(st.nextToken());

                //Checks Invalid Numbers, If good, proceed
                if ((eDay <= 0 || eDay > 1000) || (eHour < 0 || eHour > 23) || (eMinute < 0 || eMinute > 59)) {
                    System.out.println("INVALID");
                } else {
                    eSeconds = convertToSeconds(eDay, eHour, eMinute);

                    //Convert to Sol Time
                    convertToSolTime(eSeconds);
                }

            } //End of Token Loop

        } //End of File Loop

    } //End of Main

    public static void displaySplashPage() {
        System.out.println("SOL TIME");
        System.out.println("This program will convert Earth Time to Sol Time (Mars Time)");
        System.out.println("");
    }

    public static double convertToSeconds(int eDay, int eHour, int eMinute) {
        //Variable
        double seconds;

        //Change into Seconds
        seconds = ((eDay - 1) * 86400) + (eHour * 3600) + (eMinute * 60);

        return seconds;
    }

    public static void convertToSolTime(double seconds) {
        //88,642.663 Earth seconds per martian Day (Sol)

        //Variables
        final double SECONDS_PER_SOL = 88642.663;
        final double solToSecondsRatio = 86400 / SECONDS_PER_SOL;
        double sDay, sHour, sMinute, solSeconds;
        int solDay, solHour, solMinute;
        String strDay, strHour, strMinute;

        //Processing (Double Math)
        solSeconds = seconds * solToSecondsRatio;
        sDay = solSeconds / 86400;
        sHour = (sDay % 1) * 24;
        sMinute = (sHour % 1) * 60;

        //Convert Double to Int
        solDay = (int) (sDay + 1);
        solHour = (int) sHour;
        solMinute = (int) sMinute;

        //Convert Int to String
        strDay = "" + solDay;
        strHour = "" + solHour;
        strMinute = "" + solMinute;

        //Adds a leading 0 if single digit
        if (strHour.length() == 1) {
            strHour = "0" + strHour;
        }

        if (strMinute.length() == 1) {
            strMinute = "0" + strMinute;
        }

        //Output
        System.out.println("Day " + solDay + ", " + strHour + ":" + strMinute);

    }

} //End of Class
