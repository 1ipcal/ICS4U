/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.u4.creator;

/**
 *
 * @author ICS4U-Calvin
 */
public class Parent {
    //Class Constants
    public static final String SCHOOL_NAME = "GWSS";

    //Class Variable
    private static int lastID;
    
    //Object Variable
    private String name;
    private int id;
    
    public Parent( String name ) {
        this.id = ++lastID;
        this.name = name;
    }
    
    public void speak(){
        System.out.println("Hello");
    }

    public static int getLastID() {
        return lastID;
    }

    public static void setLastID(int lastID) {
        Parent.lastID = lastID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Parent{" + "name=" + name + ", id=" + id + '}';
    }
    
    
}
