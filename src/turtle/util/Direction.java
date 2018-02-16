package turtle.util;

public enum Direction {
    N, NE, E, SE, S, SW, W, NW;
    public Direction rotateBy(Rotation rotation){
        if (rotation == Rotation.RIGHT) {
            return (this.ordinal() < Direction.values().length - 1)
                    ? Direction.values()[this.ordinal() + 1]
                    : Direction.values()[0];
        }else {
            return (this.ordinal() > 0)
                    ? Direction.values()[this.ordinal() - 1]
                    : Direction.values()[Direction.values().length - 1];
        }
    }
  
}
