public class Pallindrome {
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
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!=null&&fast.link!=null){
            slow = slow.link;//+1
            fast = fast.link.link;//+2
        }
        return slow;
    }
    public boolean checkPallindrom(){
        if(head==null || head.link==null){
            return true;
        }
        //Step 1 - find mid
        Node midNode = findMid(head);
        //Step 2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr!=null){
            next = curr.link;
            curr.link = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;//right half head
        Node left = head;
        //Step 3 -check left half & right half
        while (right!=null) {
            if(left.info != right.info){
                return false;
            }
            left = left.link;
            right = right.link;
        }
        return true;
    }

    public static void main(String[] args) {
        Pallindrome l = new Pallindrome();
        l.addLast(1);
        l.addLast(2);
        l.addLast(3);
        l.addLast(2);
        l.addLast(1);
        printList(Pallindrome.head);
        System.out.println("Is This Linked list is Pallindrome = "+l.checkPallindrom());
    }
}
