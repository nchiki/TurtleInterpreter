package turtle.implementations;

import turtle.Turtle;
import turtle.util.Rotation;

public class ClusterTurtle implements Turtle{

  private Turtle[] turtles;

  public ClusterTurtle(Turtle[] turtles) {
    this.turtles = turtles;
  }

  @Override
  public void down() {
    for (Turtle turtle : turtles){
      turtle.down();
    }
  }

  @Override
  public void up() {
    for (Turtle turtle : turtles){
      turtle.up();
    }
  }

  @Override
  public void markBrush(char c) {
    for (Turtle turtle : turtles){
      turtle.markBrush(c);
    }
  }

  @Override
  public void rotate(Rotation rotation, int angle) {
    for (Turtle turtle : turtles){
      turtle.rotate(rotation,angle);
    }
  }

  @Override
  public void mark() {
    for(Turtle turtle : turtles){
      turtle.mark();
    }
  }

  @Override
  public void move(int num) {
    for (Turtle turtle : turtles){
      turtle.move(num);
    }
  }
}