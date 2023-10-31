/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.u2;

import java.util.Scanner;

public class Lesson_MultidimensionalArray {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        //              C1      C2      C3      C4
        //Student 01    23      34      34      99
        //Student 02    23      88      88      88
        //Student 03    88      88      88      88
        //Doesn't matter the order of row, collumn, or collumn row. Just know which is which
        int[][] marks = new int[2][3];
        
        //System.out.println(marks[1][1]);

        //Input
        for (int r = 0; r < marks.length; r++) {
            System.out.println("Student #" + (r + 1));
            for (int c = 0; c < marks[r].length; c++) {
                System.out.println("Mark " + (c + 1) + ":");
                marks[r][c] = Integer.parseInt(input.nextLine());
            }
            System.out.println("");
        }
        
        //Max
        int max = Integer.MIN_VALUE;
        for (int r = 0; r < marks.length; r++) {
            for (int c = 0; c < marks[r].length; c++) {
                if (marks[r][c] > max){
                   
                }
            }
            
        }
        
        //Sum
        double sum = 0;
        int n = 0;
        for (int r = 0; r < marks.length; r++) {
            for (int c = 0; c < marks[r].length; c++) {
                if (marks[r][c] > max){
                    n++;
                   sum = sum + marks[r][c];
                }
            }
            
        }
        System.out.println("AVERAGE:" + (double) sum/n);
        
        System.out.println("Max is: " + max);
        
        //Non-Hardcode Format
        String maxS = "" + max;
        int length = maxS.length();
        length++;
        String sFormat = "%" + length + "d";
        
        //Nested For Loop - VERY IMPORTANT (Output)
        for (int r = 0; r < marks.length; r++) {
            for (int c = 0; c < marks[r].length; c++) {
                System.out.format(sFormat, marks[r][c]);
            }
            System.out.println("");
        }

        //int[][][] marks2 = new int[24][4][4];

    } 
}
