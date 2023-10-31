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
public class RecursiveSolutions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Recursive Solutions
         
        //1.    Factorial - 5!
        //      5 x 4 x 3 x 2 x 1 
        //      n x (n-1) x (n-2) x (n-3) x (n-4) ... x 1
        
        //Use a for loop typically
        
        //Recursive Solution
        int n = 5;
        int answer = factorial(n);
        
        System.out.println("Factorial " + answer);
        
        
        //Fibonaci Sequence
        // 0, 1, 1, 2, 3, 5, 8, ...
        //t(n) = t(n-1) + t(n-2)
        //t(1) = 0
        //t(2) = 1;
        //n > 0
        
        n = 7;
        System.out.println("Fibonaci Sequence: " + fib(n) );
        
        
        //GCF
        int a = 21;
        int b = 28;
        
        //Negative can work
//        a = Math.abs( a );
//        b = Math.abs( b );
//        
//        int gcf = 1;
//        int counter = 0;
//        
//        for (int f = Math.min( a, b ); f <= 1; f--) {
//            counter++;
//            if ( a % f == 0 && b % f == 0){
//                gcf = f;
//                f = 0;
//            }
//        }
//        
//        System.out.println("GCF: " + gcf);
//        System.out.println("found in " + counter + " tries ");

        System.out.println("Greatest Common Divisor " + gcd (115, 85) );
        
    }
    
    public static int factorial (int n){
        //Error Checking. If not here, a "stack overflow" happens. Try commenting these out!
        if( n < 0 ) return -1;
        if (n <= 1) return 1;
        
        //  |   5 * factorial( 4 )   --> 5 * 24 = 120   ^
        //  |   4 * factorial( 3 )   --> 4 * 6 = 24     |
        //  |   3 * factorial( 2 )   --> 3 * 2 = 6      |
        // \ /  2 * factorial( 1 )   --> 2 * 1 = 2      |
        
        return n * factorial( n-1 );
    }
    
    
    //fib( 4 ) = fib( 3 ) + fib( 2 ) --> 1 + 1 = 2
    //fib( 3 ) = fib( 2 ) + fib( 1 ) --> 1 + 0 = 1
    //fib( 2 ) = 1
    //fib( 1 ) = 0
    
    //fib( 2 ) = 1
    
    public static int fib(int n){
        if( n <= 0 ) return -1;
        if( n == 1 ) return 0;
        if( n == 2 ) return 1;
        
        return fib( n-1 ) + fib( n-2 );
    }
    
    public static int gcd( int m, int n){
        if( m == n) return m;
        if( m > n) return gcd (n, m - n);
        return gcd(n,m);
        
    }
}
