package turtle;

import turtle.util.Rotation;

public interface Turtle {

    public void up();
    public void down();

    public void markBrush(char c);

    public void rotate(Rotation rot, int num);

    public void mark();

    public void move(int units);

}
