public record Searching1() {
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
    public static int size;

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.info + " ");
            temp = temp.link;
        }
        System.out.println();
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.link = newNode;
        tail = newNode;
    }

    public int countNodes() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.link;
        }
        return count;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.link = head;
        head = newNode;
    }

    public void addIndex(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.link;
            i++;
        }
        newNode.link = temp.link;
        temp.link = newNode;
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.info == key) {
            return 0;
        }
        int idx = helper(head.link, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public static void main(String[] args) {
        Searching1 l = new Searching1();
        l.addLast(1);
        l.addLast(2);
        l.addLast(3);
        l.addLast(4);
        l.addIndex(2, 5);
        printList(Searching1.head);
        System.out.println("Searching 2 in linked Lidt = " + l.recSearch(2));
        System.out.println("Searching 10 in linked Lidt = " + l.recSearch(10));
        System.out.println("Size of Linked List From Method is = " + l.countNodes());
        System.out.println("Size of Linked List From Variable is = " + Searching1.size);
    }
}
