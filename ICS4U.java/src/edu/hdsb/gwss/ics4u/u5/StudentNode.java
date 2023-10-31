/**
 * Student Node.
 *
 * @author Wm.Muir
 * @version 2020-21.Q3
 */
package edu.hdsb.gwss.ics4u.u5;

/**
 * TODO
 */
public class StudentNode implements StudentNodeInterface {

    private Student value;
    private StudentNode next;
    private StudentNode previous;

    public StudentNode() {
        this.value = null;
        this.next = null;
        this.previous = null;
    }

    public StudentNode( Student data ) {
        this.value = data;
    }
    
    @Override
    public StudentNode getNext() {
        return this.next;
    }

    @Override
    public void setNext( StudentNode node ) {
        this.next = node;
    }

    @Override
    public StudentNode getPrevious() {
        return this.previous;
    }

    @Override
    public void setPrevious( StudentNode node ) {
        this.previous = node;
    }

    @Override
    public Student getValue() {
        return this.value;
    }
    
    

}
