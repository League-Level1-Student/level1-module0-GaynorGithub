int rainY = 0;
int randomNumber;
int x;
int rainSpeed;
int score = 0;
void setup() {
  size(1200,900);
  background(0,255,0);
}

void draw() {
    background(0,255,0);
  x=mouseX;
  if(rainY==1200) {
    rainY=0;
    randomNumber = (int) random(width);
    rainSpeed = (int) random(15);
  }
  fill(0,0,255);
  stroke(255,255,255);
  ellipse(randomNumber, rainY, 20, 40);
  rainY+=10;
  if (x > randomNumber-50 && x < randomNumber+50 && rainY>=850) {
    background(0,255,0);
  }
  fill(255,0,0);
  rect(x-50, 800, 100, 50);
  checkCatch(randomNumber);
  
}

void checkCatch(int x){
     if (x > mouseX-50 && x < mouseX+50 && rainY==850) {
          score++;
     }
     else if (score > 0 && rainY==850) {
          score--;
     }
     println("Your score is now: " + score); 
     fill(0, 0, 0);
     textSize(30);
     text("Score: " + score, 20, 35);

   
 }