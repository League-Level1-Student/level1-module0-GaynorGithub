float x = 0;
float y = 0;

void setup() {
  size(1200, 900);
  background(140,120,255);
}


void draw() {
  fill(255,0,0);
  ellipse(getWormX(1200),getWormY(900),30,30);
  ellipse(getWormX(1199),getWormY(870),30,30);
  ellipse(getWormX(1198),getWormY(840),30,30);
  ellipse(getWormX(1197),getWormY(810),30,30);
  ellipse(getWormX(1196),getWormY(780),30,30);
  ellipse(getWormX(1195),getWormY(750),30,30);
  ellipse(getWormX(1194),getWormY(720),30,30);
  ellipse(getWormX(1193),getWormY(690),30,30);
  ellipse(getWormX(1192),getWormY(660),30,30);
  ellipse(getWormX(1191),getWormY(630),30,30);
  ellipse(getWormX(1190),getWormY(600),30,30);
  ellipse(getWormX(1189),getWormY(570),30,30);
  ellipse(getWormX(1188),getWormY(540),30,30);
  ellipse(getWormX(1187),getWormY(510),30,30);
  
  ellipse(getWormX(1186),getWormY(480),30,30);
  ellipse(getWormX(1185),getWormY(450),30,30);
  ellipse(getWormX(1184),getWormY(420),30,30);
  ellipse(getWormX(1183),getWormY(390),30,30);
  ellipse(getWormX(1182),getWormY(360),30,30);
  ellipse(getWormX(1181),getWormY(330),30,30);
  ellipse(getWormX(1180),getWormY(300),30,30);
  ellipse(getWormX(1179),getWormY(270),30,30);
  ellipse(getWormX(1178),getWormY(240),30,30);
  ellipse(getWormX(1177),getWormY(210),30,30);
  ellipse(getWormX(1176),getWormY(180),30,30);
  ellipse(getWormX(1175),getWormY(150),30,30);
  ellipse(getWormX(1174),getWormY(120),30,30);
  ellipse(getWormX(1173),getWormY(90),30,30);

  
  
  //makeMagical();
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