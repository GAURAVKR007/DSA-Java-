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

    }
}