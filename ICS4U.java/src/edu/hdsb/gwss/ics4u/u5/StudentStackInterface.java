/**
 * Student Stack Interface.
 *
 * @author Wm.Muir
 * @version 2020-21.Q3
 */
package edu.hdsb.gwss.ics4u.u5;


public interface StudentStackInterface {

    /**
     * Looks at the Student Object at the top of this stack without removing it.
     *
     * @return the Student at the top of this stack, or NULL if empty.
     */
    public Student peek();

    /**
     * Pops (remove) the Student Object at the top of this stack and returns the Student
     * object as the value of this function.
     *
     * @return the Student Object at the top of this stack, or NULL if empty.
     */
    public Student pop();

    /**
     * Pushes (adds) the Student Object onto the top of this stack.
     * @param value the Student to be put on the stack.
     */
    public void push( Student value );

    /**
     * Returns the number of Student Objects in the stack.
     *
     * @return the number of Student Objects in the stack, or ZERO if empty.
     */
    public int size();

    /**
     * Returns the current capacity of the Stack.
     *
     * @return the capacity of the stack; a fixed size.
     */
    public int capacity();

    /**
     * Tests if this stack is empty.
     *
     * @return true if there are no Student Objects, false if there is at least one.
     */
    public boolean isEmpty();

    /**
     * Tests if the Stack is full.
     *
     * @return true if the stack is full, false otherwise.
     */
    public boolean isFull();

    /**
     * The Stack will be empty after this method call.
     */
    public void makeEmpty();

}
