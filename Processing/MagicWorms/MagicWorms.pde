float x = 0;
float y = 0;

void setup() {
  size(1200, 900);
  background(140,120,255);
}


void draw() {
  fill(255,0,0);
  ellipse(getWormX(1200),getWormY(900),20,20);
  ellipse(getWormX(1119),getWormY(870),20,20);
  makeMagical();
}

float frequency = .002;
float noiseInterval = PI;

void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
    noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}