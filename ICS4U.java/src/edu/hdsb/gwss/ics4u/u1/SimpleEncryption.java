/*
 * Name: Calvin Ip
 * Date: Febuary 9, 2021
 * Version: 1.0
 * Description: This program will use a simple alphabetic rotation encryption
 *                   
 */
package edu.hdsb.gwss.ics4u.u1;

import java.util.Scanner;

/**
 *
 * @author Calvin
 */
public class SimpleEncryption {

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
        while (choice < 1 || choice > 2){
            System.out.println("Enter 1 to Encrypt ");
            System.out.println("Enter 2 to Decrypt");
            choice = input.nextInt(); 
            
            if (choice == 2){
                rotationAmount = rotationAmount * -1;
            }
            
        } //End While Loop
        
        System.out.println( encryptDecrypt(sentence, rotationAmount) );
        
    }
    
    public static void displaySplashScreen(){
        System.out.println("Simple Encryption");
        System.out.println("This program will use a simple alphabetic rotation encryption");
    }
    
    public static String getUserInput(){
        Scanner input = new Scanner(System.in);
        String str;
        
        System.out.println("Please enter a sentence: ");
        return str = input.nextLine().toUpperCase();
    }
    
    public static int getUserRotation(){
        Scanner input = new Scanner(System.in);
        int rotationAmount = -1;
        
        while (rotationAmount <= 0 || rotationAmount > 25 ){
            System.out.println("Please enter a valid rotation Amount (1-25): ");
            rotationAmount = input.nextInt();
        }
        return rotationAmount;
    }
    
    public static String encryptDecrypt(String str, int rotationAmount){
        String newSentence = "";
        
        for(int i = 0; i < str.length(); i++){
            
            //Turns all non-aphabet characters into blank spaces
            if (str.charAt(i) > 90 || str.charAt(i) < 65){
                newSentence = newSentence + " ";
            } else {
                newSentence = newSentence + (char) ( (str.charAt(i) + rotationAmount - 65 + 26) % 26 + 65 );
            }
            
        }
        
        return newSentence;
    }
    
}
