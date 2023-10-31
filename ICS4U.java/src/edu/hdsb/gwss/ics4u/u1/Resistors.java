/*
 * Name: Calvin Ip
 * Date: Febuary 16, 2021
 * Version: 0.1
 * Description: This program will take three colours, separated by hyphens, and prints the value of the resistor.
 *                   
 */
package edu.hdsb.gwss.ics4u.u1;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Calvin
 */
public class Resistors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variable
        String input, colourOne, colourTwo, colourThree, str1 = "", str2;
        int numberValue, multiplier = 0, int1 = 0, int2 = 0;
        String[] resistorColour = {"BLACK", "BROWN", "RED", "ORANGE", "YELLOW", "GREEN", "BLUE", "VIOLET", "GREY", "WHITE"};

        //Splash Screen
        displaySplashScreen();

        //User Input
        input = getUserInput();

        //
        StringTokenizer st = new StringTokenizer(input, "-");
        colourOne = st.nextToken().toUpperCase();
        colourTwo = st.nextToken().toUpperCase();
        colourThree = st.nextToken().toUpperCase();

        //Stores number value into ints
        for (int i = 0; i < resistorColour.length; i++) {
            if (colourOne.equals(resistorColour[i])) {
                int1 = i;
            }
            if (colourTwo.equals(resistorColour[i])) {
                int2 = i;
            }
            if (colourThree.equals(resistorColour[i])) {
                multiplier = i;
            }
        }//End For loop

        str1 = "" + int1 + int2;
        numberValue = Integer.parseInt(str1);

        //Calculation
        doCalculation(numberValue, multiplier);

    }

    public static void displaySplashScreen() {
        System.out.println("Resistors");
        System.out.println("This program will take three colours, separated by hyphens, and prints the value of the resistor.");
    }

    public static String getUserInput() {
        //Variables
        Scanner input = new Scanner(System.in);
        String resistorColour;

        System.out.println("Enter a Resistor Colour:");
        resistorColour = input.nextLine();
        return resistorColour;

    }

    public static void doCalculation(int numberValue, int multiplier) {
        long ohms = numberValue * (int) Math.pow(10, multiplier);

        System.out.println("The Value of the Resisistor is " + ohms + "Ω");

    }

}
