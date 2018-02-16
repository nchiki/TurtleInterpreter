package turtle.Implementations;

import turtle.Paper;
import turtle.Turtle;
import turtle.util.Direction;
import turtle.util.Pen;
import turtle.util.Rotation;

public abstract class AbstractTurtle implements Turtle {
    final Paper paper;
    int x;
    int y;
    Direction dir;
    private Pen pen;
    private char brush;

    AbstractTurtle(int x, int y, Paper paper) {
        this.x = x;
        this.y = y;
        this.dir = Direction.N;
        this.pen = Pen.UP;
        this.paper = paper;
        this.brush = '*';
    }


    @Override
    public void setPenDown(){
        pen = Pen.DOWN;
    }

    @Override
    public void setPenUp(){
        pen = Pen.UP;
    }

    @Override
    public void setBrush(char brush) {
        this.brush = brush;
    }

    @Override
    public void rotateBy(Rotation rotation, int angle){
        for (int i = 0; i < angle; i+= 45) {
            this.dir = dir.rotateBy(rotation);
        }
    }

    @Override
    public void move(int count){
        throw new Error("Should not be called");
    }

    int[] nextPos(int x, int y){
        switch (dir){
            case N : y++;break;
            case NE: y++; x++; break;
            case E : x++; break;
            case SE: y--; x++; break;
            case S : y--; break;
            case SW: y--; x--; break;
            case W :  x--; break;
            case NW: y++; x--; break;
        }
        return new int[] {x,y};
    }

    void mark(){
        if (this.pen == Pen.DOWN){
            paper.mark(x,paper.getHeight()-1-y,brush);
        }
    }
}
