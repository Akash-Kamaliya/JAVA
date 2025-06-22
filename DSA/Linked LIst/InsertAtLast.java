public class InsertAtLast {

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

    // Insert at the end of the list
    public static void insertAtLast(int x) {
        Node newNode = new Node(x);

        if (first == null) {
            first = newNode;
        } else {
            Node save = first;
            while (save.link != null) {
                save = save.link;
            }
            save.link = newNode;
        }
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
        insertAtLast(10);
        insertAtLast(20);
        insertAtLast(30);
        insertAtLast(40);

        printList(); // Output: Linked List: 10 20 30 40
    }
}

