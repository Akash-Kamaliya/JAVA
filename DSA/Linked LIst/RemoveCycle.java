public class RemoveCycle {
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

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while (fast!=null&&fast.link!=null) {
            slow = slow.link;//+1
            fast = fast.link.link;//+2
            if(slow==fast){
                return true;//cycle Exist
            }
        }
        return false;//cycle Does not Exist
    }
    public static void removeCycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast!=null && fast.link !=null){
            slow = slow.link;
            fast = fast.link.link;
            if(fast==slow){
                cycle = true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        //find meeting point
        slow = head;
        Node prev = null;//last Node
        while (slow!=fast) {
            prev = fast;
            slow = slow.link;
            fast = fast.link;
        }
        //remove cycle -> last.link = null
        prev.link = null;
    }
    public static void main(String[] args) {
        head = new Node(1);
        head.link = new Node(2);
        head.link.link = new Node(3);
        head.link.link.link = new Node(4);
        head.link.link.link.link = new Node(5);
        head.link.link.link = head.link;
        System.out.println("Is linked list has cycle = "+isCycle());
        removeCycle();
        System.out.println("After Removing Cycle");
        System.out.println("Is linked list has cycle = "+isCycle());
    }
}
