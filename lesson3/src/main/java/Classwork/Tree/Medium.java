package lab19;

public class Medium extends BinaryTree {
    @Override
    public void traversalTree() {
        System.out.println("Центральный обход: ");
        mediumTraversal(root);
        System.out.println();
    }

    private void mediumTraversal(ITree node) {
        if(node == null) {return;}
        mediumTraversal(node.left());
        mediumTraversal(node.right());
        System.out.print(node.value() + ", ");
    }
}
