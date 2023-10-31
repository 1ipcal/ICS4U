/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.u4.client;

import edu.hdsb.gwss.ics4u.u4.creator.Account;

/**
 *
 * @author Calvin
 */
public class ClientCodeLesson2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Account a = new Account();
        a.setCurrency( "sdafsfhdasfjdas");
        
                
        System.out.println( a.getPin() );
        System.out.println( a.getBalance() );
        System.out.println( a.getCurrency());
    }
    
}
