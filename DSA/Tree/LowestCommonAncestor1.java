package DSA.Tree;

import java.util.ArrayList;

class LowestCommonAncestor1 {
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

    public static boolean getPath(Node root , int n , ArrayList<Node> path){
        if(root==null){
            return false;
        }
        path.add(root);
        if(root.info==n){
            return true;
        }
        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if(foundLeft||foundRight){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }

    public static Node lca(Node root , int n1 , int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        //last Common Ancestor

        int i=0;
        for(;i<path1.size()&&i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        //last equal node - > i-1th
        Node lca = path1.get(i-1);
        return lca;
    }
    public static void main(String[] args) {
        int nodes[] = { 1 , 2 , 4 , -1 , -1 , 5 , -1 , -1 , 3 , -1, 6,-1,-1};
        Node root = LowestCommonAncestor1.buildTree(nodes);
        int n1 = 5 , n2 = 4;
        System.out.println(lca(root, n1, n2).info);
    }
}