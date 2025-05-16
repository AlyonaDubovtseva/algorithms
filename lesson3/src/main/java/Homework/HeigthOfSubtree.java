package Homework;
//**Высота поддерева**
//Для каждого узла двоичного дерева найти высоту поддерева, с корнем в заданном узле.
//
//**Требования:**
//- Реализовать рекурсивное решение
//- Сложность: O(n)
public class HeigthOfSubtree {
    public static int subtreeHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = subtreeHeight(root.left);
        int rightHeight = subtreeHeight(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("высота поддерева с корнем 4: " + subtreeHeight(root.left.left));
    }

}
