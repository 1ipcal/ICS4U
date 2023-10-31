/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u.u6;

import java.io.File;

/**
 *
 * @author Calvin
 */
public class DBClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("VGRecord.dat", "rw");
        file.delete();

        VideoGameRecord vg1 = new VideoGameRecord("Pokemon Let's Go", "Nintendo Switch", "RPG", 79.99, true, 13000000, 50, 'B');
        VideoGameRecord vg2 = new VideoGameRecord("Persona 5 Royal", "PS5", "RPG", 79.99, true, 1400000, 20, 'A');

        VideoGameDB.open();

//        VideoGameDB.save(vg1);
//        System.out.println( vg1.toString() );
//        VideoGameDB.save(vg2);
//        System.out.println( vg2.toString() );

        VideoGameRecord vg = VideoGameDB.read(2);   
        
        System.out.println(vg.toString());
        
        vg.setName("Persona 5 Royal");
        VideoGameDB.save(vg);
        
        System.out.println(VideoGameDB.read(2));
        
        VideoGameDB.close();
    }

}
