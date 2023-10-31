/**
 * Mountain Paths - v2020
 * Name: Calvin Ip
 * Date: 3/7/2021
 * Version: 1.1
 * Description: This program will store elevation heights into a huge data array in order to draw a map.
 *              Then it will perform the "Greedy" algorithm to find the path of lowest elevation change
 */

void setup() {

  // SCREEN SIZE - Match Data Size
  size( 844, 480 );

  // NO LOOP
  noLoop();

  // ***********************************
  // TASK 1:  READ data into a 2D Array
  // 
  println("TASK 1: READ DATA");
  int[][] data = readData( dataPath("") + "\\" + "Colorado.844x480.dat");


  // ***********************************
  // TASK 2:  find HIGHEST & LOWEST elevation; for GRAY SCALE
  //
  System.out.println("TASK 2: HIGHEST / LOWEST ELEVATION");
  int min = findMin( data );
  println("\tMin: " + min);

  int max = findMax( data );
  println("\tMax: " + max);


  // ***********************************
  // TASK 3:  Draw The Map
  //
  System.out.println("TASK 3: DRAW MAP");
  drawMap( data, min, max );


  // ***********************************
  // TASK 4:  implement indexOfMinInCol
  //
  System.out.println("TASK 4: INDEX OF MIN IN COL 0");
  int minRow = indexOfMinInCol(data, 0);
  println("\tRow with lowest elevation in column 0 : " + minRow);


  // ***********************************
  // TASK 5:  use minRow as starting point to draw path
  //
  
  //Set Colour to Blue
  fill(0, 0, 255);
  
  System.out.println("TASK 5: PATH from LOWEST STARTING ELEVATION");
  int totalChange = drawLowestElevPath( data, minRow); //
  System.out.println("\tLowest-Elevation-Change Path starting at row " + minRow + " gives total change of: " + totalChange);


  // ***********************************
  // TASK 6:  determine the BEST path
  //
  int bestRow = indexOfLowestElevPath( data );
  

  // ***********************************
  // TASK 7:  draw the best path
  //
  
  //Set Colour to Green (for Best Path)
  fill(0, 255, 0);
  
  System.out.println("TASK 6: DRAW BEST PATH");
  totalChange = drawLowestElevPath( data, bestRow );
  System.out.println("\tThe Lowest-Elevation-Change Path starts at row: " + bestRow + " and gives a total change of: " + totalChange);
  
  
}
