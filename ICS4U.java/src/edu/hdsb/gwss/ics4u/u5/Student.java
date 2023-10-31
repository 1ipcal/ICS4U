/**
 * Student Class
 *
 * @author Wm.Muir
 * @version 2020-21.Q1
 */
package edu.hdsb.gwss.ics4u.u5;

/**
 */
public class Student {
    
    // CLASS VARIABLES
    private static int lastID = 0;
    
    // INSTANCE VARIABLES
    private long oen;
    private int grade;
    private String firstName;
    private String lastName;
    private boolean communityHours;
    private boolean passedOSSLT;

    public Student() {
        this.oen = ++lastID;
    }

    public Student( long oen ) {
        this.oen = oen;
    }

    public Student( String firstName, String lastName ) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static int getLastID() {
        return lastID;
    }

    public static void setLastID( int lastID ) {
        Student.lastID = lastID;
    }

    public long getOen() {
        return oen;
    }

    public void setOen( long oen ) {
        this.oen = oen;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade( int grade ) {
        this.grade = grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName( String firstName ) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName( String lastName ) {
        this.lastName = lastName;
    }

    public boolean hasCommunityHours() {
        return communityHours;
    }

    public void setCommunityHours( boolean communityHours ) {
        this.communityHours = communityHours;
    }

    public boolean hasPassedOSSLT() {
        return passedOSSLT;
    }

    public void setPassedOSSLT( boolean passedOSSLT ) {
        this.passedOSSLT = passedOSSLT;
    }

    @Override
    public String toString() {
        return "Student{" + "oen=" + oen + ", grade=" + grade + ", firstName=" + firstName + ", lastName=" + lastName + ", communityHours=" + communityHours + ", passedOSSLT=" + passedOSSLT + '}';
    }
  
}
