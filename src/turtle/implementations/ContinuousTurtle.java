package turtle.implementations;


import turtle.Paper;
import turtle.util.Direction;
import turtle.util.Pen;

public class ContinuousTurtle extends AbstractTurtle{

  public ContinuousTurtle(String name, int x, int y, Direction direction, Pen pState,
      Paper paper) {
    super(name, x, y, direction, pState, paper);
  }

  /*public ContinuousTurtle(String name, int x, int y, Direction direction, Pen pState, Paper paper){
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
  */
    @Override
    public void move(int units) {
      for (int i = 0; i < units; i++) {
        movehelper();
      }
    }

    private void movehelper() {
      switch (this.direction) {
        case EAST:
            this.x += 1;
            mark();
            break;

        case WEST:
            this.x -= 1;
            mark();
            break;

        case NORTH:
            this.y -= 1;
            mark();
            break;

        case SOUTH:
            this.y += 1;
            mark();
            break;


        case NORTHEAST:
            this.x += 1;
            this.y -= 1;
            mark();
            break;

        case NORTHWEST:
            this.x -= 1;
            this.y -= 1;
            mark();
            break;

        case SOUTHEAST:
            this.x += 1;
            this.y += 1;
            mark();
            break;

        case SOUTHWEST:
            this.x -= 1;
            this.y += 1;
            mark();
            break;

        default:
          break;

      }
    }

}
