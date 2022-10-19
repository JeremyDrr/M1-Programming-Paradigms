package Exercise3;

import java.util.LinkedList;

public class Main {

    static int postfixMethod(String exp){

        LinkedList<Integer> stack=new LinkedList<>();

        //Scan all characters
        for(int i=0; i < exp.length(); i++) {

            char currentChar = exp.charAt(i);

            //If the character is a number, push it to the stack
            if(Character.isDigit(currentChar))
                stack.push(currentChar - '0');

                //If the character is an operator, pop two values
            else{

                int val1 = stack.pop();
                int val2 = stack.pop();

                //Applying the operator on the two popped values
                switch (currentChar) {
                    case '+' -> stack.push(val2 + val1);
                    case '-' -> stack.push(val2 - val1);
                    case '*' -> stack.push(val2 * val1);
                    case '/' -> stack.push(val2 / val1);
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {

        String formula = "361*+18-";
        System.out.println("Result:\t\t" + postfixMethod(formula));
    }
}
