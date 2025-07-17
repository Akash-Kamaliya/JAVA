package DSA.Tree;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Topview {
    public static class Node {
        int info;
        Node left;
        Node right;

        public Node(int x) {
            this.info = x;
            this.left = null;
            this.right = null;
        }
    }

    static int idx = -1;

    public static Node buildTree(int nodes[]) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.info + " ");
        inorder(root.right);
    }

    static class Info {
        Node node;
        int hd;
        public Info(Node node , int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static void topView(Node root){
        //Level Order 

        Queue<Info> q = new LinkedList<>();
        HashMap<Integer , Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info(root,0));
        q.add(null);
        while (!q.isEmpty()) {
            Info curr = q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if(!map.containsKey(curr.hd)){
                    //first time my hd is occuring
                    map.put(curr.hd,curr.node);
                }
                if(curr.node.left != null){
                    q.add(new Info(curr.node.left,curr.hd-1));
                    min = Math.min(min , curr.hd-1);
                }
                if(curr.node.right!=null){
                    q.add(new Info(curr.node.right , curr.hd+1));
                    max = Math.max(max , curr.hd+1);
                }
            }
        }
        for(int i =min;i<=max;i++){
            System.out.print(map.get(i).info+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = Topview.buildTree(nodes);
        // Topview.inorder(root);
        Topview.topView(root);
    }
}
