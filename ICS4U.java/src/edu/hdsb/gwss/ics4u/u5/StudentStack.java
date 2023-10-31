/*
 * Name: Calvin Ip
 * Date: March 26, 2021
 * Version: 1.0
 * Description: This class is a stack data system
 *           
 */
package edu.hdsb.gwss.ics4u.u5;

/**
 *
 * @author Calvin
 */
public class StudentStack implements StudentStackInterface {

    //CONSTANTS
    public static final int DEFAULT_SIZE = 11;

    // INSTANCE VARIABLE
    private int top;
    private Student[] stack;

    public StudentStack() {
        this(DEFAULT_SIZE);
    }

    public StudentStack(int size) {
        this.makeEmpty();
        this.stack = new Student[size];
    }

    @Override
    public Student peek() {
        //Checks if empty
        if (this.isEmpty() ) {
            return null;
        } //Else Returns top of the stack
        else {
            return stack[top];
        }
        
    }

    @Override
    public Student pop() {
        Student value;
        
        //Checks if empty
        if (this.isEmpty() ) {
            return null;
        } //Else do code
        else {
            //Stores object into temp variable and removes one top
            value = this.peek();
            top = top - 1;
            return value;
        }
    }

    @Override
    public void push(Student value) {
        //Checks if Empty or full. Also checks if null
        if ( !this.isFull() && value != null) {         
      
            //Adds 1 counter to TOP variables then, stores data into array
            top = top + 1;
            stack[top] = value;
        }
    }

    @Override
    public int size() {
        //Adds 1 to the index value of top
        return this.top + 1;
    }

    @Override
    public int capacity() {
        //Capacity == default length
        return this.stack.length;
    }

    @Override
    public boolean isEmpty() {
        //Checks to see if size is 0
        return this.size() == 0;
    }

    @Override
    public boolean isFull() {
        //Determine size and compare it with the default capacity
        return this.size() == this.capacity();
    }

    @Override
    public void makeEmpty() {
        //Moves top counter to -1 (Force Empty)
        this.top = -1;
    }

}
