package turtle.Implementations;

import turtle.Paper;


public class NormalTurtle extends AbstractTurtle {

    public NormalTurtle(int x, int y, Paper paper) {
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
            }
            mark();
        }
    }

}
