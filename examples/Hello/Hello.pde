import VectorOperations.library.*;

VectorOperations vo;
double[] normal;
double[] x,y;

void setup() {
  size(400,400);
  smooth();
  

  vo = new VectorOperations(this);
  normal = new double[2];
  x = new double[2];
  y = new double[2];
  
  x[0] = 0.0;
  x[1] = 1.0;
  
  y[0] = 0.0;
  y[1] = 1.0;
  

  PFont font = createFont("",40);
  textFont(font);
}

void draw() {
  background(0);
  fill(255);
  text(vo.sayHello(), 40, 200);
  normal = vo.normal(x,y);
  println(normal);
  noLoop();
}