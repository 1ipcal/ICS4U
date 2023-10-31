/*
 * Name: Calvin Ip
 * Date: Febuary 16, 2021
 * Version: 1.0
 * Description: This program will use an algorithm to find all Prime Numbers (Up to 1000)
 *                   
 */
package edu.hdsb.gwss.ics4u.u1;

/**
 *
 * @author Calvin
 */
public class Eratosthenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        boolean isPrime[] = new boolean[1000];

        //Splash Screen
        displaySplashScreen();

        //Turns all numbers to true
        for (int i = 0; i < isPrime.length; i++) {
            isPrime[i] = true;
        }

        //Processing
        doProcessing(isPrime);

        //Output
        displayOutput(isPrime);
    }

    public static void displaySplashScreen() {
        System.out.println("Eratosthenes");
        System.out.println("This program will use an algorithm to find all Prime Numbers (Up to 1000)");
    }

    public static void doProcessing(boolean isPrime[]) {
        //index 0 = 1
        for (int i = 1; i < isPrime.length; i++) {
            //Checks to see if eliminated or not
            if (isPrime[i]) {
                //Checks each multiples
                for (int n = (i+1)*2; n <= isPrime.length; n += (i+1)){
                    isPrime[n - 1] = false;
                }
                
            } // End true Check

        } // End for
    }

    public static void displayOutput(boolean isPrime[]) {
        System.out.println("The Prime Numbers from 1 - 1000 are: ");
        for (int i = 1, counter = 0; i < isPrime.length; i++) {
            if (isPrime[i] == true) {
                System.out.print((i + 1) + " ");
                counter++;
            }

            if (counter > 9) {
                counter = 0;
                System.out.println("");
            }

        }
    }

}
