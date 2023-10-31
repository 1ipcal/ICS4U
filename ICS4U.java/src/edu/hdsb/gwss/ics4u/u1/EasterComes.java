/*
 * Name: Calvin Ip
 * Date: Febuary 8, 2021
 * Version: 1.0
 * Description: This program will determine when Easter Sunday will come, given a year
 *                   
 */
package edu.hdsb.gwss.ics4u.u1;

import java.util.Scanner;

/**
 
 * @author Calvin
 */
public class EasterComes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Splash Screen
        displaySplashScreen();
        
        //Get User Input
        int year = getUserInput();
        
        //Calculate Easter Day
        doCalculation(year);
        
    }
    
    public static void displaySplashScreen(){
        System.out.println("Easter Comes:");
        System.out.println("This program will determine when Easter Sunday will come, given a year");
        
    }
    
    public static int getUserInput(){
        Scanner input = new Scanner(System.in);
        int year;
        
        System.out.println("Please enter a Year:");
        year = input.nextInt();
        return year;
    }
    
    public static void doCalculation(int year){
        //Quotient Variables
        int b, d, f, g, i, m, month;
        
        //Remainer Variables
        int a, c, e, h, k, j, p;
        
        int day;
        
        //Calculations
        a = year % 19;
        b = year / 100;
        c = year % 100;
        d = b / 4;
        e = b % 4;
        f = (b+8) / 25;
        g = (b - f + 1) / 3;
        h = (19*a + b - d - g + 15) % 30;
        i = c / 4;
        k = c % 4;
        j = (32 + 2*e + 2*i - h - k) % 7;
        m = (a + 11*h + 22*j) / 451;
        month = (h + j - 7*m + 114) / 31;
        p = (h + j - 7*m + 114) % 31;
        day = p + 1;
        
        System.out.println("Easter Date: " + month + "/" + day + "/" + year);
    }
}
