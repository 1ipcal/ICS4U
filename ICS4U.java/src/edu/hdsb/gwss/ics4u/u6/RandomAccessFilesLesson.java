/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.u6;

import java.io.RandomAccessFile;

/**
 *
 * @author Calvin
 */
public class RandomAccessFilesLesson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // WRITE FILES
        
        RandomAccessFile raf = new RandomAccessFile( "play.dat", "rw");
        
        raf.writeInt( 22 );         //32 bits = 4 bytes
        raf.writeBoolean( true );   //8 bits = 1 byte
        raf.writeBytes( "ABC" );    //3*16 = 48 bits = 7 bytes
        raf.writeBytes( "Hello" );  //2bytes * 5 Characters
        System.out.println("Byte Location: " + raf.length() );
        
        raf.seek( 0 );
        
        raf.writeInt( 22 );
        raf.writeBoolean( true );
        raf.writeBytes( "Good Bye" );
        
        raf.close();
    }
    
}
