/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.u2;

/**
 *
 * @author Calvin
 */
public class Lesson_MultidimensionalArray2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] data  = 
        {
            {1, 2, 3},
            {4},
            {5, 6, 7},
            {8, 9}
        
        };
        
        for (int r = 0; r < data.length; r++) {
            System.out.println("Row " + (r + 1) );
            for (int c = 0; c < data[r].length; c++) {
                System.out.print(data[r][c] + " ");
            }
            System.out.println("");
        }
        
    }
    
}
