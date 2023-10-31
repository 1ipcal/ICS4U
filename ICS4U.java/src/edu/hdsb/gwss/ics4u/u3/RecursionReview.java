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
public class RecursionReview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //All Recursions has a base case, otherwise stack overflow haappens
        
        //Example 1: Make a recursive statement of this loop
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + 2*i + 2;
        }
        System.out.println(sum);
        System.out.println( f(0) );
        
        //Example 2: Make a recursive statement of this loop
        
        //ERROR CHECKING
        //SUM OF ODD NUMBERS FROM a to b
        //1-3 == 4
        //0-4 == 4
        //3-1 == 4
        
        System.out.println( sumOddII(3, 1) );
        
        //Example 3: Binary Search
        int[] data = { 1, 4, 6, 10, 20, 25};
        
        
        
    }
    
    //Example 1
    public static int f(int n){
        if(n >= 10) return 0;
        return 2*n + 2 + f(n+1); 
        
    }
    
    //Example 2:
    private static int sumOdd (int start, int end){
        if (start > end) return 0;
        
        return start + sumOdd(start+2, end);
    }
    
    private static int sumOddII(int start, int end){
        if(start > end){
            int temp = end;
            end = start;
            start = temp;
        }
        
        if(start % 2 == 0) start++;
        return sumOdd(start, end);
    }
    
    //Example 3:
    public static int binSearch(int data[], int sV){
        return binSearch(data, sV, 0, data.length-1);
    }
    
    private static int binSearch(int[]data, int sV, int L, int R){
        if (L > R) return -1;
        int mid = (L+R)/2;
        if (data[mid] == sV) return mid;
        
        if(data[mid] > sV){
            //LHS
            return binSearch(data, sV, L, mid-1);
        } else {
            //RHS
            return binSearch(data, sV, mid+1, R);
        }
    }
            
    //Must be memorised
    public static int gcd( int m, int n){
        if( m == n) return m;
        if( m > n) return gcd (n, m - n);
        return gcd(n,m);
        
    }
    
}
