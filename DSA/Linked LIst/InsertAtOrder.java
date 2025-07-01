public class InsertAtOrder {

    // Node class
    static class Node {
        int info;
        Node link;

        public Node(int x) {
            this.info = x;
            this.link = null;
        }
    }

    static Node first = null;

    public static void insertAtOrder(int x) {
        Node newNode = new Node(x);

        if (first == null || x <= first.info) {
            newNode.link = first;
            first = newNode;
            return;
        }

        Node save = first;
        while (save.link != null && x >= save.link.info) {
            save = save.link;
        }
        newNode.link = save.link;
        save.link = newNode;
    }

    public static void printList() {
        Node temp = first;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.info + " ");
            temp = temp.link;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        insertAtOrder(10);
        insertAtOrder(20);
        insertAtOrder(30);
        insertAtOrder(40);
        insertAtOrder(25); 

        printList(); 
    }
}
