/*
 * Name: Calvin Ip
 * Date: Febuary 21, 2021
 * Version: 1.0
 * Description: Various Array Utilities 
 *                   
 */
package edu.hdsb.gwss.ics4u.u2;

import java.util.Scanner;

/**
 *
 * @author Calvin
 */
public class ArrayUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Array
        double[][] data = new double[2][2];

        //Input
        getInput(data);
        
        //Methods
        display(data);
        max(data);
        min(data);
        average(data);
        sum(data);

    }

    public static void getInput(double[][] data) {
        Scanner input = new Scanner(System.in);
        
        for (int r = 0; r < data.length; r++) {
            System.out.println("Row #" + (r + 1));
            for (int c = 0; c < data[r].length; c++) {
                System.out.println("Collumn " + (c + 1) + " Data: ");
                data[r][c] = Double.parseDouble(input.nextLine());
            }
        }
        
    }

    public static void display(double[][] data) {

        System.out.println("Display Data:");
        for (int r = 0; r < data.length; r++) {
            for (int c = 0; c < data[r].length; c++) {
                System.out.format("%20d", (int) data[r][c]);
            }
        }
        
        System.out.println("");
        
    }
    
    public static void max(double[][] data){
        double max = Double.MIN_VALUE;
        
        for (int r = 0; r < data.length; r++) {
            for (int c = 0; c < data[r].length; c++) {
                if(data[r][c] > max){
                    max = data[r][c];
                }
            }
        }
        
        System.out.println("Max is: " + max);
        
    }
    
    public static void min(double[][] data){
        double min = Double.MAX_VALUE;
        
        for (int r = 0; r < data.length; r++) {
            for (int c = 0; c < data[r].length; c++) {
                if (data[r][c] < min){
                    min = data[r][c];
                }
            }
        }
        
        System.out.println("Min is: " + min);
        
    }
    
    public static void average(double[][] data){
        double average = 0;
        int counter = 0;
        
        for (int r = 0; r < data.length; r++) {
            for (int c = 0; c < data[r].length; c++) {
                average = average + data[r][c];
                counter++;
            }
        }
        
        System.out.println("Average is: " + (average / counter));
        
    }
    
    public static void sum(double data[][]){
        double sum = 0;
        
        for (int r = 0; r < data.length; r++) {
            for (int c = 0; c < data[r].length; c++) {
                sum = sum + data[r][c];
                
            }
        }
        
        System.out.println("Sum is: " + sum );
    }

}
