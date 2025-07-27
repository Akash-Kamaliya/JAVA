package DSA.Tree;
public class MinDistanceBetwNodes {
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
    public static void preorderPrint(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.info + " ");
        preorderPrint(root.left);
        preorderPrint(root.right);
    }

    public static Node lca(Node root , int n1 , int n2){
        if(root == null || root.info == n1 || root.info == n2){
            return root;
        }
        Node leftLca = lca(root.left, n1, n2);
        Node rightLca = lca(root.right, n1, n2);

        //leftLca = val  ,  rightLca = null
        if (rightLca == null) {
            return leftLca;
        }
        if(leftLca == null){
            return rightLca;
        }
        return root;
    }

    public static int lcaDist(Node root , int n){
        if(root == null){
            return -1;
        }
        if(root.info == n){
            return 0;
        }
        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        }
        else if(leftDist == -1){
            return rightDist + 1;
        }
        else{
            return leftDist + 1;
        }
    }

    public static int minDist(Node root , int n1 , int n2){
        Node lca = lca(root, n1, n2);
        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);
        return dist1 + dist2;
    }

    public static void main(String[] args) {
        int nodes[] = { 1 , 2 , 4 , -1 , -1 , 5 , -1 , -1 , 3 , -1, 6,-1,-1};
        Node root = MinDistanceBetwNodes.buildTree(nodes);
        int n1 = 5 , n2 = 6;
        System.out.println(minDist(root, n1, n2));
    }
}
