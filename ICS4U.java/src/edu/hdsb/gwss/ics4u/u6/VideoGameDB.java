/*
 * Name: Calvin Ip
 * Date: April 5, 2021
 * Version: 1.2
 * Description: This program is a Video Game Database 
 *           
 */
package edu.hdsb.gwss.ics4u.u6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VideoGameDB {

    //Instance Variables
    private static RandomAccessFile raf;

    //Open Database
    public static void open() {
        try {
            raf = new RandomAccessFile("VGRecord.dat", "rw");
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR; File Not Found");
        }
    }

    //Close Database
    public static void close() {
        try {
            raf = new RandomAccessFile("VGRecord.dat", "rw");
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR; Unable to close File");
        }
    }

    private static boolean isOpen() {
        try {
            if (raf.getFD().valid()) {
                return true;
            }
        } catch (IOException ex) {
            Logger.getLogger(VideoGameDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public static VideoGameRecord read(int id) {
        VideoGameRecord vg = null;

        try {
            //Count the Number of Records
            int numRecords = getNumberOfRecords();

            if (id < 1 || id > numRecords) {

            } else {

                if (!isOpen()) {
                    open();
                }

                vg = new VideoGameRecord(id);

                //Move Pointer
                raf.seek(vg.VIDEO_GAME_RECORD_SIZE * (id - 1));

                //Set ID
                vg.setid(raf.readInt());

                //Set Video Game Name
                char videoGameName[] = new char[vg.LENGTH_NAME];
                for (int i = 0; i < vg.LENGTH_NAME; i++) {
                    videoGameName[i] = raf.readChar();
                }
                vg.setName(new String(videoGameName));

                //Set System Name
                char videoGameSystem[] = new char[vg.LENGTH_SYSTEM];
                for (int i = 0; i < vg.LENGTH_SYSTEM; i++) {
                    videoGameSystem[i] = raf.readChar();
                }
                vg.setSystem(new String(videoGameSystem));

                //Set Genre 
                char videoGameGenre[] = new char[vg.LENGTH_GENRE];
                for (int i = 0; i < vg.LENGTH_GENRE; i++) {
                    videoGameGenre[i] = raf.readChar();
                }
                vg.setGenre(new String(videoGameGenre));

                //Set Price
                vg.setPrice(raf.readDouble());

                //Set Released?
                vg.setReleased(raf.readBoolean());

                //Set Sold
                vg.setSold(raf.readInt());

                //Set Rank
                vg.setRank(raf.readInt());

                //Set Grade
                vg.setGrade(raf.readChar());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return vg;
    }

    public static void save(VideoGameRecord vg) {
        if (vg == null || !vg.isValid()) {
            System.out.println("INVALID OBJECT");
            return;
        }

        try {
            if (!isOpen()) {
                open();
            }

            //Move Pointer
            if (vg.getid() > 0) {
                //Update
                raf.seek(vg.VIDEO_GAME_RECORD_SIZE * (vg.getid() - 1));
            } else {
                //Add
                raf.seek(raf.length());
                
                //ID
                int id = (int) (raf.length() / VideoGameRecord.VIDEO_GAME_RECORD_SIZE);
                vg.setid(id + 1);
            }

            //Save it
            raf.writeInt(vg.getid());
            raf.writeChars(vg.getName());
            raf.writeChars(vg.getSystem());
            raf.writeChars(vg.getGenre());
            raf.writeDouble(vg.getPrice());
            raf.writeBoolean(vg.isReleased());
            raf.writeInt(vg.getSold());
            raf.writeInt(vg.getRank());
            raf.writeChar(vg.getGrade());
            System.out.println(raf.length());    

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
    
    public static int getNumberOfRecords(){
        try{
            return (int) raf.length() / VideoGameRecord.VIDEO_GAME_RECORD_SIZE;
        } catch(IOException ex) {
            ex.printStackTrace();
        }
        
        return -1;
        
    }

}
