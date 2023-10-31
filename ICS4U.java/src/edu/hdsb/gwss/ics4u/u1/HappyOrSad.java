/*
 * Name: Calvin Ip
 * Date: Febuary 9, 2021
 * Version: 1.0
 * Description: This program will read happy and sad emojis and print "happy" or "sad"
 *                   
 */
package edu.hdsb.gwss.ics4u.u1;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Calvin
 */
public class HappyOrSad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        String sentence;

        //Splash Screen
        displaySplashScreen();

        //User Input
        sentence = getUserInput();

        //Proccessing and Output
        isHappyOrSad(sentence);
    }

    public static void displaySplashScreen() {
        System.out.println("Happy or Sad");
        System.out.println("This program will read the amount of \":-)\" or \":-(\"");
        System.out.println("and count the amount. Then display happy or sad");
    }

    public static String getUserInput() {
        Scanner input = new Scanner(System.in);
        String str;

        System.out.println("Please enter a sentence: ");
        return str = input.nextLine();
    }

    public static void isHappyOrSad(String sentence) {
        StringTokenizer st = new StringTokenizer(sentence, ":-");
        String tempString;
        int happyCounter = 0, sadCounter = 0;

        //First if statment checks if it has no instance of :-) or :-(
        if (sentence.contains(":-)") == false && sentence.contains(":-(") == false) {
            System.out.println("none");
            
        } else {
            
            //Checks # of Happy and Sad and adds to Counter
            while (st.hasMoreTokens()) {
                tempString = st.nextToken();

                if (tempString.charAt(0) == ')') {
                    happyCounter++;
                } else if (tempString.charAt(0) == '(') {
                    sadCounter++;
                }
                
            } //End of While

            //Print Happy or Sad (Output)
            if (happyCounter > sadCounter) {
                System.out.println("happy");
            } else if (happyCounter < sadCounter) {
                System.out.println("sad");
            } else {
                System.out.println("unsure");
            }

        } //End of Else

    } //End of isHappyOrSad Method
}
