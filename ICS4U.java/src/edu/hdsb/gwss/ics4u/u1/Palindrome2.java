/*
 * Name: Calvin Ip
 * Date: Febuary 9, 2021
 * Version: 1.0
 * Description: This program will inform the user if a word in a sentence is a palindrome or not. 
 *              Then it will count the number of words that are palindromes.                
 */
package edu.hdsb.gwss.ics4u.u1;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Calvin
 */
public class Palindrome2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        String sentence, word, wordBackwards;
        int counter = 0;
        
        //Splash Screen
        displaySplashScreen();
        
        //User Input
        sentence = getUserInput();
        StringTokenizer st = new StringTokenizer(sentence);
        
        //Output
        while ( st.hasMoreTokens() ){
            word = st.nextToken();
            
            //Backwards Sentence
            wordBackwards = getBackwardString(word);
        
            //Checks Palindrome and adds counter if true
            counter = counter + isPalindrome(word, wordBackwards);
        }
        
        //Output
        System.out.println("There are " + counter + " Palindrome(s) in this sentence");
    }
    
    public static void displaySplashScreen(){
        System.out.println("Palidrome");
        System.out.println("This program will inform the user if a word in a sentence is a palindrome or not");
        System.out.println("Then it will count the number of words in a sentence that are palindromes.");
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
    
    public static int isPalindrome(String str, String strBackwards){
        if (str.equalsIgnoreCase(strBackwards)){
            System.out.println(str + " is a Palindrome");
            
            return 1;
        } 
        
        return 0;
    }
}