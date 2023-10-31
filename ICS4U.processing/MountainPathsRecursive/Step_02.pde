/**
 * MINIMUM VALUE
 *
 * @param data a 2D array from which you want to find the minimum value
 * @return the minimum value in the given 2D Array
 */
public static int findMin( int[][] data ) {
  //Set highest value
  int min = Integer.MAX_VALUE;
  
  for(int r = 0; r < data.length; r++){
      for(int c = 0; c < data[r].length; c++){
        
        //If value is lower than min, change min to be the value
        if (data[r][c] < min){
          min = data[r][c];
        }
        
      }
    }

  return min;
  
}

/**
 * MAXIMUM VALUE
 *
 * @param data a 2D array from which you want to find the minimum value
 * @return the minimum value in the given 2D Array
 */
public static int findMax( int[][] data ) {
  //Sets lowest value
  int max = 0;
  
  for(int r = 0; r < data.length; r++){
      for(int c = 0; c < data[r].length; c++){
        
        //If value is higher than max, change max to be the value
        if (data[r][c] > max){
          max = data[r][c];
        }
        
      }
    }

  return max;
  
}
