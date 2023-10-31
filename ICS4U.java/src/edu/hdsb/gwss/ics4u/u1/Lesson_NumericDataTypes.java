package edu.hdsb.gwss.ics4u.u1;


import java.math.BigInteger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Calvin
 */
public class Lesson_NumericDataTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Int
        int age = 10;
        int max = Integer.MAX_VALUE;
        
        System.out.println("Before: " + max);
        max = max + 1;
        System.out.println("After: " + max);
        
        floatingPoint();
        
        casting();
        
        intOperation();
        
        bigIntegers();
    }
    
    public static void floatingPoint(){
        //Floating Point
        //float neverUse = (float) 1.2;
        //double alwaysUse = 1.234;
        
        System.out.println("Floating Point:");
        //Expresses False for double x == y
        double x = 0.3;
        double y = 0.1 + 0.1 + 0.1;
        System.out.println(x == y);   
        
    }
    
    public static void casting(){
        //Casting
        long x = 6;
        int z = 5;
        
        System.out.println("Casting:");
        x = z;
        z = (int) x;
        System.out.println(x);
        System.out.println(z);
        
    }
    
    public static void intOperation(){
        //
        int a = 5;
        int b = 6;
        
        System.out.println("Int Operation:");
        System.out.println(a/b); //prints 0
        System.out.println( (double) a / b ); //prints properly
        System.out.println(a % b);
    }
    
    public static void bigIntegers(){
        BigInteger a = new BigInteger("9223372036854775807");
        BigInteger b = new BigInteger("2");
        BigInteger c = a.multiply(b); // 9223372036854775807 * 2
        
        System.out.println("Big Integer:");
        System.out.println(c);
    }
    
}
