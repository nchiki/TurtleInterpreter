package turtle;

public class Paper {
  private final int height;
  private final int width;
  private char[][] content;

  public Paper(int width, int height){

    this.height = height;
    this.width = width;
    this.content = new char[height][width];
    for(int h = 0; h < height; h++){
      for(int w = 0; w < width; w++){
       content[h][w] = ' ';     //ist paper jetzt am Anfang 10x10 oder width and height
      }
    }

  }

  public int getHeight() {
    return height;
  }

  public int getWidth() {
    return width;
  }

  public void markChar(int x, int y, char C) {
    if (x <= height && y <= width) {
      content[x][y] = C;
    }
  }

  public String toString() {
    String output;
    StringBuilder sb = new StringBuilder();
    for (int h = 0; h < height; h++) {
      for (int w = 0; w < width; w++) {
       sb.append(content[h][w]);
      }
    }
    output = sb.toString();
    return output;
  }
}
