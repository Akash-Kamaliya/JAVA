public class InsertAtMiddle {
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
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        tail.link = newNode;
        tail = newNode;
    }
    public void addIndex(int idx,int data){
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while(i<idx-1){
            temp = temp.link;
            i++;
        }
        newNode.link = temp.link;
        temp.link = newNode;
    }

    public static void main(String[] args) {
        InsertAtMiddle l = new InsertAtMiddle();
        l.addLast(1);
        l.addLast(2);
        l.addLast(3);
        l.addLast(4);
        l.addIndex(2,5);
        printList(InsertAtMiddle.head);
    }
}
