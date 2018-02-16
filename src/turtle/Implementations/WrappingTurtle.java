package turtle.Implementations;

import turtle.Paper;

public class WrappingTurtle extends AbstractTurtle{

    public WrappingTurtle(int x, int y, Paper paper) {
        super(x, y, paper);
    }

    @Override
    public void move(int count){
        for (int i = 0; i < count; i++) {
            int[] nextPos = nextPos(this.x, this.y);
            int nextX = nextPos[0];
            int nextY = nextPos[1];
            if (!paper.isIn(nextX,nextY)){
                if(paper.isRight(nextX)){
                    nextX = 0;
                }else if(paper.isLeft(nextX)){
                    nextX = paper.getWidth()-1;
                }
                if(paper.isAbove(nextY)){
                    nextY = 0;
                }else if(paper.isBelow(nextY)){
                    nextY = paper.getHeight()-1;
                }
            }
            this.x = nextX;
            this.y = nextY;
            mark();
        }
    }
}
