/**
 * Given a 2D array of elevation data create a image of size rows x cols,
 * drawing a 1x1 rectangle (or point) for each value in the array whose color is set to
 * a scaled gray value (0-255). Note: to scale the values in the array to
 * 0-255 you must find the min and max values in the original data first.
 *
 * @param g a Graphics context to use
 * @param grid a 2D array of the data
 */
 public void drawMap( int[][] data, int min, int max ) {
   //Cycles through all data and converts it into a greyscaled pixel
   for(int r = 0; r < data.length; r++){
    for (int c = 0; c < data[r].length; c++){
      
      //Draws a pixel 1x1
      fill( map(data[r][c], min, max) );
      noStroke();
      rect(c, r, 1, 1);
      
    }
   }
   
 }
 
 public long map(long value, long oldMin, long oldMax) {
  final long NEW_MIN = 0;
  final long NEW_MAX = 255;
  
  //Converts a Scale to another Scale
  return (value - oldMin) * (NEW_MAX - NEW_MIN) / (oldMax - oldMin) + NEW_MIN;
}
