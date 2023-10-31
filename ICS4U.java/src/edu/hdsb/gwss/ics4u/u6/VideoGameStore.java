/*
 * Name: Calvin Ip
 * Date: March 8, 2021
 * Version: 0.1
 * Description: This program will read and write a Random Access File (RAF) 
 *           
 */
package edu.hdsb.gwss.ics4u.u6;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class VideoGameStore {

    public static void main(String[] args) throws Exception {
        //Objects
        long position, recordNumber;
        Scanner input = new Scanner(System.in);

        File file = new File ("VGRecord.dat", "rw");
        file.delete();
        
        RandomAccessFile raf = new RandomAccessFile("VGRecord.dat", "rw");

        VideoGameRecord v1 = new VideoGameRecord("Pokemon Let's Go", "Nintendo Switch", "RPG", 79.99, true, 13000000, 50, 'B');
        VideoGameRecord v2 = new VideoGameRecord("Persona 5 Royal", "PS5", "RPG", 79.99, true, 1400000, 20, 'A');
        VideoGameRecord v3 = new VideoGameRecord("Minecraft: Java Edition", "PC", "Survival", 35.00, true, 30000000, 5, 'A');

        VideoGameRecord vRecord = new VideoGameRecord();

        //Variable List (For Notes only)
//      private String name;
//      private String system;
//      private String genre;
//      private double price;
//      private boolean released;
//      private int sold;
//      private int rank;
//      private char grade;

        //Write (Game 1)
        raf.seek(0);
        raf.writeInt(v1.getid());
        raf.writeChars(v1.getName());
        raf.writeChars(v1.getSystem());
        raf.writeChars(v1.getGenre());
        raf.writeDouble(v1.getPrice());
        raf.writeBoolean(v1.isReleased());
        raf.writeInt(v1.getSold());
        raf.writeInt(v1.getRank());
        raf.writeChar(v1.getGrade());

        //Testing
        System.out.println(raf.length());
        System.out.println(v1.toString());

        //Write (Game 2)
        raf.writeInt(v1.getid());
        raf.writeChars(v2.getName());
        raf.writeChars(v2.getSystem());
        raf.writeChars(v2.getGenre());
        raf.writeDouble(v2.getPrice());
        raf.writeBoolean(v2.isReleased());
        raf.writeInt(v2.getSold());
        raf.writeInt(v2.getRank());
        raf.writeChar(v2.getGrade());

        //Testing
        System.out.println(raf.length());
        System.out.println(v2.toString());

        //Write (Game 3)
        raf.writeInt(v1.getid());
        raf.writeChars(v3.getName());
        raf.writeChars(v3.getSystem());
        raf.writeChars(v3.getGenre());
        raf.writeDouble(v3.getPrice());
        raf.writeBoolean(v3.isReleased());
        raf.writeInt(v3.getSold());
        raf.writeInt(v3.getRank());
        raf.writeChar(v3.getGrade());

        //Testing
        System.out.println(raf.length());
        System.out.println(v3.toString());

        //Reading
        long numRecords = raf.length() / vRecord.VIDEO_GAME_RECORD_SIZE;
        System.out.println("\nThere are " + numRecords + " records currently in the file.");

        //User Input to Get File
        System.out.println("Which record do you want [1 - " + numRecords + "] or 0 to exit?");
        recordNumber = input.nextLong();

        while (recordNumber != 0) {
            //Set File Position
            position = vRecord.VIDEO_GAME_RECORD_SIZE * (recordNumber - 1);
            raf.seek(position);

            //Set ID
            vRecord.setid(raf.readInt());
            
            //Set Video Game Name
            char videoGameName[] = new char[vRecord.LENGTH_NAME];
            for (int i = 0; i < vRecord.LENGTH_NAME; i++) {
                videoGameName[i] = raf.readChar();
            }
            vRecord.setName(new String(videoGameName));

            //Set System Name
            char videoGameSystem[] = new char[vRecord.LENGTH_SYSTEM];
            for (int i = 0; i < vRecord.LENGTH_SYSTEM; i++) {
                videoGameSystem[i] = raf.readChar();
            }
            vRecord.setSystem(new String(videoGameSystem));

            //Set Genre 
            char videoGameGenre[] = new char[vRecord.LENGTH_GENRE];
            for (int i = 0; i < vRecord.LENGTH_GENRE; i++) {
                videoGameGenre[i] = raf.readChar();
            }
            vRecord.setGenre(new String(videoGameGenre));

            //Set Price
            vRecord.setPrice(raf.readDouble());

            //Set Released?
            vRecord.setReleased(raf.readBoolean());

            //Set Sold
            vRecord.setSold(raf.readInt());

            //Set Rank
            vRecord.setRank(raf.readInt());

            //Set Grade
            vRecord.setGrade(raf.readChar());

            //Print out Record
            System.out.println("Record number " + recordNumber + ": ");
            System.out.println(vRecord.toString());

            //prompt for additional record to retrieve
            System.out.println("\nThere are " + numRecords + " records currently in the file.");
            System.out.println("Which record do you want [1 - " + numRecords + "] or 0 to exit?");
            recordNumber = input.nextLong();

        }

        raf.close();

    }

}
