package turtle;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        PrintStream output = new PrintStream(System.out);
        if(args.length == 2) {
            File inputLocation = new File(args[0]);
            File outputLocation = new File(args[1]);
            input = new Scanner(inputLocation);
            output = new PrintStream(outputLocation);
        }else if(args.length == 1){
            File inputLocation = new File(args[0]);
            input = new Scanner(inputLocation);
        }

        TurtleInterpreter ti = new TurtleInterpreter(input,output);

        ti.process();

    }
}
