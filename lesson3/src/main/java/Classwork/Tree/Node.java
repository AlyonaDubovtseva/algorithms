package Classwork.Tree;

public class Node implements ITree {
    private int value;
    private ITree right;
    private ITree left;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public int value() {
        return value;
    }

    @Override
    public ITree left() {
        return left;
    }

    public void setRight(ITree right) {
        this.right = right;
    }

    @Override
    public ITree right() {
        return right;
    }

    public void setLeft(ITree left) {
        this.left = left;
    }
}
