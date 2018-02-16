package turtle;

public class Paper {

    private char grid[][];
    private final int width;
    private final int height;

    Paper(int width, int height){
        this.width = width;
        this.height = height;
        this.grid = new char[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                grid[i][j] = ' ';
            }
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isIn(int x, int y){
        return x<width && y<height &&
                x>=0 && y>=0;
    }

    public boolean isAbove(int y){
        return y>=height;
    }

    public boolean isBelow(int y){
        return y<0;
    }

    public boolean isRight(int x){
        return x>=width;
    }

    public boolean isLeft(int x){
        return x<0;
    }

    public void mark(int x, int y, char c){
        if(isIn(x,y)){
            this.grid[y][x] = c;
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (char[] row: grid){
            s.append(row).append('\n');
        }
        return s.toString();
    }
}
