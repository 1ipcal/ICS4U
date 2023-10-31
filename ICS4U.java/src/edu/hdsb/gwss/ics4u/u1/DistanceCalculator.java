/*
 * Name: Calvin Ip
 * Date: Febuary 8, 2021
 * Version: 1.0
 * Description: This program will calculate an accurate distance given two places on Earth
 *                   
 */
package edu.hdsb.gwss.ics4u.u1;

import java.util.Scanner;

/**
 *
 * @author Calvin
 */
public class DistanceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double lat1, lon1, lat2, lon2, distance;
        
        //Splash Screen
        displaySplashScreen();
        
        //User Input
        System.out.println("Latitude of Place #1:");
        lat1 = input.nextDouble();
        System.out.println("Lognitude of Place #1:");
        lon1 = input.nextDouble();
        System.out.println("Latitude of Place #2:");
        lat2 = input.nextDouble();
        System.out.println("Langitude of Place #2:");
        lon2 = input.nextDouble();
        
        //Calculation
        distance = doCalculation(lat1, lon1, lat2, lon2);
        
        //Displpay Output 
        displayOutput(distance);
    
    }
    
    public static void displaySplashScreen(){
        System.out.println("Distance Calculator");
        System.out.println("This program will calculate an accurate distance given two places on Earth");
        System.out.println("When entering latitude and longitude, please use degrees ");
        System.out.println("Use positive values for north latitudes and west longitudes");
        System.out.println("Use negative values for south latitudes and east longitudes");
        System.out.println("");
    
    }
    
    public static double doCalculation(double lat1, double lon1, double lat2, double lon2){
        double distance;
        
        return distance = 6378.8 * Math.acos( Math.sin(lat1/57.2958) * Math.sin(lat2/57.2958) + Math.cos(lat1/57.2958) * Math.cos(lat2/57.2958) * Math.cos(lon2/57.2958 - lon1/57.2958) );
    }
    
    public static void displayOutput(double distance){
        System.out.println("The Distance between place 1 and place 2 is: " + distance + "km");
    }
    
}
