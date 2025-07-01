public class DetectCycle {
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
    public static void main(String[] args) {
        head = new Node(1);
        head.link = new Node(2);
        head.link.link = new Node(3);
        head.link.link.link = new Node(4);
        head.link.link.link = head;
        System.out.println("Is linked list has cycle = "+isCycle());
    }
}
