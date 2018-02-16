package turtle.implementations;

import turtle.Turtle;
import turtle.Paper;
import turtle.util.Direction;
import turtle.util.Pen;
import turtle.util.Rotation;


public abstract class AbstractTurtle implements Turtle{

    public final String name;
    protected Direction direction;
    private Pen pState;
    protected Paper paper;
    private char brush;
    private final char defaultBrush = '*';
    protected int x;
    protected int y;


    public AbstractTurtle(String name, int x, int y, Direction direction, Pen pState, Paper paper){
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
        this.paper.markChar(x, paper.getHeight()-1-y, brush);
      }
    }
}
