/**
 * Search a single column of a 2D array and return the index of the row that
 * contains the smallest value
 *
 * @param grid a 2D array
 * @col the column in the 2D array to process
 * @return the index of smallest value from grid at the given col
 */
public static int indexOfMinInCol(int[][] data, int col) {

  int row = 0;
  int min = Integer.MAX_VALUE;
  
  for(int r = 0; r < data.length; r++){
    //Checks for the smallest value (min) and stores the index value if true
    if(data[r][col] < min){
      min = data[r][0];
      row = r;
    }
  }
  
  return row;
  
}
