package turtle;

import turtle.implementations.BouncyTurtle;
import turtle.implementations.ContinuousTurtle;
import turtle.implementations.NormalTurtle;
import turtle.implementations.ReflectingTurtle;
import turtle.implementations.WrappingTurtle;
import turtle.util.Direction;
import turtle.util.Pen;
import turtle.util.Rotation;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TurtleInterpreter {
  private final Map<String, Turtle> turtles = new HashMap<>();

  private Scanner scanner;
  private Paper paper;
  private PrintStream printStream;

  public TurtleInterpreter(Scanner input, PrintStream output) {
    this.scanner = input;
    this.printStream = output ;
    this.paper = new Paper(10,10);
  }

  public void process() {
    int angle;
    int width;
    int height;
    String token;
    String type;
    String name;
    int distance;
    Turtle turtle;

    while (scanner.hasNext()) {
      token = scanner.next();
      switch(token) {

        case "paper" :
          width = scanner.nextInt();
          height = scanner.nextInt();
          this.paper = new Paper(width, height);
          break;

        case "new"   :
          type = scanner.next();
          name = scanner.next();
          int x = scanner.nextInt();
          int y = scanner.nextInt();

          switch(type) {

            case "normal":
              turtle = new NormalTurtle(name, x, y, Direction.NORTH, Pen.UP, paper);

            case "bouncy":
              turtle = new BouncyTurtle(name, x, y, Direction.NORTH, Pen.UP, paper);

            case "continuous":
              turtle = new ContinuousTurtle(name, x, y, Direction.NORTH, Pen.UP, paper);

            case "wrapping":
              turtle = new WrappingTurtle(name, x, y, Direction.NORTH, Pen.UP, paper);

            case "reflecting":
              turtle = new ReflectingTurtle(name, x, y, Direction.NORTH, Pen.UP, paper);

            default:
              turtle = new NormalTurtle(name, x, y, Direction.NORTH, Pen.UP, paper);
          }

        turtles.put(name,turtle);
        break;

        case "pen"  :
          name = scanner.next();
          String penState = scanner.next();
          switch(penState) {
            case "up":
              turtles.get(name).up();
              break;
            case "down":
              turtles.get(name).down();
              break;
            default:
              turtles.get(name).markBrush(penState.charAt(0));
              break;
          }
          break;

        case "move" :
          name = scanner.next();
          distance = scanner.nextInt();
          turtles.get(name).move(distance);
          break;

        case "right":
          name = scanner.next();
          angle = scanner.nextInt()/45;
          turtles.get(name).rotate(Rotation.RIGHT,angle);
          break;

        case "left":
          name = scanner.next();
          angle = scanner.nextInt();
          turtles.get(name).rotate(Rotation.LEFT,angle);
          break;

        case "show":
          printStream.println(this.paper.toString());
          break;

        default:
          System.out.println("Enter something correct");
      }
    }
  }
}

