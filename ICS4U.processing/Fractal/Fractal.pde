/**
 * Fractal
 * Name: Calvin Ip
 * Date: 3/10/2021
 * Version: 1.0
 * Description: This program will make a fractal
 *              
 */
 
 void setup(){
   size(1000,1000);
   shapeMode(CENTER);
   ellipseMode(RADIUS);
   background (random(255), random(255), random(255), random(255) );
   
   //Make Circle Fractal
   
   circleFractalTwo(width/2, height/2, width/2);
   
   circleFractal(width/2, height/2, 200);
   
 }
 
 public void circleFractal(int x, int y, int radius){
   //Random Colour
   fill( random(255), random(255), random(255), random(255) );
   
   //No Outlines
   noStroke();
   
   //Draw Circle
   circle(x, y, radius);
   
   //Repeats and recalls the function
   if (radius > 5){
     //Diagonally Up-Right
     circleFractal(x+radius, y-radius, radius/2);
     
     //Diagonally Down-Right
     circleFractal(x+radius, y+radius, radius/2);
     
     //Diagonally Up-Left
     circleFractal(x-radius, y+radius, radius/2);
     
     //Diagonally Down-Left
     circleFractal(x-radius, y-radius, radius/2);
     
   }
   
   
 }
 
 public void circleFractalTwo(int x, int y, int radius){
   //Random Colour
   fill( random(255), random(255), random(255), random(255) );
   
   //Outlines
   stroke(10);
   
   //Draw Circle
   ellipse(x, y, radius, radius);

   //Repeats and recalls the functions
   if (radius > 50){
    circleFractalTwo(x + radius/2, y, radius/2);
    circleFractalTwo(x - radius/2, y, radius/2);
    circleFractalTwo(x, y + radius/2, radius/2);
    circleFractalTwo(x, y - radius/2, radius/2);
   }
   
 }
