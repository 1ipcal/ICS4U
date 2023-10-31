/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.u3;

/**
 *
 * @author Calvin
 */
public class RecursiveSolutions2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] data = {
        //  0  1  2  3   4   5   6   7   8   9   10
            2, 5, 8, 12, 15, 16, 20, 40, 42, 44, 50
        };

        System.out.println(max(data));
        System.out.println(linearSearch(data, 44));
        System.out.println(binarySearch(data, 50));
    }

    public static int binarySearch(int[] data, int searchValue) {
        return binarySearch(data, searchValue, 0, data.length);
    }
    
    private static int binarySearch(int[] data, int searchValue, int L, int R) {
        //Base Case First (Error Checking)
        if( L > R ) return -1;
        
        int mid = (L+R)/2;
        
        //Found
        if( data[mid] == searchValue ) return mid;
        
        //
        if( data[mid] > searchValue ) 
            return binarySearch(data, searchValue, L, mid-1);
        
        //Else
        return binarySearch(data, searchValue, mid + 1, R);
    }
    
    // O( Log2 N )
    public static int binarySearchLoop(int[] data, int searchValue) {

        //Loop Version
        int L = 0;
        int R = data.length - 1;
        int mid;

        while (L <= R) {
            mid = (L + R) / 2;

            //Found
            if (data[mid] == searchValue) return mid;
            
            if (data[mid] > searchValue) {
                R = mid - 1;
            }
            else{
                L = mid + 1;
            }
        }

        return -1;
    }

    //Efficiency: O(N)  -Linear
    //      Best Case:  O(1)
    //      Avg Case:   O(N/2)
    //      Worst Case: O(N)
    public static int linearSearch(int[] data, int searchValue) {
        //Using Loops
//        for (int i = 0; i < data.length; i++) {
//            if(data[i] == searchValue) return i;
//        }
//        
//        return -1;

        return linearSearch(data, searchValue, 0);
    }

    private static int linearSearch(int[] data, int searchValue, int i) {
        //Error Checking
        if (i == data.length) {
            return -1;
        }

        if (data[i] == searchValue) {
            return i;
        }

        return linearSearch(data, searchValue, i + 1);
    }

    public static int max(int[] data) {
        return max(data, 1, data[0]);
    }

    //Private -- Only can be called in this main
    private static int max(int[] data, int i, int currentMax) {
        //Check if gone through all indexes
        if (i == data.length) {
            return currentMax;
        }

//        //
//        if (data[i] > currentMax) {
//            return max(data, i + 1, data[i]);
//        }
//        else{
//            return max(data, i + 1, currentMax);
//        }
        //Cleaner Code
        return max(data, i + 1, Math.max(currentMax, data[i]));

    }

}
