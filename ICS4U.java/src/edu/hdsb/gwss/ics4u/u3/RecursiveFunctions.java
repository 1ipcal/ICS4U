/*
 * Name: Calvin Ip
 * Date: March 8, 2021
 * Version: 1.0
 * Description: This program will use a recursive method to return a new function
 *           
 */
package edu.hdsb.gwss.ics4u.u3;

/**
 *
 * @author Calvin
 */
public class RecursiveFunctions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Logic 1
        // if x < y, f(x,y) = -f(y,x)
        // if x = y, f(x,y) = 0
        // if x > y, f(x,y) = 1 + f(x-1,y)
        
        //Input for Function One
        System.out.println("Function One Outputs: ");
        System.out.println( functionOne(5,3) );
        System.out.println( functionOne(2,2) );
        System.out.println( functionOne(1,4) );
        System.out.println( functionOne(-5,-2) );
        System.out.println("");
        
        //Logic 2
        System.out.println("Function Two Outputs");
        System.out.println( functionTwo(1,1) );
        System.out.println( functionTwo(2,1) );

        System.out.println( functionTwo(5,5) ); //This statement causes a stackoverflow!! (Otherwise, function works)
    }
    
    public static int functionOne ( int x, int y ){
        if ( x < y  ) return functionOne(y, x);
        if ( x == y ) return 0;
        if ( x > y  ) return 1 + functionOne(x-1, y);
        
        return -1;
    }
    
    public static int functionTwo( int m, int n ){
        if( m == 0 ) return (n + 1);
        if( m > 0 && n == 0 ) return functionTwo( m-1, 1);
        
        return functionTwo( m-1, functionTwo(m,n-1) );
    }
}
