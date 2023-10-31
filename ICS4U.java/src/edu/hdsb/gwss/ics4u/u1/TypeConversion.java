/*
 * Name: Calvin Ip
 * Date: Febuary 8, 2021
 * Version: 0.1
 * Description: This program will show conversions of variables (read code)
 *                   
 */
package edu.hdsb.gwss.ics4u.u1;

/**
 *
 * @author Calvin
 */
public class TypeConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Display Splash Screen
        displaySplashScreen();
        
        //Boolean to...
        convertBoolean();
        
        //Char to...
        convertChar();
        
        //Int to...
        convertInt();
        
        //Long to..
        convertLong();
        
        //Double to..
        convertDouble();
        
        //String to..
        convertString();
    }
    
    public static void displaySplashScreen(){
        System.out.println("Type Conversion:");
        System.out.println("This program will convert a variable to another variable");
        System.out.println("(Read the code to understand Better)");
        System.out.println("Refer to https://www.w3schools.com/java/java_type_casting.asp");
        
    }
    
    public static void convertBoolean(){
        boolean b = true;
        int i;
        long l;
        double d;
        String string;
        
        System.out.println("Boolean Conversion: ");
        
        //boolean to int, long, double
        if (b == true){
            i = 1;
            l = 1;
            d = 1.0;
        } else {
            i = 0;
            l = 0;
            d = 0.0;
        }
        
        //Output
        System.out.println(i);
        System.out.println(l);
        System.out.println(d);
        //Boolean to String
        System.out.println(Boolean.toString(b));

    }
    
    public static void convertChar(){
        char c = 'c';
        boolean b;
        int i;
        long l;
        double d;
        String string;
        
        System.out.println("Char Conversion: ");
        
        //To Boolean
        if (c == 99){
            b = true;
            System.out.println(b);
        } else {
            b = false;
            System.out.println(b);
        }
        
        //To int, long, double
        i = c;
        l = c;
        d = c;
        
        //Output
        System.out.println(b);
        System.out.println(i);
        System.out.println(l);
        System.out.println(d);
        System.out.println(Character.toString(c));
    }
    
    public static void convertInt(){
        int i = 99;
        char c;
        boolean b;
        long l;
        double d;
        String string;
        
        System.out.println("Int Conversion: ");
        
        if (i ==1){
            b = true;
        } else {
            b = false;
        }
        
        c = (char) i;
        l = i;
        d = i;
        
        System.out.println(b);
        System.out.println(c);
        System.out.println(l);
        System.out.println(d);
        System.out.println(Integer.toString(i));
    }
    
    public static void convertLong(){
        boolean b;
        char c;
        int i;
        long l = 99;
        double d;
        String string;
        
        System.out.println("Long Conversion: ");
        
        if (l ==1){
            b = true;
        } else {
            b = false;
        }
        
        c = (char) l;
        i = (int) l;
        d = l;
        
        System.out.println(b);
        System.out.println(c);
        System.out.println(l);
        System.out.println(d);
        System.out.println(Long.toString(l));
    }
    
    public static void convertDouble(){
        boolean b;
        char c;
        int i;
        long l;
        double d=99;
        String string;
        
        System.out.println("Double Conversion: ");
        
        if (d == 1){
            b = true;
        } else {
            b = false;
        }
        
        c = (char) d;
        i = (int) d;
        l = (long) d;
        
        System.out.println(b);
        System.out.println(c);
        System.out.println(l);
        System.out.println(d);
        System.out.println(Double.toString(d));
    }
    
    public static void convertString(){
        boolean b;
        char c;
        int i;
        long l;
        double d;
        String string = "99";
        
        System.out.println("String Conversion: ");
        
        if (string == "99"){
            b = true;
        } else {
            b = false;
        }
        
        c = string.charAt(0);
        i = Integer.parseInt(string);
        l = Long.parseLong(string);
        d = Double.parseDouble(string);
        
        System.out.println(b);
        System.out.println(c);
        System.out.println(l);
        System.out.println(d);
        System.out.println(Double.toString(d));
        
    }
        
}
