package buoi08;

public class Main {
    public static void main(String[] args) {
//        TreeNode root = new TreeNode(99);
//       System.out.println("Before: " + root);        TreeNode node1 = new TreeNode(64);
//       TreeNode node2 = new TreeNode(123);
//        TreeNode node3 = new TreeNode(56);
//       TreeNode node4 = new TreeNode(789);
//       root.setLeftChild(node1);
//       root.setRightChild(node2);
//        node1.setLeftChild(node3);
//        node2.setRightChild(node4);
//       System.out.println("After: " + root);
//       System.out.println("NOde 2: " + node2);
//       System.out.println("Node 1: " + node1);
         //Day la bai toan tao Cay bang thu cong
        Tree tree = new Tree();
        tree.insert(99);
        tree.insert(64);
        tree.insert(123);
        tree.insert(56);
        tree.insert(789);
        tree.traverseInOrder();
    }
}
