/*
 * Name: Calvin Ip
 * Date: March 21, 2021
 * Version: 1.0
 * Description: This class will simulate a combination lock game
 *           
 */
package edu.hdsb.gwss.ics4u.u4.creator;

/**
 *
 * @author Calvin
 */
public class CombinationLock {
    //Instance Variables
    private String code;

    public CombinationLock(String password) {
        this.code = password;
    }
    
    public String getClue(String inputCode){
        String data[] = new String[4];
        
        for (int counter = 0; counter < 4; counter++) {
            //If Letter is the same
            if (code.charAt(counter) == inputCode.charAt(counter)) {
                data[counter] = "" + code.charAt(counter);
            } 
            //If Letter Apears in the code elsewhere
            else if (inputCode.charAt(counter) == code.charAt(1) || inputCode.charAt(counter) == code.charAt(2) || inputCode.charAt(counter) == code.charAt(3) || inputCode.charAt(counter) == code.charAt(1)) {
                data[counter] = "+";
            } 
            //If letter does not apear in the code
            else {
                data[counter] = "*";
            }
        }
        
        return data[0] + data[1] + data[2] + data[3] ;
    }
}
