public class RemoveLast {
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
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
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
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.link = head;
        head = newNode;
    }
    public void addIndex(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i<idx-1){
            temp = temp.link;
            i++;
        }
        newNode.link = temp.link;
        temp.link = newNode;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.info;
            head = tail = null;
            size = 0;  
            return val;
        }
        Node prev = head;
        for(int i = 0;i<size - 2;i++){
            prev = prev.link;
        }
        int val = prev.link.info;
        prev.link = null;
        tail = prev;
        size--;
        return val;
    }

    public static void main(String[] args) {
        RemoveLast l = new RemoveLast();
        l.addLast(1);
        l.addLast(2);
        l.addLast(3);
        l.addLast(4);
        l.addIndex(2,5);
        printList(RemoveLast.head);
        l.removeLast();
        printList(RemoveLast.head);
        System.out.println("Size of Linked List From Method is = "+ l.countNodes());
        System.out.println("Size of Linked List From Variable is = "+ RemoveLast.size);
    }
}
