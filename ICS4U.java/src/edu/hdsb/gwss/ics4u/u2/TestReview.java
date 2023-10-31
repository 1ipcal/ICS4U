/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.u2;

import java.util.ArrayList;

/**
 *
 * @author Calvin
 */
public class TestReview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Single Array");
        // Declaring Arrays

        //1. If you know whats in the data already:
        String[] DAYS_OF_THE_WEEK
                = {"M", "T", "W", "T", "F", "S", "S"};

        //Indexes start at Zero
        System.out.println(DAYS_OF_THE_WEEK[0]);

        //array.length is always 1 more than the array. Therefore, to use the last index #, do "array.length-1"
        System.out.println(DAYS_OF_THE_WEEK.length - 1);

        //2. VariableType[] = new VariableType[#]
        int marks[] = new int[5];

        marks[0] = 56;
        marks[1] = 99;
        marks[2] = 98;
        marks[3] = 54;
        marks[4] = 77;

        System.out.println(marks[4]);

        //Iterating through an array
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks: " + marks[i]);
        }

        System.out.println("");
        //-----------------------------------------------------------------------------------------

        //Multidimensional Array
        System.out.println("Multidimensional Arrays");

        //Ways to Declare
        int[][] marks2 = new int[5][];

        marks2[0] = new int[4];
        marks2[1] = new int[5];
        marks2[2] = new int[4];
        marks2[3] = new int[5];
        //marks2[4] = null; --> Can be declared as null (array haven't been made yet)
        marks2[4] = new int[2];

        //Iterating through an array
        for (int r = 0; r < marks2.length; r++) {
            for (int c = 0; c < marks2[r].length; c++) {
                //Generate Random Numebrs
                marks2[r][c] = (int) (Math.random() * 10);

            }

        }

        //Display arrays
        display(marks2);

        //FIND MAX, and OCCURANCES.
        int max = marks2[0][0];
        int maxCounter = 0;

        for (int r = 0; r < marks2.length; r++) {
            for (int c = 0; c < marks2[r].length; c++) {
                //NEW MAX
                if (marks2[r][c] > max) {
                    max = marks2[r][c];
                    maxCounter = 1;
                } else if (marks2[r][c] == max) {
                    maxCounter++;
                }

            }
        }

        System.out.println("Max: " + max);
        System.out.println("Max Counter: " + maxCounter);

        System.out.println("");
        //----------------------------------------------
        //Arrays are fixed sizes, while array lists can add more data anytime. Infinite size
        System.out.println("Array Lists");

        //Two Ways to Declare
        ArrayList mixedBag = new ArrayList();
        mixedBag.add("Hello"); // Adds to the End of the List
        mixedBag.add(0, "World"); //Declare an index  before adding ( World --> Hello)
        mixedBag.add("Hello1"); // Adds to the End of the List
        mixedBag.add("Hello2"); // Adds to the End of the List
        mixedBag.add("Hello3"); // Adds to the End of the List

        //Array List can add many data types
        mixedBag.add(true); // Adds to the End of the List
        mixedBag.add(12.34); // Adds to the End of the List
        mixedBag.add(new int[4]); // Adds to the End of the List
        mixedBag.add(new ArrayList()); // Adds to the End of the List

        //Printing
        System.out.println(mixedBag.get(0)); //Gets and prints
        System.out.println(mixedBag.remove(0)); //Gets then removes it from the list
        System.out.println(mixedBag.get(0));

        //Size of the Array
        System.out.println(mixedBag.size());

        //Iterating all
        for (int i = 0; i < mixedBag.size(); i++) {
            System.out.println(mixedBag.get(i));
        }

        //Different Type
        //Example: An Array List that only allows strings
        ArrayList<String> names = new ArrayList<String>();
        
        //You can resize the array before hand. Default size is 10
        ArrayList<String> names2 = new ArrayList<String>(1000);

    }

    public static void display(int[][] data) {
        for (int r = 0; r < data.length; r++) {
            for (int c = 0; c < data[r].length; c++) {
                System.out.print(data[r][c] + " ");
            }
            System.out.println("");
        }
    }

}
