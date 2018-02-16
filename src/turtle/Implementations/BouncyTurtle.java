package turtle.Implementations;

import turtle.Paper;
import turtle.util.Rotation;

public class BouncyTurtle extends AbstractTurtle{

    public BouncyTurtle(int x, int y, Paper paper) {
        super(x, y, paper);
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
            }else {
                rotateBy(Rotation.RIGHT, 180);
            }
            mark();
        }
    }
}


