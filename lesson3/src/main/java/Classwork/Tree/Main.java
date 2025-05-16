package Classwork.Tree;

public class Main {
    public static void main(String[] args) {
        int[] values = {10, 5, 15, 3, 7, 12, 18};

        Left left = new Left();
        left.buildTree(values);
        left.traversalTree();

        Right right = new Right();
        right.buildTree(values);
        right.traversalTree();

        Medium medium = new Medium();
        medium.buildTree(values);
        medium.traversalTree();

    }
}
