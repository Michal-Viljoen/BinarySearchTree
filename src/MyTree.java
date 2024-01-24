public class MyTree {
    private MyTreeNode tree;

    public MyTree() {
        tree = null;
    }

    public boolean isEmpty() {
        return tree == null;
    }

    private MyTreeNode insert(MyTreeNode tree, int value) {
        if (tree == null) { // if the tree or sub-tree is empty
            tree = new MyTreeNode();
            tree.setData(value);
            tree.setLeft(null);
            tree.setRight(null);
        } else if (value > tree.getData()) {
            tree.setRight(  insert(tree.getRight(), value) );
        } else if (value < tree.getData()) {
            tree.setLeft(   insert(tree.getLeft(), value) );
        }
        return tree;
    }

    public void insert(int value) {
        tree = insert(tree, value);
    }

    public int delete(int target) {
        return 0;
    }

    public MyTreeNode search(int target) {
        return null;
    }

    private void preorder(MyTreeNode root) {
        if (root != null) {
            System.out.print(root.getData() + ", ");  // N (i.e. visit the node
            preorder(root.getLeft());            // L
            preorder(root.getRight());           // R
        }
    }

    // NLR
    public void preorder() {
        preorder(tree);
        System.out.println("");
    }

    public void inorder(MyTreeNode root) {
        if (root != null) {
            inorder(root.getLeft());             // L
            System.out.print(root.getData() + ", ");  // N
            inorder(root.getRight());            // R
        }
    }

    // LNR
    public void inorder() {
        inorder(tree);
        System.out.println("");
    }

    public void postorder(){
        postorder(tree);
        System.out.println("");
    }


    // LRN
    public void postorder(MyTreeNode root) {
            if(root != null) {
                postorder(root.getLeft());
                postorder(root.getRight());
                System.out.print(root.getData() + " ");
            }


    }
}