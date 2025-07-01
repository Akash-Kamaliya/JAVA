public class InsertAtFirst {

    static class Node {
        int info;
        Node link;

        public Node(int x) {
            this.info = x;
            this.link = null;
        }
    }

    static Node first = null;

    public static void insertAtFirst(int x) {
        Node newNode = new Node(x);
        newNode.link = first;
        first = newNode;
    }

    public static void printList() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.info + " ");
            temp = temp.link;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        insertAtFirst(10);
        insertAtFirst(20);
        insertAtFirst(30);
        insertAtFirst(40);
        insertAtFirst(50);
        printList();
    }
}
