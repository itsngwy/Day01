package myapp.core;

import java.io.Console;
import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {

        // Get the console
        // Either use scanner or console to read. Or use both also can
        Scanner myInputs = new Scanner(System.in);
        Console cons = System.console();

        // Read from input 
        int a;
        int b;

        System.out.printf( "Enter first integer: " );
        a = myInputs.nextInt();

        System.out.printf( "Enter second integer: " );
        b = myInputs.nextInt();

        String operator = cons.readLine("What is your operator? ");

        // if (operator.equals("+")){
        //     System.out.printf("%s\n", a + b);
        // }

        // else if (operator.equals("-")){
        //     System.out.printf("%s\n", a - b);
        // }

        // else if (operator.equals("*")){
        //     System.out.printf("%s\n", a * b);
        // }

        // else if (operator.equals("/")){
            
        //     float c = (float) a / (float) b;

        //     System.out.printf("%.3f\n", c);
        // }

        switch(operator.trim()){
            case "+":
                System.out.printf("%s", a + b);
                break;
            case "-":
                System.out.printf("%s", a - b);
                break;
            case "*":
                System.out.printf("%s", a * b);
                break;  
            case "/":
                float c = (float) a / (float) b;
                System.out.printf("%.3f\n", c);
                break;

        }

        myInputs.close();

    }
}
