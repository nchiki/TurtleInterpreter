package turtle;

import turtle.Implementations.*;
import turtle.util.Rotation;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class TurtleInterpreter {
    private Scanner input;
    private PrintStream output;
    private Paper paper;
    private Map<String,Turtle> table;

    TurtleInterpreter(Scanner input, PrintStream output) {
        this.input = input;
        this.output = output;
        this.paper = new Paper(10,10);
        this.table = new HashMap<>();
    }

    Turtle makeNewTurtle(String type,String name){
        Turtle turtle;
        switch (type) {
            case "normal":
                int x = input.nextInt();
                int y = input.nextInt();
                turtle = new NormalTurtle(x,y, paper);
                break;
            case "continuous":
                x = input.nextInt();
                y = input.nextInt();
                turtle = new ContinuousTurtle(x,y, paper);
                break;
            case "bouncy":
                x = input.nextInt();
                y = input.nextInt();
                turtle = new BouncyTurtle(x,y, paper);
                break;
            case "reflecting":
                x = input.nextInt();
                y = input.nextInt();
                turtle = new ReflectingTurtle(x,y, paper);
                break;
            case "wrapping":
                x = input.nextInt();
                y = input.nextInt();
                turtle = new WrappingTurtle(x,y, paper);
                break;

            default:
                x = input.nextInt();
                y = input.nextInt();
                turtle = new NormalTurtle(x,y, paper);
                break;
        }
        return turtle;
    }

    void process(){
        while (input.hasNext()){
            String command = input.next();
            switch (command){
                case "paper":
                    int w = input.nextInt();
                    int h = input.nextInt();
                    paper = new Paper(w,h);
                    table = new HashMap<>();
                    break;
                case "new":
                    String type = input.next();
                    String name = input.next();
                    Turtle turtle = makeNewTurtle(type,name);
                    table.put(name, turtle);
                    break;
                case "pen":
                    name = input.next();
                    String state = input.next();
                    turtle = table.get(name);
                    switch (state) {
                        case "up":
                            turtle.setPenUp();
                            break;
                        case "down":
                            turtle.setPenDown();
                            break;
                        default:
                            turtle.setBrush(state.charAt(0));
                            break;
                    }
                    break;
                case "move":
                    name = input.next();
                    int dist = input.nextInt();
                    turtle = table.get(name);
                    turtle.move(dist);
                    break;
                case "right":
                    name = input.next();
                    int angle = input.nextInt();
                    turtle = table.get(name);
                    turtle.rotateBy(Rotation.RIGHT,angle);
                    break;
                case "left":
                    name = input.next();
                    angle = input.nextInt();
                    turtle = table.get(name);
                    turtle.rotateBy(Rotation.LEFT,angle);
                    break;
                case "show":
                    output.println(paper.toString());
                    break;

            }
        }

    }

}
