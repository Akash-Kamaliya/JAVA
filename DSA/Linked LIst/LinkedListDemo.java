public class LinkedListDemo {
    public static class Node {
        int info;
        Node link;
        public Node(int x) {
            this.info = x;
            this.link = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.info + " ");
            temp = temp.link;
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        LinkedListDemo.head = new Node(1);
        LinkedListDemo.head.link = new Node(2);
        LinkedListDemo.head.link.link = new Node(3);
        LinkedListDemo.head.link.link.link = new Node(4);
        printList(LinkedListDemo.head);
    }
}
