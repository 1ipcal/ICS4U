/**
 * This method reads a 2D data set from the specified file. The Graphics'
 * industry standard is width by height (width x height), while programmers
 * use rows x cols / (height x width).
 *
 * @param fileName the name of the file
 * @return a 2D array (rows x cols) of the data from the file read
 */
 
import java.util.*;
import java.io.File;
import java.util.StringTokenizer;
import java.util.Scanner;

public static int[][] readData( String fileName ) {
  //Objects
  File file = new File (fileName);
  StringTokenizer st;
  
  //Variables
  int[][] data;
  int rowCount = 0, colCount = 0;

  try {

    // YOUR CODE
    Scanner input = new Scanner(file);
    
    //Counts the Rows and Cols
    while (input.hasNextLine() ) {
      st = new StringTokenizer( input.nextLine() );
    
      colCount = st.countTokens();
      rowCount++;
    
    }//End of While Loop
    
    input.close();
    
    data = new int[rowCount][colCount];
    
    //Add Data to Array
    input = new Scanner(file);

    for(int r = 0; r < data.length; r++){
      st = new StringTokenizer( input.nextLine() );
        
      for(int c = 0; c < data[r].length; c++){
        data[r][c] = Integer.parseInt( st.nextToken() );
      }
    }

    input.close();
    
  } //End Try
  
  catch (Exception e ) {
    println( "STEP 01 - Exception" );
    e.printStackTrace();
    data = null;
  }

  return data;
}
