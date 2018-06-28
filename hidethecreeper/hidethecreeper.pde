PImage creeper;
int x = 5;
int y = 318;
void setup() {
  size(1000, 1000);

  creeper=loadImage("creeper.png");
  creeper.resize(15, 15);
}
void draw() {
  PImage minecraft = loadImage("minecraft.jpg");
  minecraft.resize(1000, 1000);
  background(minecraft);

  image(creeper, x, y);

  if (isNear(x, mouseX) && isNear(y, mouseY)) {
    fill(000, 136, 034);
    ellipse(mouseX, mouseY, 15, 15);
    print("You win!!!");
  } else {
    fill(255, 000, 000);
    ellipse(mouseX, mouseY, 15, 15);
  }
}

boolean isNear(int a, int b) {
  if (abs(a - b) < 75)
    return true;
  else
    return false;
}