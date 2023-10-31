/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.u4.creator;

/**
 *
 * @author Calvin
 */
public class Book {
    
    //CLASS CONSTANTS
    //CLASS VARIABLES
    
    //OBJECT VARIABLES
    public int pages;
    public int yearPublished;
    public int isbn;
    public String author;
    public String title;
    public int pkid;
    public int edition;
    public int bookId;
    
    //Constructor
    //- is called once, only once... when new Book(...)
    
    //Emppty Constructor
    public Book() {
        System.out.println("Book() - Empty Constructor");
    }
    
    //Primary Key
    public Book( int pkid ){
        this.pkid = pkid;
    }
    
    //Secondary Key
    // 2018-01, 2018-02, 2018-03
    // 17-04
    public Book( String title, int edition, int bookId ){
        this.title = title;
        this.edition = edition;
        this.bookId = bookId;
    }

    @Override
    public String toString() {
        return "Book{" + "yearPublished=" + yearPublished + ", author=" + author + ", title=" + title + ", pkid=" + pkid + '}';
    }
    
    
    
}
