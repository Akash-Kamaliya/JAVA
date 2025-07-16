package DSA.Tree;
import java.util.LinkedList;
import java.util.Queue;
public class LevelOrder {
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
    public static Node buildTree(int nodes[]){
        idx++;
        if(nodes[idx]==-1){
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }
    public static void levelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if(currNode==null){
                System.err.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.err.print(currNode.info+ " ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }
    public static void preorderPrint(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.info + " ");
        preorderPrint(root.left);
        preorderPrint(root.right);
    }
    public static void main(String[] args) {
        int nodes[] = { 1 , 2 , 4 , -1 , -1 , 5 , -1 , -1 , 3 , -1, 6,-1,-1};
        Node root = LevelOrder.buildTree(nodes);
        // LevelOrder.preorderPrint(root);
        LevelOrder.levelOrder(root);  
    }
}
