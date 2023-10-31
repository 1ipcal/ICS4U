/*
 * EXAMPLE EXAMPLE EXAMPLE EXAMPLE
 */
package edu.hdsb.gwss.ics4u.u4.creator;

/**
 *
 * @author ICS4U-Calvin
 */
public class VideoGame {
    //CLASS CONSTANTS
    //CLASS VARIABLES

    //Object Variables / Instance Variables
    private String name;
    private String system;
    private String genre;
    private double price;
    private boolean released;
    private int sold;
    private int rank;

    public VideoGame() {
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0.0){
            System.out.println("ERROR: PRICE HAS TO BE GREATER THAN 0");
        } else{
            this.price = price;
        }
        
    }

    public boolean isReleased() {
        return released;
    }

    public void setReleased(boolean released) {
        this.released = released;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "VideoGame{" + "name=" + name + ", system=" + system + ", genre=" + genre + ", price=" + price + ", released=" + released + ", sold=" + sold + ", rank=" + rank + '}';
    }

}
