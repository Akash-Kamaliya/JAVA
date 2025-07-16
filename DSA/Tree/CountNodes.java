package DSA.Tree;
public class CountNodes {
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

    public static void preorderPrint(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.info + " ");
        preorderPrint(root.left);
        preorderPrint(root.right);
    }

    public static int count(Node root) {
        if (root == null) {
            return 0;
        }
        int lc = count(root.left);
        int rc = count(root.right);
        return lc+rc+1;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = CountNodes.buildTree(nodes);
        CountNodes.preorderPrint(root);
        System.err.println();
        System.err.println("Count of tree is  : " + count(root));
    }
}
