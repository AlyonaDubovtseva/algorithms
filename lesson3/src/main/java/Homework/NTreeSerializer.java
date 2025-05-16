package Homework;

public class NTreeSerializer {
    public static String serialize(NTreeNode root) {
        if (root == null) {
            return "NULL";
        }
        String childrenStr = "";
        for (NTreeNode child : root.children) {
            if (!childrenStr.isEmpty()) {
                childrenStr += ", ";
            }
            childrenStr += serialize(child);
        }
        if (childrenStr.isEmpty()) {
            return "(" + root.val + ", NULL)";
        }
        return "(" + root.val + ", " + childrenStr + ")";
    }

    public static void main(String[] args) {
        NTreeNode root = new NTreeNode(1);
        NTreeNode node2 = new NTreeNode(2);
        NTreeNode node3 = new NTreeNode(3);
        NTreeNode node4 = new NTreeNode(4);
        NTreeNode node5 = new NTreeNode(5);
        NTreeNode node6 = new NTreeNode(6);
        NTreeNode node7 = new NTreeNode(7);
        NTreeNode node8 = new NTreeNode(8);
        NTreeNode node9 = new NTreeNode(9);
        root.addChild(node2);
        root.addChild(node3);
        root.addChild(node4);
        node2.addChild(node5);
        node2.addChild(node6);
        node4.addChild(node7);
        node4.addChild(node8);
        node4.addChild(node9);

        System.out.println(serialize(root));
    }
}
