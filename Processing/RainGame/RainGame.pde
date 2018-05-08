int rainY = 0;
int randomNumber;
int x;
int rainSpeed;
void setup() {
  size(1200,900);
  background(0,255,0);
}

void draw() {
  x=mouseX;
  if(rainY==1200) {
    rainY=0;
    randomNumber = (int) random(width);
    rainSpeed = (int) random(15);
  }
  fill(0,255,0);
  rect(0,0,1200,900);
  fill(0,0,255);
  stroke(255,255,255);
  ellipse(randomNumber, rainY, 20, 40);
  rainY+=10;
  fill(255,0,0);
  rect(x-50, 800, 100, 50);
  
  
}