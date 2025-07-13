public class Zizag {
    static class Node {
        int info;
        Node link;

        public Node(int x) {
            this.info = x;
            this.link = null;
        }
    }

    static Node first = null;

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

    public static void zigZag(){
        //find Mid
        Node slow = first;
        Node fast = first.link;
        while (fast!=null&&fast.link!=null) {
            slow = slow.link;
            fast = fast.link.link;
        }
        Node mid = slow;

        //Reverse 2nd Half

        Node curr = mid.link;
        mid.link = null;
        Node prev = null;
        Node next;
        while (curr!=null) {
            next = curr.link;
            curr.link = prev;
            prev = curr;
            curr = next;
        }
        Node left = first;
        Node right = prev;
        Node nextL , nextR;
        while (left!=null&&right!=null) {
            nextL = left.link;
            left.link = right;
            nextR = right.link;
            right.link = nextL;
            left = nextL;
            right = nextR;
        }
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
        insertAtLast(10);
        insertAtLast(20);
        insertAtLast(30);
        insertAtLast(40);
        insertAtLast(50);
        printList(); 
        zigZag();
        printList(); 
    }
}
