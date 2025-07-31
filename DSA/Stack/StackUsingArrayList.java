package DSA.Stack;

import java.util.ArrayList;


public class StackUsingArrayList {
    static class Stack {
        private ArrayList<Integer> list = new ArrayList<>();
    
        public void push(int value) {
            list.add(value);
        }
    
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty! Cannot pop.");
                return -1;
            }
            return list.remove(list.size() - 1);
        }
    
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty! Nothing to peek.");
                return -1;
            }
            return list.get(list.size() - 1);
        }
    
        public boolean isEmpty() {
            return list.isEmpty();
        }
    
        public void display() {
            System.out.println("Stack: " + list);
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Top element (peek): " + stack.peek());

        System.out.println("Popped: " + stack.pop());
        stack.display(); 

        System.out.println("Is stack empty? " + stack.isEmpty());

        stack.pop();
        stack.pop();
        System.out.println("Is stack empty? " + stack.isEmpty());

        stack.pop();
    }
}

