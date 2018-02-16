package turtle.Implementations;

import turtle.Paper;
import turtle.util.Rotation;

public class ReflectingTurtle extends AbstractTurtle{

    public ReflectingTurtle(int x, int y, Paper paper) {
        super(x, y, paper);
    }

    private void deflect(Rotation rotation){
        super.rotateBy(rotation,45);
        move(1);
        super.rotateBy(rotation,45);
    }

    @Override
    public void move(int count){
        for (int i = 0; i < count; i++) {
            int[] nextPos = nextPos(this.x, this.y);
            int nextX = nextPos[0];
            int nextY = nextPos[1];
            if (paper.isIn(nextX,nextY)){
                this.x = nextX;
                this.y = nextY;
                mark();
            }else{
                switch (dir) {
                    case N: case E: case S: case W:
                        rotateBy(Rotation.RIGHT, 180);
                        break;

                  
                    case NE: case SW:
                        if (paper.isAbove(nextY) || paper.isBelow(nextY)) {
                            deflect(Rotation.RIGHT);
                        }else{
                            deflect(Rotation.LEFT);
                        }
                        break;


                    case NW: case SE:
                        if (paper.isAbove(nextY) || paper.isBelow(nextY)) {
                            deflect(Rotation.LEFT);
                        }else{
                            deflect(Rotation.RIGHT);
                        }
                        break;
                }
            }
        }
    }
    
}
