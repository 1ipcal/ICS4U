/*
 * Name: Calvin Ip
 * Date: March 30, 2021
 * Version: 1.1
 * Description: This class uses a linked list system
 *           
 */
package edu.hdsb.gwss.ics4u.u5;

/**
 *
 * @author Calvin
 */
public class StudentLinkedList implements StudentLinkedListInterface {

    private StudentNode head;
    private StudentNode tail;

    public StudentLinkedList() {
    }

    @Override
    public void addFirst( Student value ) {
        if( value != null ) {

            // 
            StudentNode newNode = new StudentNode( value );

            if( isEmpty() ) {
                //Set Head and Tail to one object
                this.head = newNode;
                this.tail = newNode;
            } else {

                //Setup new object and links
                newNode.setNext( head );
                this.head.setPrevious( newNode );
                this.head = newNode;
            }

        }
        else {
            // STUDENT IS NULL!
            // DO FANCY CODE, 1000x lines.
        }
    }

    @Override
    public void addLast( Student value ) {
        //If null or empty, call addFirst since it has error checking there
        if( value == null || isEmpty() ) addFirst( value );
        else {
            StudentNode newNode = new StudentNode( value );

            //Setup new object and links
            this.tail.setNext( newNode );
            newNode.setPrevious( tail );
            this.tail = newNode;

        }
        
    }

    @Override
    public Student removeFirst() {
        if( isEmpty() ) return null;
        
        //Store Object to be removed
        Student s = getFirst();
        
        if( size() == 1 ) {
            makeEmpty();
        }
        else {

            //Temp Variable Reference
            StudentNode toDelete = head;
            
            //Set New Head
            head = toDelete.getNext();
            
            //Remove Dangling Links
            head.setPrevious( null );
            toDelete.setNext( null );

        }
        
        return s;
    }

    @Override
    public Student removeLast() {
        //Store Object to be removed
        Student s = getLast();
        
        if ( isEmpty() || size() == 1){
            return removeFirst();
        }
        else{
            //Temp Variable Reference
            StudentNode toDelete = tail;
            
            //Set New Tail
            tail = toDelete.getPrevious();
            
            //Remove Dangling Links
            tail.setNext( null );
            toDelete.setPrevious( null );
            
        }
        
        return s;
    }

    @Override
    public Student getFirst() {
        return this.head.getValue();
    }

    @Override
    public Student getLast() {
        return this.tail.getValue();
    }

    @Override
    public int size() {
        StudentNode n = head;
        int counter = 0;
        while( n != null ) {
            counter++;
            
            n = n.getNext();
        }
        
        return counter;
    }

    @Override
    public boolean isEmpty() {
        return this.head == null;
    }

    @Override
    public void makeEmpty() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public boolean remove( Student value ) {
        boolean removed = false;
        if( value != null && !isEmpty() ) {
            
            StudentNode toDelete = null;
            StudentNode n = head;
            
            while( n != null && toDelete == null ) {
                
                // IS THIS THE STUDENT TO REMOVE?
                if( value.getOen() == n.getValue().getOen() ) {
                    // FOUND!
                    toDelete = n;
                }
                else {
                    n = n.getNext();
                }
            }
            
            // NOT FOUND!  or FOUND!
            if( toDelete != null ) {  
                
                if (toDelete == head){
                    //Checks if we are deleting the head
                    this.removeFirst();
                } else if (toDelete == tail){
                    //Checks if we are deleting the tail
                    this.removeLast();
                } else {
                    //Regular Deleting
                    
                    //Setup links with Previous object to Next Object
                    toDelete.getPrevious().setNext( toDelete.getNext() );
                    
                    //Setup links with Next object to Previous Object
                    toDelete.getNext().setPrevious( toDelete.getPrevious() );
                    
                    //Set Removed object pointers to null
                    toDelete.setPrevious( null );
                    toDelete.setNext( null );
                }
                
                //Removed == TRUE
                removed = true;
                
            }
            
        }
        return removed;
    }

    //CHANGE LATER
    public String toString() {
        String s = "";
        
        StudentNode n = head;
        while( n != null ) {
            s = s + n.getValue() + "\n";
            
            n = n.getNext();
        }
        
        return s;

    }

}
