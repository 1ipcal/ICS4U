/*
 * Name: Calvin Ip
 * Date: Febuary 12, 2021
 * Version: 1.1
 * Description: This program will Encode a sentece with Ceasar Cipher
 *                   
 */
package edu.hdsb.gwss.ics4u.u1;

import java.util.Scanner;

/**
 *
 * @author Calvin
 */
public class CaesarCipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Variables
        String sentence;
        int rotationAmount, choice = 0;

        //Splash Screen
        displaySplashScreen();

        //User Input
        sentence = getUserInput();
        rotationAmount = getUserRotation();

        //Processing
        while (choice < 1 || choice > 2) {
            System.out.println("Enter 1 to Go Left ");
            System.out.println("Enter 2 to Go Right");
            choice = input.nextInt();

            if (choice == 1) {
                rotationAmount = rotationAmount * -1;
            }

        } //End While Loop

        System.out.println(encryptDecrypt(sentence, rotationAmount));

    }

    public static void displaySplashScreen() {
        System.out.println("Cesar Cipher");
        System.out.println("This program will encode a sentence using Caesar Cipher");
    }

    public static String getUserInput() {
        Scanner input = new Scanner(System.in);
        String str = "";

        while (str.length() < 1 || str.length() > 512) {

            System.out.println("Please enter a sentence(Min 1, Max 512 Characters): ");

            str = input.nextLine();
        }

        return str;
    }

    public static int getUserRotation() {
        Scanner input = new Scanner(System.in);
        int rotationAmount = -1;

        while (rotationAmount < 1 || rotationAmount > 2147483647) {
            System.out.println("Please enter a valid rotation Amount (1-2,147,483,647): ");
            rotationAmount = Integer.parseInt(input.nextLine());
            rotationAmount = rotationAmount % 26;
        }
        return rotationAmount;
    }

    public static String encryptDecrypt(String str, int rotationAmount) {
        String newSentence = "";

        //n = extra step + 1 every loop. Resets every 4th rotation
        for (int i = 0, n = 0; i < str.length(); i++) {

            if (n > 4 || n < -4) {
                n = 0;
            }

            //Leaves all non-aplhabetic characters alone
            if (!Character.isAlphabetic(str.charAt(i))) {
                newSentence = newSentence + str.charAt(i);
            } else {
                if (str.charAt(i) < 97) {
                    newSentence = newSentence + (char) ((str.charAt(i) + rotationAmount + n - 65 + 26) % 26 + 65);
                } else {
                    newSentence = newSentence + (char) ((str.charAt(i) + rotationAmount + n - 97 + 26) % 26 + 97);
                }

                n++;

            }

        }

        return newSentence;
    }

}
