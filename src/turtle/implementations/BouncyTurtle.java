package turtle.implementations;

import turtle.Paper;
import turtle.Turtle;
import turtle.util.Direction;
import turtle.util.Pen;
import turtle.util.Rotation;

public class BouncyTurtle implements Turtle{

  public final String name;
  private Direction direction;
  private Pen pState;
  private Paper paper;
  private char brush;
  private final char defaultBrush = '*';
  private int x;
  private int y;


  public BouncyTurtle(String name, int x, int y, Direction direction, Pen pState, Paper paper){
    this.x = x;
    this.y = y;
    this.name = name;
    this.direction = direction;
    this.pState = pState;
    this.paper = paper;
    this.brush = defaultBrush;
  }

  @Override
  public void up(){
    this.pState = Pen.UP;
  }

  @Override
  public void down() { this.pState = Pen.DOWN;}


  @Override
  public void markBrush(char c){
    this.brush = c;
  }

  @Override
  public void rotate(Rotation rot, int num){
    for(int i = 0; i < num; i++){
      this.direction.rotate(rot);
    }
  }

  @Override
  public void mark(){
    if(this.pState == Pen.DOWN){
      int x = this.x;
      int y = this.y;
      this.paper.markChar(x, y, brush);
    }
  }

  @Override
  public void move(int units) {
    for (int i = 0; i < units; i++) {
      switch (this.direction) {
        case EAST:
          if(this.paper.isInside(this.x+1, this.y)) {
            this.x += 1;
            mark();
            break;
          }
          else{
            break;
          }

        case WEST:
          if(this.paper.isInside(this.x-1, this.y)) {
            this.x -= 1;
            mark();
            break;
          } else {
            break;
          }

        case NORTH:
          if(this.paper.isInside(this.x, this.y-1)) {
            this.y -= 1;
            mark();
            break;
          } else{
            break;
          }

        case SOUTH:
          if(this.paper.isInside(this.x, this.y+1)) {
            this.y += 1;
            mark();
            break;
          } else {
            break;
          }

        case NORTHEAST:
          if(this.paper.isInside(this.x+1, this.y-1)) {
            this.x += 1;
            this.y -= 1;
            mark();
            break;
          } else {
            break;
          }

        case NORTHWEST:
          if(this.paper.isInside(this.x-1, this.y-1)) {
            this.x -= 1;
            this.y -= 1;
            mark();
            break;
          } else {
            break;
          }

        case SOUTHEAST:
          if(this.paper.isInside(this.x+1, this.y+1)) {
            this.x += 1;
            this.y += 1;
            mark();
            break;
          } else {
            break;
          }

        case SOUTHWEST:
          if(this.paper.isInside(this.x-1, this.y+1)) {
            this.x -= 1;
            this.y += 1;
            mark();
            break;
          } else {
            break;
          }

        default:
          break;
      }

    }
  }

}

