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
        LinkedListDemo l = new LinkedListDemo();
        l.head = new Node(1);
        l.head.link = new Node(2);
        l.head.link.link = new Node(3);
        l.head.link.link.link = new Node(4);
        printList(l.head);
    }
}
