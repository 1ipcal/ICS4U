/*
 * Name: Calvin Ip
 * Date: Febuary 9, 2021
 * Version: 1.0
 * Description: This program will inform the user if a word is a palindrome or not
 *                   
 */
package edu.hdsb.gwss.ics4u.u1;

import java.util.Scanner;

/**
 *
 * @author Calvin
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        String word, wordBackwards;
        
        //Splash Screen
        displaySplashScreen();
        
        //User Input
        word = getUserInput();
        
        //Backwards Sentence
        wordBackwards = getBackwardString(word);
        System.out.println(word + " In Reverse is: " + wordBackwards);
        
        //Checks Palindrome
        isPalindrome(word, wordBackwards);
    }
    
    public static void displaySplashScreen(){
        System.out.println("Palidrome");
        System.out.println("This program will inform the user if a word is a palindrome or not");
    }
    
    public static String getUserInput(){
        Scanner input = new Scanner(System.in);
        String str;
        
        System.out.println("Please enter a word: ");
        return str = input.nextLine();
    }
    
    public static String getBackwardString(String str){
        String strBackwards = "";
        
        for (int i = 0, incrementor = 1; i < str.length(); i++, incrementor++ ){
            strBackwards = strBackwards + str.charAt(str.length() - incrementor);
        }
        return strBackwards;
    }
    
    public static void isPalindrome(String str, String strBackwards){
        if (str.equalsIgnoreCase(strBackwards)){
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is not a Palindrome");
        }
        
    }
}
