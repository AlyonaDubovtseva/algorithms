package Classwork.Tree;

public class Right extends BinaryTree {

    @Override
    public void traversalTree() {
        System.out.println("Обход справа: ");
        rightTraversal(root);
        System.out.println();
    }

    private void rightTraversal(ITree node){
        if(node == null) {return;}
        System.out.print(node.value() + ", ");
        rightTraversal(node.left());
        rightTraversal(node.right());
    }
}
