/**
 * Find the minimum elevation-change route from West-to-East in the given
 * grid, from the given starting row, and draw it using the given graphics
 * context
 *
 * @param data - the 2D array of elevation values
 * @param row - the starting row for traversing to find the min path
 * @return total elevation of the route
 */

public int drawLowestElevPath( int[][] data, int row, int col ) {
  int top, mid, bot;
  
  //Colour pixel
  noStroke();
  rect(col, row, 1, 1);
  
  //Base Case
  if (col == data[0].length-1) return 0;
  
  //Mid Calculation
  mid = Math.abs( data[row][col+1] - data[row][col] );
  
  //If row is at the top:
  if (row == 0){
    
    //Calculate elevation changes
    bot = Math.abs( data[row+1][col+1] - data[row][col] );
    
    //Compares both the next Middle and Bottom, Compares elevation changes and act acordingly
    
    if(mid <= bot){
        //If the middle is less than or equal to the bottom, next go straight
        return Math.abs( data[row][col+1] - data[row][col] ) + drawLowestElevPath(data, row, col+1);
      }
      else if(bot < mid){
        //If the bottom is less than middle
        return Math.abs( data[row+1][col+1] - data[row][col] ) + drawLowestElevPath(data, row+1, col+1);
      }
      
  } //End of Top Check
  
  //If the point is on the bottom
  if (row == data.length - 1){
      
      //Calculate elevation changes
      top = Math.abs( data[row-1][col+1] - data[row][col] );
      
      //Compares both the next Middle and Top, Compares elevation changes and act acordingly
      
      if(mid <= top){
        //If the Middle is less than or equal to the Top, next go straight
        return Math.abs( data[row][col+1] - data[row][col] ) + drawLowestElevPath(data, row, col+1);
      }
      else if(top < mid){
        //If the top is less than middle
        return Math.abs( data[row-1][col+1] - data[row][col] ) + drawLowestElevPath(data, row-1, col+1);

      }
      
    }//End of Bottom Check
  
  //Regular Check

  //Calculate elevation changes
  top = Math.abs( data[row-1][col+1] - data[row][col] );
  bot = Math.abs( data[row+1][col+1] - data[row][col] );
    
    if( (mid < top && mid < bot) || (mid == top && mid < bot) || (mid == bot && mid < top) || (mid == top && mid == bot) ){
      //If next middle path has the least change, or a tie between middle or top or bottom, go stright      
      return Math.abs( data[row][col+1] - data[row][col] ) + drawLowestElevPath(data, row, col+1);
    }
    else if (top < mid && top < bot){
      //If the next top has the lowest change, go top  
      return Math.abs( data[row-1][col+1] - data[row][col] ) + drawLowestElevPath(data, row-1, col+1);
    }
    else if ( (top < mid && bot < mid) && (top == bot) ){
        
      //If the next top and bottom has the equal lowest change, flip a coin and randomly choose fwd-up or fwd-down 
      if ( flipCoin() ){
        //Go top
        return Math.abs( data[row-1][col+1] - data[row][col] ) + drawLowestElevPath(data, row-1, col+1);
      } else {
        //Go Bottom
        return Math.abs( data[row+1][col+1] - data[row][col] ) + drawLowestElevPath(data, row+1, col+1);
      }
        
    }
      
  //If the next bottom has the lowest change, go bottom
  return Math.abs( data[row+1][col+1] - data[row][col] ) + drawLowestElevPath(data, row+1, col+1);
  
}

public static boolean flipCoin(){
  int value;
  
  //Flips a coin (Random number 1 or 2) Then return true or false
  value = (int) ( Math.random() * 2 ) + 1;
  
  if (value == 1){
    return true;
  } else {
    return false;
  }

}
