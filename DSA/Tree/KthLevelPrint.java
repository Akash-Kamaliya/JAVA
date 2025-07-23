public class KthLevelPrint {
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

    public static void kthLevelPrint(Node root, int level, int k) {
        if (root == null) {
            return;
        }
        if (level == k) {
            System.out.print(root.info + " ");
            return;
        }
        kthLevelPrint(root.left, level + 1, k);
        kthLevelPrint(root.right, level + 1, k);
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = KthLevelPrint.buildTree(nodes);
        KthLevelPrint.preorderPrint(root);
        System.err.println();
        int k = 3;
        System.err.print("Kth level Nodes is  : ");
        kthLevelPrint(root, 1, k);
        System.err.println();
    }
}