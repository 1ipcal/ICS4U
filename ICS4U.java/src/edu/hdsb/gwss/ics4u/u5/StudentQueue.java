/*
 * Name: Calvin Ip
 * Date: March 26, 2021
 * Version: 1.1
 * Description: This class uses a Queue data system
 *           
 */
package edu.hdsb.gwss.ics4u.u5;

public class StudentQueue implements StudentQueueInterface {

    //CONSTANTS
    public static final int DEFAULT_SIZE = 11;

    //INSTANCE VARIABLES
    private int front;
    private int back;
    private Student[] queue;

    public StudentQueue() {
        this(DEFAULT_SIZE);
    }

    public StudentQueue(int size) {
        this.makeEmpty();
        this.queue = new Student[size];
    }

    @Override
    public Student peek() {
        //Checks if empty
        if (this.isEmpty()) {
            return null;
        } //Else return front of the queue
        else {
            return queue[front];
        }

    }

    @Override
    public void enqueue(Student value) {
        //Checks to see is full. If not, enqueue (Also checks if null)
        if (!this.isFull() && value != null) {
            //Special case. If previously empty, set front to index 0
            if (this.isEmpty()){
                front = 0;
            }
            
            //Adds 1 to back, will loop around if it goes over capacity. Then adds value to the back index in the array
            back = (back + 1) % this.capacity();
            queue[back] = value;
        }
    }

    @Override
    public Student dequeue() {
        //Temp store obeject
        Student value = this.peek();

        //Checks if empty
        if (this.isEmpty()) {
            return null;
        } //Else if the queue only has one object
        else if (this.size() == 1) {
            this.makeEmpty();
            return value;
        } else {
            //Stores into temp variable and moves front 1. If its greater than capacity, it wraps around by modding by capacity
            front = (front + 1) % this.capacity();

            return value;
        }
    }

    @Override
    public int size() {
        //Case #1 (EMPTY)
        if ((front == -1) && (back == -1)) {
            return 0;
        }
        //Case #2 Back > Front
        if (back > front){
            return (back - front) + 1;
        }
        //Case #3 Back < Front
        if (front > back){
            return ( (back + this.capacity()) - front ) + 1;
        }
        
        return (back - front) + 1;
    }

    @Override
    public int capacity() {
        //Capacity == default length
        return this.queue.length;
    }

    @Override
    public boolean isEmpty() {

        //Checks size to see if empty (0)
        return this.size() == 0;
    }

    @Override
    public boolean isFull() {
        //Compares the size witht the default capacity
        return this.size() == this.capacity();
    }

    @Override
    public void makeEmpty() {
        //Sets and force front and back to -1 (Empty)
        this.front = -1;
        this.back = -1;
    }

}
