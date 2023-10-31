/*
 * Name: Calvin Ip
 * Date: March 8, 2021
 * Version: 1.0
 * Description: This program will use a recursive method to find the nth term for some sequences
 *           
 */
package edu.hdsb.gwss.ics4u.u3;

/**
 *
 * @author Calvin
 */
public class FiveTerms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
//        int term1 = 1;
//        int term2 = 3;

        //nth Term
        int n = 2;
 
        // t1: 1, t2: 3
        // (tn-1) + (tn-2)
        //Sequence 1: 1, 3, 4, 7, 11 ...
        
        System.out.println(sequenceOne(n));
        
        //t1: 2
        // sqrt( (3tn-1) +4)
        //Sequence 2: 2, 3.16, 3.67, 3.87, 3.95
        
        System.out.println((double) Math.round ( sequenceTwo(n) * 100) / 100 );
    }
    
    public static int sequenceOne(int n){

        if( n <= 0 ) return -1;
        if( n == 2 ) return 3;
        if( n == 1 ) return 1;
        
        return sequenceOne(n-1) + sequenceOne(n-2);
        
    }
    
    public static double sequenceTwo(int n){
        if ( n <= 0 ) return -1;
        if ( n == 1 ) return 2;
        
        return  Math.sqrt( 3*sequenceTwo(n - 1) + 4 );
    }
    
}
