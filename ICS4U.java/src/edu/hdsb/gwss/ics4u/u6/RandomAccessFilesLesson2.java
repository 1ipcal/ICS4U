/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.u6;

import edu.hdsb.gwss.ics4u.u5.Student;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 *
 * @author Calvin
 */
public class RandomAccessFilesLesson2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        //READ FILES
        
//        RandomAccessFile raf = new RandomAccessFile( "play.dat", "rw");
//        
//        // A - 1, B-2, E-5
//        int id = 5;
//        raf.seek( (id-1) * Student.REC_LENGTH);
//        
//        //Read!!
//        Student s = new Student(id);
//        
//        //Read First Name
//        char[] str = new char[Student.LENGTH_FIRST_NAME];
//        for (int i = 0; i < LENGTH_FRIST_NAME; i++) {
//            str[i] = raf.readChar();
//        }
//        s.setFirstName( new String( str) );
//        
//        //Read First Name
//        char[] str = new char[Student.LENGTH_LAST_NAME];
//        for (int i = 0; i < LENGTH_LAST_NAME; i++) {
//            str[i] = raf.readChar();
//        }
//        s.setLastName( new String( str) );
//        
//        //Read other information
//        s.setGrade( raf.readInt() );
//        s.setPassedOSSLT( raf.readBoolean() );
//        s.setCommunityHours( raf.readBoolean() );
//                
//        raf.close();
    }
    
}
