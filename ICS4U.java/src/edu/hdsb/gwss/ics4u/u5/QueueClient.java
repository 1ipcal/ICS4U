/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.u5;

/**
 *
 * @author ICS4U-Calvin
 */
public class QueueClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Check to see if it works using "assert"
        //assert (2+2 == 4); -- True    (WORKS!)
        //assert (2+1 == 4); -- False   (CRASHES!)

        StudentQueue s = new StudentQueue();

        //TEST CASE #1 - EMPTY Queue
        assert (s.peek() == null);
        assert (s.dequeue() == null);
        assert (s.size() == 0);
        assert (s.capacity() == StudentQueue.DEFAULT_SIZE);
        assert (s.isEmpty());
        assert (!s.isFull());

        //TEST CASE #2 - FILL Queue!
        //fill queue first
        for (int studentCounter = 0; studentCounter < s.capacity(); studentCounter++) {
            Student stud = new Student(studentCounter);

            //ENQUEUE!
            System.out.println("");
            System.out.println("ENQUEUE!");

            s.enqueue(stud);

            System.out.println("size: " + s.size());
            System.out.println("counter: " + studentCounter);
            System.out.println(s.peek().getOen());
            System.out.println("");

            //assert (s.peek().getOen() == studentCounter);
            assert (s.size() == (studentCounter + 1));
            assert (s.capacity() == StudentStack.DEFAULT_SIZE);
            assert (!s.isEmpty());

            if (studentCounter == s.capacity() - 1) {
                assert (s.isFull());
            } else {
                assert (!s.isFull());
            }

        }

    }

}
