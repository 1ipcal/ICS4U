/*
 * Name: Calvin Ip
 * Date: Febuary 10, 2021
 * Version: 1.0
 * Description: File Practice
 *                   
 */
package edu.hdsb.gwss.ics4u.u1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Calvin
 */
public class FileExample {

    /**
     * @param args the command line arguments
     */
    
    static final String FS = File.separator;
    
    public static void main(String[] args) throws FileNotFoundException {
        
        //".\\data\\u1\\data.txt"
        //"." + FS "data" + FS "u1" + FS "data.txt"
        
        //File Variable
        File data = new File("." + FS + "data" + FS + "u1" + FS + "data.txt");
        
        // SCANNER to File
        Scanner input = new Scanner( data );
        
        while( input.hasNextLine() ){
            System.out.println( input.nextLine() );
        }
    }
    
}
