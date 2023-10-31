/*
 * Name: Calvin Ip
 * Date: Febuary 23, 2021
 * Version: 0.5
 * Description: This program will simulate John Conway's Game of Life 
 *           
 */
package edu.hdsb.gwss.ics4u.u2;

import java.util.Scanner;

/**
 *
 * @author Calvin
 */
public class GameOfLife {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Objects (Alive = true, Dead = false)
        boolean[][] board = new boolean[20][20];
        Scanner input = new Scanner(System.in);

        //Variables
        int numberOfCells;
        int generationNumber = 1;
        String choice = "";

        //Splash Screen
        displaySplashScreen();

        //Input
        numberOfCells = getUserInput();

        //Setup
        generateRandomCells(numberOfCells, board);

        //Print Initial Board
        System.out.println("Generation # " + 0);
        displayBoard(board);

        //Processing
        while (!choice.equals("no")) {
            board = generateNextGen( board );
            System.out.println("Generation # " + generationNumber);
            displayBoard(board);
            generationNumber++;

            //Get User Input to Continue. Loop if !yes or !no
            choice = "";
            while (!choice.equals("yes") && !choice.equals("no")) {
                System.out.println("Continue? (Enter \"yes\" or \"no\")");
                choice = input.nextLine().toLowerCase();
            }

        }
    }

    public static void displaySplashScreen() {
        System.out.println("Game of Life");
        System.out.println("This program will simulate John Conway's Game of Life");
    }

    public static int getUserInput() {
        Scanner input = new Scanner(System.in);
        int numberOfCells = -1;

        //Loop until Valid
        while (numberOfCells < 1 || numberOfCells > 400) {
            System.out.println("How many Cells? (1-400)");
            numberOfCells = Integer.parseInt(input.nextLine());

            //Returns if Valid
            if (numberOfCells > 0 && numberOfCells < 401) {
                return numberOfCells;
            }

            System.out.println("Enter Valid # of Cells");
        }

        return -1;
    }

    public static void generateRandomCells(int numberOfCells, boolean board[][]) {
        //Start with dead if 1-200 , Start with alive if 201-400
        //Variables
        boolean moreThan200 = false;
        int randomNum1, randomNum2;

        //Checks if Over 200 needs to be Placed
        if (numberOfCells > 200) {
            //Generate All Alive
            for (int r = 0; r < board.length; r++) {
                for (int c = 0; c < board[r].length; c++) {
                    board[r][c] = true;
                }
            }
            numberOfCells = 400 - numberOfCells;
            moreThan200 = true;
        }

        //Loop until All Cells Are Placed
        while (numberOfCells > 0) {
            randomNum1 = generateRandomNum();
            randomNum2 = generateRandomNum();

            if (moreThan200 == false) {
                //Add Cells
                if (board[randomNum1][randomNum2] == false) {
                    board[randomNum1][randomNum2] = true;
                    numberOfCells--;
                }
            } else {
                //Delete Cells
                if (board[randomNum1][randomNum2] == true) {
                    board[randomNum1][randomNum2] = false;
                    numberOfCells--;
                }
            }

        } //End of Loop

    } //End of Generate Method

    public static void displayBoard(boolean newBoard[][]) {
        for (int r = 0; r < newBoard.length; r++) {
            for (int c = 0; c < newBoard[r].length; c++) {
                //Prints "O" if Alive (True), Prints "." if Dead (False)
                if (newBoard[r][c]) {
                    System.out.print("O");
                } else {
                    System.out.print(".");
                }

            }
            //New Line
            System.out.println("");
        }
    }

    public static int generateRandomNum() {
        int randomNum;
        return randomNum = (int) (Math.random() * 20) + 0;
    }

    public static boolean[][] generateNextGen(boolean board[][] ) {
        //Variable
        int neighbourCount;

        boolean newBoard[][] = new boolean[board.length][board[0].length];
        
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                //Resets Neighbour Count Variable
                neighbourCount = 0;

                //Checks for Live Neighbours
                for (int width = -1; width <= 1; width++) {
                    for (int length = -1; length <= 1; length++) {

                        //Checks if in bounds
                        if (((r + width) >= 0 && (r + width) <= 19) && ((c + length) >= 0 && (c + length) <= 19)) {
                            //Checks if neighbour is Live. If true, add one to neighbourCount
                            if (board[r + width][c + length]) {
                                neighbourCount++;
                            }
                        } //Bound Checker

                    }
                }

                //Subtract 1 neighbour if checking its own cell
                if (board[r][c]) {
                    neighbourCount--;
                }

//                //Testing
//                System.out.println("r: " + r + " c: " + c);
//                System.out.println("NeighbourCount: " + neighbourCount);
//                System.out.println("");

                //Counts all Neigbours at apply rules
                if (board[r][c] && neighbourCount < 2) {
                    //Dies via underpopulation (<2)
                    newBoard[r][c] = false;

                } else if (board[r][c] && (neighbourCount == 2 || neighbourCount == 3)) {
                    //Lives on to next Gen (2-3)
                    newBoard[r][c] = true;

                } else if (board[r][c] && neighbourCount > 3) {
                    //Dies to Overcrowding (>3)
                    newBoard[r][c] = false;

                } else if (!board[r][c] && neighbourCount == 3) {
                    //Dead Cell lives via repoduction (==3)
                    newBoard[r][c] = true;
                }

            } //End of For loop (c)
        } //End of For loop (r)

        return newBoard;
        
    } //End of generateNextGen Method

}//End of Main
