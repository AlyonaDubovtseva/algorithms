package lab19;

public class Left extends BinaryTree {
    @Override
    public void traversalTree() {
        System.out.println("Обход слева:");
        leftTraversal(root);
        System.out.println();
    }

    private void leftTraversal(ITree node) {
        if (node == null) {return;}
        leftTraversal(node.left());
        System.out.print(node.value() + ", ");
        leftTraversal(node.right());
    }
}
