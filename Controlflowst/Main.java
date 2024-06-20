package Controlflowst;

import java.util.Stack;

public class Main {
public static void main(String[] args) {
        Stack<String> myStack = new Stack<String> ();
        myStack.push("java");
        myStack.push("python");
        myStack.push("c");
        System.out.println("Stack element ="+ myStack);
        String element = myStack.pop();
        System.out.println("popped element:"+element);
        System.out.println("Stack element after popping "+myStack);

    }
}

