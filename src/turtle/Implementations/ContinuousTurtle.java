package turtle.Implementations;

import turtle.Paper;

public class ContinuousTurtle extends AbstractTurtle {
    public ContinuousTurtle(int x, int y, Paper paper) {
        super(x, y, paper);
    }

    @Override
    public void move(int count){
        for (int i = 0; i < count; i++) {
            int[] nextPos = nextPos(this.x, this.y);
            int nextX = nextPos[0];
            int nextY = nextPos[1];
            this.x = nextX;
            this.y = nextY;
            if (super.paper.isIn(nextPos[0],nextPos[1])){
                mark();
            }
        }
    }

}
