/**
 * Queue (of Students) Interface.
 *
 * @author Wm.Muir
 * @version 2020-21.Q3
 */
package edu.hdsb.gwss.ics4u.u5;

public interface StudentQueueInterface {
    
    /**
     * Retrieves, but does not remove, the head of this queue, or returns null 
     * if this queue is empty.
     * 
     * @return the head of this queue, or null if this queue is empty
     */
    public Student peek();
       
    /**
     * Inserts the Student object into this queue, if space is available.
     * @param value 
     */
    public void enqueue( Student value );

    /**
     * Retrieves and removes the head of this queue.
     * @return the head of this queue, or NULL if the queue is empty.
     */
    public Student dequeue();

    /**
     * Returns the number of Student Objects in the queue.
     *
     * @return the number of Student Objects in the queue, or 0 if the queue is empty.
     */
    public int size();

    /**
     * Returns the capacity of the queue.
     *
     * @return queue capacity
     */
    public int capacity();

    /**
     * Determines if the queue is empty.
     *
     * @return returns true if the queue is empty
     */
    public boolean isEmpty();

    /**
     * Tests if the Queue is full.
     *
     * @return returns true if the queue is full
     */
    public boolean isFull();

    /**
     * The Queue will be empty after this call returns.
     */
    public void makeEmpty();

}