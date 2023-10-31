/**
 * Node Interface.
 *
 * @author Wm.Muir
 * @version 2020-21.Q3
 */
package edu.hdsb.gwss.ics4u.u5;

public interface StudentNodeInterface {

    /**
     * The node pointed to by 'next' is returned
     */
    public StudentNode getNext();

    /**
     * The node pointed to by 'next' is changed to node
     */
    public void setNext( StudentNode node );

    /**
     * The node pointed to by 'previous' is returned
     */
    public StudentNode getPrevious();

    /**
     * The node pointed to by 'previous' is changed to node
     */
    public void setPrevious( StudentNode node );

    /**
     * The value (Student Object) of the node.
     */
    public Student getValue();

}
