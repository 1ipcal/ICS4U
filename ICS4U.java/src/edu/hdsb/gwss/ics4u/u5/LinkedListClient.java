package edu.hdsb.gwss.ics4u.u5;

public class LinkedListClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        StudentLinkedList l = new StudentLinkedList();
        
        l.addFirst( new Student( "S2", "S2" ) );
        l.addFirst( new Student( "S1", "S1" ) );
        System.out.println( l.size() );
//        System.out.println( l.removeLast().getFirstName() );
//        System.out.println( l.getFirst().getFirstName() );
        
//        l.addFirst(new Student("S3", "S3"));
//        l.addFirst(new Student("S2", "S2"));
//        l.addFirst(new Student("S1", "S1"));
//        l.addLast(new Student("S4", "S4"));

//        System.out.println(l.toString());
//
//        System.out.println(l.size());
//
//        System.out.println(l.getFirst());
//        System.out.println(l.getLast());
//
//        System.out.println(l.removeFirst());
//        
//
//        System.out.println(l.toString());

//        System.out.println( l.toString());
//        System.out.println( l.remove( l.getLast() ));
//        System.out.println( l.remove( l.getFirst() ));
//        System.out.println( l.toString());

        //System.out.println( l.remove( l.getFirst() ) );
        
        System.out.println( l );
    }

}
