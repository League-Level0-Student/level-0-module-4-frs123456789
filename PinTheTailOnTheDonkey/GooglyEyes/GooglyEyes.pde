void setup(){
size(400,400);




}
void draw(){
  
  int x = mouseX;
  int y = mouseY;
  
  if(x>135){
    x=135;
  }
  else if(x<65){
    x=65;
  }
   if(y<90){
    y=90;
  }
  else if(y>112){
    y=112;
  }
  
  
  background(255,255,255);
 fill(255,255,255);
 ellipse(100,100,100,60);
 ellipse(250,100,100,60);
 
 fill(0,0,0);
 ellipse(x, y, 25,25);
 ellipse(x + 150, y, 25,25);
  
  
  
  
  
  
}
