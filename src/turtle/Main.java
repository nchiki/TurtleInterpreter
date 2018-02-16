package turtle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
    String inputLocation = args[0];
    String outputLocation = args[1];
    Scanner input = new Scanner(new File(inputLocation));
    PrintStream output = new PrintStream(new File(outputLocation));
    TurtleInterpreter t= new TurtleInterpreter(input, output);
    t.process();
    }
}
