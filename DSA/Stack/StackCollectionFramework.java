package DSA.Stack;

import java.util.Stack;

public class StackCollectionFramework {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after pushing: " + stack);

        System.out.println("Top element (peek): " + stack.peek());

        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after popping: " + stack);

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
