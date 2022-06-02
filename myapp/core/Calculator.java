// This is my first app
// My second change
package myapp.core;

import java.io.Console;

public class Calculator {
    
    // Lecturer way of doing
    public static void main(String[] args) {

        // Get the console
        Console cons = System.console();

        String opnd0 = cons.readLine("Operand 0: ").trim();

        String opnd1 = cons.readLine("Operand 1: ").trim();

        String operator = cons.readLine("Operator: one of add, sub, mul, div ").trim();

        int val0 = Integer.parseInt(opnd0);
        int val1 = Integer.parseInt(opnd1);
        Float result = 0f;

        switch(operator){
            case "add":
                result = (float) (val0) + val1;
                break;
            case "sub":
                result = (float) (val0) - val1;
                break;
            case "mul":
                result = (float) (val0) * val1; 
                break;  
            case "div":
                result = (float) (val0) / val1;
                break;

            // Good habit to put default even when unused
            default:
        }

        System.out.printf("Result: %d %s %d = %.3f\n", val0, operator, val1, result) ;
    }
}