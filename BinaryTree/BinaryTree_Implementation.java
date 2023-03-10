import java.util.*;
class BinaryTree_Implementation {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class MyBinaryTree {
        static int idx = -1;
        public Node buildTree(int[] nodes) {
            idx++;
            if(nodes[idx] == -1){
                return null;
            }         

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void preorder(Node root) {
        if(root == null) {
            // System.out.print(-1+ " ");
            return;
        }
        System.out.print(root.data+ " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inordered(Node root){
        if(root == null){
            // System.out.print(-1+" ");
            return;
        }

        inordered(root.left);
        System.out.print(root.data+ " ");
        inordered(root.right);
        
    }

    public static void postorder(Node root){
        if(root == null){
            // System.out.print(-1+" ");
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+ " ");
    }

    public static void levelOrder(Node root){
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();

                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int countNodes(Node root){
        
        if(root == null) return 0;

        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

    public static int sumOfNodes(Node root){
        
        if(root == null) return 0;

        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        MyBinaryTree tree = new MyBinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.print("Preorder => "); 
        preorder(root);
        System.out.print("\nInorder => "); 
        inordered(root);
        System.out.print("\npostOrder => "); 
        postorder(root);
        System.out.println("\nlevelOrder => "); 
        levelOrder(root);
        System.out.println("No of Nodes : "+countNodes(root));
        System.out.println("Sum of Nodes : "+sumOfNodes(root));
    }
}