package DSA.Tree;
public class PreorderTree {
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
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.info + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        int nodes[] = { 1 , 2 , 4 , -1 , -1 , 5 , -1 , -1 , 3 , -1, 6,-1,-1};
        Node root = PreorderTree.buildTree(nodes);
        PreorderTree.preorder(root);
    }
}
