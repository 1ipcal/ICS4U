package edu.hdsb.gwss.ics4u.u2;

import java.util.ArrayList;
import java.util.Scanner;

public class Lesson_ArrayList {

    public static void main(String[] args) {

        int[] data = {1, 2, 3, 4};
        String name = new String("Hello");
        String world = new String("World");

        ArrayList list = new ArrayList();

        list.add(1);
        list.add(2.2);
        list.add(name);
        list.add("3");
        list.add(new Scanner(System.in));
        //list.add( int Index, Object );
        list.add(1, 2.0);

//        System.out.println( list.size() );
//        System.out.println( list.get( 1 ) );
//        System.out.println( list.remove( 2) );
//        
//        System.out.println( list.contains(name) );
//        System.out.println( list.contains(world) );
//        
//        System.out.println( list.size() );
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //Adding stuff From an Array List
        String value = (String) list.get(3);
        System.out.println("Value: " + value);
    }

}
