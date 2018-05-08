PImage pictureOfRecord;
int angle = 10;
import ddf.minim.*;
Minim minim;
AudioPlayer song;


void setup() {
  pictureOfRecord= loadImage("record.png");
  pictureOfRecord.resize(900,900);
  ;size(900,900);
  minim = new Minim(this);
  song = minim.loadFile("jeopardy (2).wav", 512);
}

void draw() {
  rotateImage(pictureOfRecord, angle);
  image(pictureOfRecord, 0, 0);
  if(mousePressed) {
    angle+=10;
    song.play();
    
  }
  else {
    song.pause();
  }
}

void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}