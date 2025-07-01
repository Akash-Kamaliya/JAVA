public class RemoveNthFromLast {
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
    public void deleteNthFromEnd(int n){
        //calculate Size
        int sz = 0;
        Node temp = head;
        while (temp!=null) {
            temp=temp.link;
            sz++;
        }
        if(n==sz){
            head = head.link;
            return;
        }
        //sz-n
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while (i<iToFind) {
            prev = prev.link;
            i++;
        }
        prev.link = prev.link.link;
        return;
    }

    public static void main(String[] args) {
        RemoveNthFromLast l = new RemoveNthFromLast();
        l.addFirst(6);
        l.addFirst(5);
        l.addFirst(4);
        l.addFirst(3);
        l.addFirst(2);
        l.addFirst(1);
        printList(RemoveNthFromLast.head);
        l.deleteNthFromEnd(3);
        printList(RemoveNthFromLast.head);
    }
}
