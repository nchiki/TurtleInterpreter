package turtle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        PrintStream output = new PrintStream(System.out);
        if(args.length == 2){
            File i = new File(args[0]);
            File o = new File(args[1]);
            input = new Scanner(i);
            output = new PrintStream(o);
        } else if(args.length == 1){
            File i = new File(args[0]);
            input = new Scanner(i);
        }

    TurtleInterpreter t= new TurtleInterpreter(input, output);
    t.process();
    }
}
