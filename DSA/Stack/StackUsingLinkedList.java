package DSA.Stack;
public class StackUsingLinkedList {
    static class Node {
        int data;
        Node next;
    
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    static class Stack {
        private Node top;
    
        public Stack() {
            top = null;
        }
    
        public void push(int value) {
            Node newNode = new Node(value);
            newNode.next = top;
            top = newNode;
        }
    
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty! Cannot pop.");
                return -1;
            }
            int popped = top.data;
            top = top.next;
            return popped;
        }
    
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty! Nothing to peek.");
                return -1;
            }
            return top.data;
        }
    
        public boolean isEmpty() {
            return top == null;
        }
    
        public void display() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return;
            }
    
            System.out.print("Stack (top to bottom): ");
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(5);
        stack.push(15);
        stack.push(25);
        stack.display();

        System.out.println("Top element (peek): " + stack.peek());

        System.out.println("Popped: " + stack.pop());
        stack.display();

        stack.pop();
        stack.pop();
        System.out.println("Is stack empty? " + stack.isEmpty());

        stack.pop();
    }
}
