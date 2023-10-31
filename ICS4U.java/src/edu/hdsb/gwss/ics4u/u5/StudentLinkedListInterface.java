/**
 * Student Linked List Interface.
 *
 * @author Wm.Muir
 * @version 2020-21.Q3
 */
package edu.hdsb.gwss.ics4u.u5;

public interface StudentLinkedListInterface {

    /**
     * Inserts the specified Student Object at the beginning of this list.
     *
     * @param value the Student Object to add
     */
    public void addFirst( Student value );

    /**
     * Inserts the specified Student Object at the end of this list.
     *
     * @param value the Student Object to add
     */
    public void addLast( Student value );

    /**
     * Retrieves and removes the head (first element) of this list.
     *
     * @return the first element from this list, null if the list is empty
     */
    public Student removeFirst();

    /**
     * Removes and returns the last element from this list.
     *
     * @return the last element from this list, null if the list is empty
     */
    public Student removeLast();

    /**
     * Returns the first element in this list.
     * 
     * @return the first element from this list, null if the list is empty
     */
    public Student getFirst();

    /**
     * Returns the last element in this list.
     * 
     * @return the last element from this list, null if the list is empty
     */
    public Student getLast();

    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements in this list.
     */
    public int size();

    /**
     * Returns true if the list contains no elements.
     *
     * @return true if this list contains no elements.
     */
    public boolean isEmpty();

    /**
     * The Linked List will be empty after this call returns.
     */
    public void makeEmpty();
    
    /**
     * Removes the first occurrence of the specified element from this list, if it is present. 
     * If this list does not contain the element, it is unchanged. 
     * More formally, removes the element with the lowest index i such that
     * Objects.equals(o, get(i)) (if such an element exists). 
     * 
     * Returns true if this list contained the specified element (or equivalently, 
     * if this list changed as a result of the call).
     * 
     * @return true if this list contained the specified element
     */
    public boolean remove( Student value );

    /**
     * Creates a String that lists the nodes of the linked list.
     *
     * Head --> A --> B -- > C --> Tail
     *
     * @return string
     */
    @Override
    public String toString();

}
