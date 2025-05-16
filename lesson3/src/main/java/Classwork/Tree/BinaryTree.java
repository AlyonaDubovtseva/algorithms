package lab19;

public abstract class BinaryTree {

    protected ITree root;

    public void buildTree(int[] array) {
        for(int i = 0; i < array.length; i++) {
            root = addLeaf(array[i], root);
        }
    }

    public ITree addLeaf(int n, ITree node) {

        if(node == null) {return new Node(n);}

        if (n > node.value()) {
            if(node.right() == null) {
                Node usel = new Node(n);
                ((Node) node).setRight(usel);
                return node;
            } else {
                addLeaf(n, node.right());
            }
        }
        if (n <= node.value()) {
            if(node.left() == null) {
                Node usel = new Node(n);
                ((Node) node).setLeft(usel);
                return node;
            } else {
                addLeaf(n, node.left());
            }
        }
        return node;

    }

    public abstract void traversalTree();
}
