package turtle;

public class Paper {
  private final int height;
  private final int width;
  private char[][] content;

  public Paper(int width, int height){

    this.height = height;
    this.width = width;
    this.content = new char[height][width];
    for(int h = height-1; h >= 0; h--){
      for(int w = 0; w < width; w++){
       content[h][w] = ' ';
      }
    }

  }

  public boolean isInside(int x, int y){
    return (0 <= x && x < this.width && 0 <= y && y < this.height);
  }

  public int getHeight() {
    return height;
  }

  public int getWidth() {
    return width;
  }

  public void markChar(int x, int y, char C) {
    if (isInside(x, y)) {
      content[y][x] = C;
    }
  }

  public String toString() {
    String output;
    StringBuilder sb = new StringBuilder();
    for (int h = height-1; h >= 0; h--) {
      for (int w = 0; w < width; w++) {
       sb.append(content[h][w]);
      }
      sb.append('\n');
    }
    output = sb.toString();
    return output;
  }
}
