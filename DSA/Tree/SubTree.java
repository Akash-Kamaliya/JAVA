package DSA.Tree;
public class SubTree {
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

    public static Node buildTree(int nodes[]) {
        return buildTreeHelper(nodes, new int[]{-1});
    }

    private static Node buildTreeHelper(int nodes[], int idx[]) {
        idx[0]++;
        if (nodes[idx[0]] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[idx[0]]);
        newNode.left = buildTreeHelper(nodes, idx);
        newNode.right = buildTreeHelper(nodes, idx);
        return newNode;
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.info + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static boolean isIdentical(Node node , Node subroot){
        if(node==null && subroot==null){
            return true;
        }else if(node == null || subroot==null||node.info != subroot.info){
            return false;
        }
        if(!isIdentical(node.left, subroot.left)){
            return false;
        }
        if(!isIdentical(node.right, subroot.right)){
            return false;
        }
        return true;
    }

    public static boolean isSubtree(Node root , Node subroot){
        if(root == null){
            return false;
        }
        if(root.info == subroot.info){
            if(isIdentical(root, subroot)){
                return true;
            }
        }
        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }

    public static void main(String[] args) {
        int nodes1[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = SubTree.buildTree(nodes1);
        SubTree.preorder(root);
        System.err.println();
        int nodes2[] = { 2, 4, -1, -1, 5, -1, -1};
        Node subroot = SubTree.buildTree(nodes2);
        SubTree.preorder(subroot);
        System.err.println();
        System.err.println("Is Subtree :"+ isSubtree(root, subroot));
    }
}
