public class Reverse {
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
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.link = head;
        head = newNode;
    }
    public void reverse(){
        Node prev =null;
        Node curr = tail = head;
        Node next;
        while (curr!=null) {
            next = curr.link;
            curr.link = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        Reverse l = new Reverse();
        l.addFirst(1);
        l.addFirst(2);
        l.addFirst(3);
        l.addFirst(4);
        printList(Reverse.head);
        l.reverse();
        printList(Reverse.head);
    }
}
