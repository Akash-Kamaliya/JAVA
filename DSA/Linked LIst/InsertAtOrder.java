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

    // Insert a node in sorted order
    public static void insertAtOrder(int x) {
        Node newNode = new Node(x);

        // Case 1: insert at beginning or empty list
        if (first == null || x <= first.info) {
            newNode.link = first;
            first = newNode;
            return;
        }

        // Case 2: find position to insert
        Node save = first;
        while (save.link != null && x >= save.link.info) {
            save = save.link;
        }
        newNode.link = save.link;
        save.link = newNode;
    }

    // Print the linked list
    public static void printList() {
        Node temp = first;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.info + " ");
            temp = temp.link;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        insertAtOrder(10);
        insertAtOrder(20);
        insertAtOrder(30);
        insertAtOrder(40);
        insertAtOrder(25);  // Should be inserted between 20 and 30

        printList();  // Output: Linked List: 10 20 25 30 40
    }
}
