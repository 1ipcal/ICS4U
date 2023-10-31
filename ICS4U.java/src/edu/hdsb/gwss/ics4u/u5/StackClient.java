/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.u5;

/**
 *
 * @author Calvin
 */
public class StackClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Check to see if it works using "assert"
        //assert (2+2 == 4); -- True    (WORKS!)
        //assert (2+1 == 4); -- False   (CRASHES!)
        
        StudentStack s = new StudentStack();

        //TEST CASE #1 - EMPTY STACK
        assert (s.peek() == null);
        assert (s.pop() == null);
        assert (s.size() == 0);
        assert (s.capacity() == StudentStack.DEFAULT_SIZE);
        assert (s.isEmpty());
        assert (!s.isFull());

        //TEST CASE #2 - FILL STACK!
        //fill stack first
        for (int studentCounter = 0; studentCounter < s.capacity(); studentCounter++) {
            Student stud = new Student(studentCounter);

            //PUSH!
            s.push(stud);

            assert (s.peek().getOen() == studentCounter);
            assert (s.size() == (studentCounter + 1));
            assert (s.capacity() == StudentStack.DEFAULT_SIZE);
            assert (!s.isEmpty());

            if (studentCounter == s.capacity() - 1) {
                assert (s.isFull());
            } else {
                assert (!s.isFull());
            }

        }

        //TEST CASE #3 - PUSH ON A FULL STACK
        assert (s.peek().getOen() == s.capacity() - 1);
        assert (s.size() == StudentStack.DEFAULT_SIZE);
        assert (s.capacity() == StudentStack.DEFAULT_SIZE);
        assert (!s.isEmpty());
        assert (s.isFull());       

        //TEST CASE #4 - EMPTY STACK
        for (int studentCounter = StudentStack.DEFAULT_SIZE - 1; studentCounter > 0; studentCounter--) {
            //PUSH!
            Student stud = s.pop();
            assert( stud.getOen() == studentCounter );
            
            assert (s.peek().getOen() == studentCounter - 1);
            assert (s.size() == (studentCounter));
            assert (s.capacity() == StudentStack.DEFAULT_SIZE);
            assert (!s.isFull());

            if (studentCounter == 0) {
                assert (s.isEmpty());
            } else {
                assert (!s.isEmpty());
            }

        }
        
        s.pop();

        //TEST CASE #5 - EMPTY STACK (DOES IT STILL WORK?)
        
        assert (s.peek() == null);
        assert (s.pop() == null);
        assert (s.size() == 0);
        assert (s.capacity() == StudentStack.DEFAULT_SIZE);
        assert (s.isEmpty());
        assert (!s.isFull());

        
        
//        /**
//     * Looks at the Student Object at the top of this stack without removing it.
//     *
//     * @return the Student at the top of this stack, or NULL if empty.
//     */
//    public Student peek();
//
//    /**
//     * Pops (remove) the Student Object at the top of this stack and returns the Student
//     * object as the value of this function.
//     *
//     * @return the Student Object at the top of this stack, or NULL if empty.
//     */
//    public Student pop();
//
//    /**
//     * Pushes (adds) the Student Object onto the top of this stack.
//     * @param value the Student to be put on the stack.
//     */
//    public void push( Student value );
//
//    /**
//     * Returns the number of Student Objects in the stack.
//     *
//     * @return the number of Student Objects in the stack, or ZERO if empty.
//     */
//    public int size();
//
//    /**
//     * Returns the current capacity of the Stack.
//     *
//     * @return the capacity of the stack; a fixed size.
//     */
//    public int capacity();
//
//    /**
//     * Tests if this stack is empty.
//     *
//     * @return true if there are no Student Objects, false if there is at least one.
//     */
//    public boolean isEmpty();
//
//    /**
//     * Tests if the Stack is full.
//     *
//     * @return true if the stack is full, false otherwise.
//     */
//    public boolean isFull();
//
//    /**
//     * The Stack will be empty after this method call.
//     */
//    public void makeEmpty();


    }

}
