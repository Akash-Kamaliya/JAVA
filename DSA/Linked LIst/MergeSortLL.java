public class MergeSortLL {
    static class Node {
        int info;
        Node link;

        public Node(int x) {
            this.info = x;
            this.link = null;
        }
    }

    static Node first = null;

    public static void insertAtFirst(int x) {
        Node newNode = new Node(x);
        newNode.link = first;
        first = newNode;
    }

    public static void printList() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.info + " ");
            temp = temp.link;
        }
        System.out.println();
    }
    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.link;
        while (fast != null && fast.link !=null) {
            slow = slow.link;
            fast = fast.link.link;
        }
        return slow;//mid Node
    }
    private Node merge(Node head1 , Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if(head1.info <= head2.info){
                temp.link = head1;
                head1 = head1.link;
                temp = temp.link;
            }
            else{
                temp.link = head2;
                head2 = head2.link;
                temp = temp.link;
            }
        }
        while (head1 != null) {
            temp.link = head1;
            head1 = head1.link;
            temp = temp.link;
        }
        while (head2 != null) {
            temp.link = head2;
            head2 = head2.link;
            temp = temp.link;
        }
        return mergedLL.link;
    }
    public Node mergeSort(Node head){
        if(head == null || head.link == null){
            return head;
        }
        //find mid
        Node mid = getMid(head);
        Node rightHead = mid.link;
        mid.link = null;
        Node left = mergeSort(head);
        Node right = mergeSort(rightHead);
        return merge(left, right);
    }
    public static void main(String[] args) {
        MergeSortLL l1 = new MergeSortLL();
        MergeSortLL.insertAtFirst(1);
        MergeSortLL.insertAtFirst(2);
        MergeSortLL.insertAtFirst(3);
        MergeSortLL.insertAtFirst(4);
        MergeSortLL.insertAtFirst(5);
        MergeSortLL.printList();
        MergeSortLL.first = l1.mergeSort(MergeSortLL.first);
        MergeSortLL.printList();
    }
}
