/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.u4.client;


import edu.hdsb.gwss.ics4u.u4.creator.Book;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author Calvin
 */
public class ClientCodeLesson1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = new String ( "Ip" );
        ArrayList<String> names = new ArrayList<>();
        StringTokenizer st;
        
        //We can use Object to store something in one variable
        
        //Class Vs Object
        //Class - A Blueprint, a design. It doesn't exist, and its an abstract concept
        //Object - is an instance of a class.
        
        //Datatype
        Book warAndPeace = new Book();
        Book harryPotter = new Book("Harry Potter", 2, 2);
        Book starWars = new Book(123);
        
        starWars.author = "George Lucas";
        starWars.title = "Star Wars, Episode VI";
        starWars.pages = 333;
        starWars.yearPublished = 1977;
        starWars.isbn = 123456789;
        
//        System.out.println( starWars );
//        System.out.println( starWars.pkid );
//        System.out.println( starWars.pages);
//        System.out.println( starWars.title);
//        System.out.println( starWars.pages);
//        System.out.println( starWars.yearPublished);
//        System.out.println( starWars.isbn);

        System.out.println( starWars.toString() );
        
    }
    
}
