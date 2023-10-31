/*
 * Name: Calvin Ip
 * Date: March 8, 2021
 * Version: 1.0
 * Description: This program will use a recursive method to return a Pascal's Triangle
 *           
 */
package edu.hdsb.gwss.ics4u.u3;

/**
 *
 * @author Calvin
 */
public class PascalTriangleRecusive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rows = 10;
        
        row(rows);
        
    }
    public static void row(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(term(row,col) + " ");
            }
            System.out.println();
        }
    }
    
    public static int term(int row, int col){
        if (col == 0 || col == row) return 1;
        else return term(row-1, col-1) + term(row-1, col);
        
    }
}
