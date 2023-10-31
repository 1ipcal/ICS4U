/**
 * Generate all west-to-east paths, find the one with the lowest total
 * elevation change, and return the index of the row that path starts on.
 *
 * @param grid - the 2D array of elevation values
 * @return the index of the row where the lowest elevation-change path
 * starts.
 */
public int indexOfLowestElevPath( int[][] data ) {
  int indexLowestPath = 0;
  int lowestTotalChange = Integer.MAX_VALUE;
  int totalChange;
  
  for(int row = 0; row < data.length; row++){
    totalChange = drawLowestElevPath( data, row );
    
    if ( totalChange < lowestTotalChange ) {
      lowestTotalChange = totalChange;
      indexLowestPath = row;
    }
  }
  
  return indexLowestPath;
  
}
