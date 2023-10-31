/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.u4.client;

import edu.hdsb.gwss.ics4u.u4.creator.CombinationLock;
import java.util.Scanner;

/**
 *
 * @author Calvin
 */
public class Sandbox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean n = true;
        Scanner input = new Scanner(System.in);
        
       CombinationLock L1 = new CombinationLock("frog");
       
       while (n){
           System.out.println( L1.getClue( input.nextLine() ) );
           
       }
    }
    
}
