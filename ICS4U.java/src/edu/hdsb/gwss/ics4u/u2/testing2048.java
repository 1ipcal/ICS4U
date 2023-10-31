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
public class testing2048 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // objecty
        int[][] data = {
            {8, 2, 0, 2},
            {2, 0, 2, 0},
            {2, 2, 0, 2},
            {4, 0, 2, 2},};

        System.out.println("Before: ");
        displayData(data);

//        shiftLeft(data);
//        mergeLeft(data);
//        shiftLeft(data);
//        shiftUp(data);
//        mergeUp(data);
//        shiftUp(data);
//        shiftRight(data);
//        mergeRight(data);
//        shiftRight(data);
        shiftDown(data);
        mergeDown(data);
        shiftDown(data);

        //Place Random 2
        System.out.println("After: ");
        displayData(data);
    }

    public static void displayData(int data[][]) {
        for (int r = 0; r < data.length; r++) {
            for (int c = 0; c < data[r].length; c++) {
                System.out.format("%5d", (int) data[r][c]);
            }
            System.out.println("");
        }
    }

    public static boolean shiftLeft(int data[][]) {
        boolean moved = false;

        //SHift left, each row
        for (int row = 0; row < data.length; row++) {

            //Pass 3 times
            for (int pass = 0; pass < 3; pass++) {

                //Shift Left
                for (int col = 1; col < data[row].length; col++) {

                    //Shift?
                    if (data[row][col] > 0 && data[row][col - 1] == 0) {

                        data[row][col - 1] = data[row][col];
                        data[row][col] = 0;
                        moved = true;

                    }
                }
            }

        }

        return moved;

    }//Method

    public static boolean mergeLeft(int data[][]) {
        boolean moved = false;

        for (int row = 0; row < data.length; row++) {
            for (int col = 1; col < data[row].length; col++) {

                if (data[row][col - 1] == data[row][col]) {
                    data[row][col - 1] = data[row][col - 1] * 2;
                    //score = score + data[row][col-1];
                    data[row][col] = 0;
                    moved = true;
                }
            }
        }

        return moved;
    }

    public static boolean shiftUp(int data[][]) {
        boolean moved = false;

        //Shift left, each row
        for (int col = 0; col < data.length; col++) {

            //Pass 3 times
            for (int pass = 0; pass < 3; pass++) {

                //Shift Left
                for (int row = 1; row < data[col].length; row++) {

                    //Shift?
                    if (data[row][col] > 0 && data[row - 1][col] == 0) {

                        data[row - 1][col] = data[row][col];
                        data[row][col] = 0;
                        moved = true;

                    }
                }
            }

        }

        return moved;
    }

    public static boolean mergeUp(int data[][]) {
        boolean moved = false;

        for (int col = 0; col < data.length; col++) {
            for (int row = 1; row < data[col].length; row++) {

                if (data[row - 1][col] == data[row][col]) {
                    data[row - 1][col] = data[row - 1][col] * 2;
                    //score = score + data[row][col-1];
                    data[row][col] = 0;
                    moved = true;
                }
            }
        }

        return moved;
    }

    public static boolean shiftRight(int data[][]) {
        boolean moved = false;

        //SHift left, each row
        for (int row = 0; row < data.length; row++) {

            //Pass 3 times
            for (int pass = 0; pass < 3; pass++) {

                //Shift Right
                for (int col = data[row].length - 2; col >= 0; col--) {

                    //Shift?
                    if (data[row][col] > 0 && data[row][col + 1] == 0) {

                        data[row][col + 1] = data[row][col];
                        data[row][col] = 0;
                        moved = true;

                    }
                }
            }

        }

        return moved;

    }//Method

    public static boolean mergeRight(int data[][]) {
        boolean moved = false;

        for (int row = 0; row < data.length; row++) {
            for (int col = data[row].length - 2; col >= 0; col--) {

                if (data[row][col + 1] == data[row][col]) {
                    data[row][col + 1] = data[row][col + 1] * 2;
                    //score = score + data[row][col-1];
                    data[row][col] = 0;
                    moved = true;
                }
            }
        }

        return moved;
    }

    public static boolean shiftDown(int data[][]) {
        boolean moved = false;

        //Shift left, each row
        for (int col = 0; col < data.length; col++) {

            //Pass 3 times
            for (int pass = 0; pass < 3; pass++) {

                //Shift Down
                for (int row = data.length - 2; row >= 0; row--) {

                    //Shift?
                    if (data[row][col] > 0 && data[row + 1][col] == 0) {

                        data[row + 1][col] = data[row][col];
                        data[row][col] = 0;
                        moved = true;

                    }
                }
            }

        }

        return moved;
    }

    public static boolean mergeDown(int data[][]) {
        boolean moved = false;

        for (int col = 0; col < data.length; col++) {
            for (int row = data.length - 2; row >= 0; row--) {

                if (data[row + 1][col] == data[row][col]) {
                    data[row + 1][col] = data[row + 1][col] * 2;
                    //score = score + data[row][col-1];
                    data[row][col] = 0;
                    moved = true;
                }
            }
        }

        return moved;
    }

//    public void placeRandomTwo() {
//        int r, c;
//        boolean found = false;
//
//        do {
//            r = (int) (Math.random() * 4);
//            c = (int) (Math.random() * 4);
//
//            if (data[r][c] == 0) {
//                data[r][c] = 0;
//            }
//
//        }  while(!found);
//
//    }
}
