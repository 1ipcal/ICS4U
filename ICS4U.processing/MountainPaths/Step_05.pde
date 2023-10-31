/**
 * Find the minimum elevation-change route from West-to-East in the given
 * grid, from the given starting row, and draw it using the given graphics
 * context
 *
 * @param data - the 2D array of elevation values
 * @param row - the starting row for traversing to find the min path
 * @return total elevation of the route
 */

public int drawLowestElevPath( int[][] data, int rowLowest ) {
  int totalChange = 0;
  int row = rowLowest;
  int top, mid, bot;
  
  //Colour initial row pixel
  noStroke();
  rect(0, row, 1, 1);
        
  for(int col = 0; col < data[0].length-1; col++){
    
    //Checks if at Top or At Bottom
    
    //If the Point is at the Top
    if(row == 0){
      
      //Calculate elevation changes
      mid = Math.abs( data[row][col+1] - data[row][col] );
      bot = Math.abs( data[row+1][col+1] - data[row][col] );
      
      //Compares both the next Middle and Bottom, Compares elevation changes and act acordingly
      
      if(mid <= bot){
        //If the middle is less than or equal to the bottom, next go straight
        rect((col+1), (row), 1, 1);
        
        totalChange = totalChange + Math.abs( data[row][col+1] - data[row][col] );
      }
      else if(bot < mid){
        //If the bottom is less than middle
        rect((col+1), (row+1), 1, 1);
        
        totalChange = totalChange + Math.abs( data[row+1][col+1] - data[row][col] );
        row = row + 1;
      }
            
    }//End of Top Check
    
    
    //If the point is on the bottom
    else if (row == data.length - 1){
      
      //Calculate elevation changes
      mid = Math.abs( data[row][col+1] - data[row][col] );
      top = Math.abs( data[row-1][col+1] - data[row][col] );
      
      //Compares both the next Middle and Top, Compares elevation changes and act acordingly
      
      if(mid <= top){
        //If the Middle is less than or equal to the Top, next go straight
        rect((col+1), (row), 1, 1);
        
        totalChange = totalChange + Math.abs( data[row][col+1] - data[row][col] );
      }
      else if(top < mid){
        //If the top is less than middle
        rect((col+1), (row-1), 1, 1);
        
        totalChange = totalChange + Math.abs( data[row-1][col+1] - data[row][col] );
        row = row - 1;
      }
      
    }//End of Bottom Check
  
  
    //Regular checking
    else {
      
      //Calculate elevation changes
      top = Math.abs( data[row-1][col+1] - data[row][col] );
      mid = Math.abs( data[row][col+1] - data[row][col] );
      bot = Math.abs( data[row+1][col+1] - data[row][col] );
      
      //Compares the next Top, Middle, and Bottom, Compares elevation changes and act acordingly
      
      if( (mid < top && mid < bot) || (mid == top && mid < bot) || (mid == bot && mid < top) || (mid == top && mid == bot) ){
        //If next middle path has the least change, or a tie between middle or top or bottom, go stright
        rect((col+1), (row), 1, 1);
        
        totalChange = totalChange + Math.abs( data[row][col+1] - data[row][col] );
      }
      else if (top < mid && top < bot){
        //If the next top has the lowest change, go top
        rect((col+1), (row-1), 1, 1);
        
        totalChange = totalChange + Math.abs( data[row-1][col+1] - data[row][col] );
        row = row - 1;
      }
      else if (bot < mid && bot < top){
        //If the next bottom has the lowest change, go bottom
        rect((col+1), (row+1), 1, 1);
        
        totalChange = totalChange + Math.abs( data[row+1][col+1] - data[row][col] );
        row = row + 1;
      } 
      else if ( (top < mid && bot < mid) && (top == bot) ){
        //If the next top and bottom has the equal lowest change, flip a coin and randomly choose fwd-up or fwd-down
        
        if ( flipCoin() ){
          //Go top
          rect((col+1), (row-1), 1, 1);
        
          totalChange = totalChange + Math.abs( data[row-1][col+1] - data[row][col] );
          row = row - 1;
          
        } else {
          //Go Bottom
          rect((col+1), (row+1), 1, 1);
        
          totalChange = totalChange + Math.abs( data[row+1][col+1] - data[row][col] );
          row = row + 1;
        }
        
      }
            
    }//End of Regualar Check
          
  }// End of For Loop
  
  return totalChange;
  
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
