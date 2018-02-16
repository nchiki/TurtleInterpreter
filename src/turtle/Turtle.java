package turtle;

import turtle.util.Rotation;

public interface Turtle {

    void setPenDown();

    void setPenUp();

    void setBrush(char brush);

    void rotateBy(Rotation rotation, int angle);

    void move(int count);
}
