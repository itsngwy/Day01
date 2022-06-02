package myapp.core;

import java.io.Console;

public class Greetings {
    

    // Write the entry point
    public static void main(String[] args) {

        // Get the console
        Console cons = System.console();

        // Read from input
        String name = cons.readLine("What is your name? ");

        System.out.printf("Hello, %s. Nice to meet you.\n", name.toUpperCase());
        
    }
}
