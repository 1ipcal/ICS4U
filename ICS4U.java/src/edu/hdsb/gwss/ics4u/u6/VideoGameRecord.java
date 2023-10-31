/*
 * Name: Calvin Ip
 * Date: March 22, 2021
 * Version: 1.0
 * Description: This class will hold a record for information about a video game
 *           
 */
package edu.hdsb.gwss.ics4u.u6;

/**
 *
 * @author Calvin
 */
public class VideoGameRecord {

    //CLASS CONSTANTS
    //Include class size by calcuating max byte in one record
    public static final int VIDEO_GAME_RECORD_SIZE = 173;
    public static final int LENGTH_NAME = 40;
    public static final int LENGTH_SYSTEM = 15;
    public static final int LENGTH_GENRE = 20;

    //CLASS VARIABLES
    //OBJECT VARIABLES / INSTANCE VARIABLES
    private String name;        //2 bytes(1char) * 40 length = 80 bytes
    private String system;      //2 bytes(1char) * 15 length = 30 bytes
    private String genre;       //2 bytes(1char) * 20 length = 40 bytes
    private double price;       //8 Bytes
    private boolean released;   //1 Bytes
    private int sold;           //4 Bytes
    private int rank;           //4 Bytes
    private char grade;         //2 Bytes

    //Total: 169 Bytes
    
    private int id;             //4 Bytes
    
    //Total: 173

    public VideoGameRecord() {

    }
    
    public VideoGameRecord(int id){
        this.id = id;
    }

    public VideoGameRecord(String name, String system, String genre, double price, boolean released, int sold, int rank, char grade) {
        this.setName(name);
        this.setSystem(system);
        this.setGenre(genre);
        this.price = price;
        this.released = released;
        this.sold = sold;
        this.rank = rank;
        this.grade = grade;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        StringBuilder temp = new StringBuilder();

        if (name != null) {
            temp.append(name.trim());
        } else {
            temp.append("TBD");
        }

        // trucates or pads the string
        temp.setLength(LENGTH_NAME);
        this.name = temp.toString();

    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        StringBuilder temp = new StringBuilder();

        if (system != null) {
            temp.append(system.trim());
        } else {
            temp.append("TBD");
        }

        // trucates or pads the string
        temp.setLength(LENGTH_SYSTEM);
        this.system = temp.toString();

    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        StringBuilder temp = new StringBuilder();

        if (genre != null) {
            temp.append(genre.trim());
        } else {
            temp.append("TBD");
        }

        // trucates or pads the string
        temp.setLength(LENGTH_GENRE);
        this.genre = temp.toString();

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isReleased() {
        return released;
    }

    public void setReleased(boolean released) {
        this.released = released;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
    
    public boolean isValid(){
       if(this.name == null || this.name.length() == 0){
           return false;
       } 
       if(this.system == null || this.system.length() == 0){
           return false;
       } 
       if(this.genre == null || this.genre.length() == 0){
           return false;
       } 
       
       
       return true;
    }

    @Override
    public String toString() {
        return "VideoGameRecord{" +"id=" + id + ", name=" + name + ", system=" + system + ", genre=" + genre + ", price=" + price + ", released=" + released + ", sold=" + sold + ", rank=" + rank + ", grade=" + grade + '}';
    }

}
